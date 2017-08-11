package hdf5;

import java.util.List;

import kiv.signal.ImpedanceInfo;
import ncsa.hdf.hdf5lib.H5;
import ncsa.hdf.hdf5lib.HDF5Constants;
import ncsa.hdf.hdf5lib.exceptions.HDF5Exception;
import ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException;
import support.IsoTime;
import support.MetadataLoader;
import support.odML;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.DigitizationInfo;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentMetadata;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.SoftwareInfo;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo;
/**
 * writes metadata into hdf5 file
 * @author Vanek
 *
 */
public class MetadataWriter {
	/**
	 * HDF5 file 
	 */
	private HDF5file hdf5file;
	/**
	 * metadata loader
	 */
	private MetadataLoader loader;

	public MetadataWriter(HDF5file hdf, MetadataLoader tr) {
		this.hdf5file = hdf;
		loader = tr;
	}
/**
 * writes project metadata into hdf5 file
 * @throws NullPointerException
 * @throws HDF5Exception
 */
	public void AddProject() throws NullPointerException, HDF5Exception {
		ExperimentMetadata experimentMeta = loader.getExperiment();
		ExperimentInfo experiment = experimentMeta.getExperimentInfo();
		int group = -1;
		int project_id = -1;
		group = H5.H5Gopen(hdf5file.getFile(), odML.METADATA,
				HDF5Constants.H5P_DEFAULT);
		project_id = H5.H5Gcreate(group, odML.PROJECT,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		AddPerson(project_id, loader.getPerson(experiment.getOwnerId()),
				odML.PRINCIPLEINVESTIGATOR);
		AddExperiment(project_id, experimentMeta);
		if (group > 0)
			H5.H5Gclose(group);
		if (project_id > 0)
			H5.H5Gclose(project_id);
	}
/**
 * writes person information in hdf5
 * @param location location of person group in hdf5
 * @param person person infor from WS
 * @param role role of person
 * @throws HDF5LibraryException
 * @throws NullPointerException
 */
	private void AddPerson(int location, PersonInfo person, String role)
			throws HDF5LibraryException, NullPointerException {
		if (location < 0)
			return;
		int personid = -1;
		if (person == null)
			return;
		personid = H5.H5Gcreate(location,
				odML.PERSON + "_" + person.getPersonId(),
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		SaveAttributeString(personid, person.getGivenName(), odML.FIRSTNAME);
		SaveAttributeString(personid, person.getSurname(), odML.LASTNAME);
		SaveAttributeString(personid, person.getEducationalLevel(),
				odML.EDUCATION);
		SaveAttributeString(personid, role, odML.ROLE);
		// TODO gender int?
		if (personid > 0)
			H5.H5Gclose(personid);
	}
/**
 * writes experiment information into hdf5 file
 * @param location location of experiment group in hdf5
 * @param expMeta experiment metadata from WS
 * @throws NullPointerException
 * @throws HDF5Exception
 */
	private void AddExperiment(int location, ExperimentMetadata expMeta)
			throws NullPointerException, HDF5Exception {
		if (location < 0)
			return;
		ExperimentInfo experiment = expMeta.getExperimentInfo();
		int experiment_id = -1;
		experiment_id = H5.H5Gcreate(location, odML.EXPERIMENT,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		SaveAttributeString(experiment_id,
				Integer.toString(experiment.getExperimentId()), odML.PROJECTID);
		SaveAttributeString(experiment_id, odML.EXTYPEEPS, odML.TYPE);
		AddRecording(experiment_id, expMeta);
		
		PersonInfo subject = expMeta.getSubjectPerson();

		AddSubject(experiment_id, subject);
		if (experiment_id > 0)
			H5.H5Gclose(experiment_id);
	}
/**
 * writes subject information into hdf5 file
 * @param location location of subject group in hdf5
 * @param person personInfo from WS
 * @throws HDF5LibraryException
 * @throws NullPointerException
 */
	private void AddSubject(int location, PersonInfo person)
			throws HDF5LibraryException, NullPointerException {
		AddPerson(location, person, odML.SUBJECT);

	}
/**
 * writes recording information into hdf5 file
 * @param location location of recording group in hdf5
 * @param expMeta experiment metadatainformation from ws
 * @throws NullPointerException
 * @throws HDF5Exception
 */
	private void AddRecording(int location, ExperimentMetadata expMeta)
			throws NullPointerException, HDF5Exception {
		int recording_id = -1;
		ExperimentInfo experiment = expMeta.getExperimentInfo();
		recording_id = H5.H5Gcreate(location, odML.RECORDING,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		SaveAttributeString(
				recording_id,
				IsoTime.convertDateTimeToISO(experiment.getStartTimeInMillis()),
				odML.START);
		SaveAttributeString(recording_id,
				IsoTime.convertDateTimeToISO(experiment.getEndTimeInMillis()),
				odML.END);
		AddHw(recording_id, experiment);
		AddEnvironment(recording_id, expMeta);
		AddElectrode(recording_id);
		// TODO
		if (recording_id > 0)
			H5.H5Gclose(recording_id);
	}
/**
 * writes hardware information into hdf5 file
 * @param location location of hardware group in hdf5
 * @param experiment metadatainformation from ws
 * @throws NullPointerException
 * @throws HDF5Exception
 */
	private void AddHw(int location, ExperimentInfo experiment)
			throws NullPointerException, HDF5Exception {
		int hw_id = -1;
		hw_id = H5.H5Gcreate(location, odML.HARDWARE,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		AddHwAmplifier(hw_id, experiment.getDigitizationInfo());
		List<Integer> hw = experiment.getHwIds();
		for (Integer integer : hw) {
			HardwareInfo hardw = loader.getHwInfo(integer);
			AddGeneralHW(hw_id, hardw);
		}
		//TODO
		if (hw_id > 0)
			H5.H5Gclose(hw_id);
	}
/**
 * writes general hardware information into hdf5 file; stores HW into hardware group with name of hardware
 * @param location location of hardware group
 * @param hw hardware info from WS
 * @throws HDF5LibraryException
 * @throws NullPointerException
 */
	private void AddGeneralHW(int location, HardwareInfo hw)
			throws HDF5LibraryException, NullPointerException {
		int hw_id = -1;
		hw_id = H5.H5Gcreate(location, hw.getTitle(),
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		SaveAttributeString(hw_id, hw.getType(), odML.TYPE);
		SaveAttributeString(hw_id, hw.getDescription(), odML.DESCRIPTION);

		if (hw_id > 0)
			H5.H5Gclose(hw_id);

	}
	
/**
 * writes amplifier information into hdf5 file
 * @param location location of amplifer group
 * @param digi amplifer information
 * @throws NullPointerException
 * @throws HDF5Exception
 */
	private void AddHwAmplifier(int location, DigitizationInfo digi)
			throws NullPointerException, HDF5Exception {
		int amplifier_id = -1;
		int attribute_id =-1, dataspace_id = -1;
		amplifier_id = H5.H5Gcreate(location, odML.AMPLIFIER,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		if(digi!=null){
		long[] dims = { 1 };
		float[] gain = new float[1];
		gain[0] = digi.getGain();
		dataspace_id = H5.H5Screate_simple(1, dims, null);
		attribute_id = H5.H5Acreate(amplifier_id, odML.GAIN,
				HDF5Constants.H5T_IEEE_F32LE, dataspace_id,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT);
		}
		if (dataspace_id > 0)
			H5.H5Sclose(dataspace_id);
		if (attribute_id > 0)
			H5.H5Aclose(attribute_id);
		if (amplifier_id > 0)
			H5.H5Gclose(amplifier_id);
	}

	private void AddEnvironment(int location, ExperimentMetadata exp)
			throws HDF5LibraryException, NullPointerException {
		int environment_id = -1;
		environment_id = H5.H5Gcreate(location, odML.ENVIRONMENT,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		ExperimentInfo info = exp.getExperimentInfo();
		WeatherInfo weather = exp.getWeatherInfo();
		SaveAttributeString(environment_id,
				Integer.toString(info.getTemperature()), odML.TEMPERATURE);
		SaveAttributeString(environment_id, weather.getTitle(), odML.WEATHER);
		SaveAttributeString(environment_id, weather.getDescription(),
				odML.DESCRIPTION);
		if (environment_id > 0)
			H5.H5Gclose(environment_id);
	}

	private void AddElectrode(int location) throws HDF5LibraryException, NullPointerException {
		int electrode_id = -1;
		electrode_id = H5.H5Gcreate(location, odML.ELECTRODE,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		List<ImpedanceInfo> listI =loader.getImpedance();
		for (ImpedanceInfo impedanceInfo : listI) {
			int electrode = H5.H5Gcreate(electrode_id, impedanceInfo.getName(),
					HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
					HDF5Constants.H5P_DEFAULT);
			SaveAttributeString(electrode, impedanceInfo.getUsage(), odML.TYPE);
			SaveAttributeString(electrode, Integer.toString(impedanceInfo.getImpedance()), odML.IMPEDANCE);
				H5.H5Gclose(electrode);
		}
		if (electrode_id > 0)
			H5.H5Gclose(electrode_id);		
	}

	private void AddAnalysis() {
	}

	private void AddDataset() {
	}

	private void AddEvent() {
	}

	private void AddEventList() {
	}

	private void AddExpBehavior() {
	}
	/*
	public void AddExperiment(ExperimentInfo experiment)
			throws NullPointerException, HDF5Exception {
		int group = -1;
		int experiment_id = -1;
		group = H5.H5Gopen(hdf5file.getFile(), odML.METADATA,
				HDF5Constants.H5P_DEFAULT);
		experiment_id = H5.H5Gcreate(group, odML.EXPERIMENT,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		SaveAttributeString(experiment_id,
				Integer.toString(experiment.getExperimentId()), odML.PROJECTID);
		SaveAttributeString(experiment_id, odML.EXTYPEEPS, odML.TYPE);
		AddRecording(experiment_id,experiment);
		if (group > 0)
			H5.H5Gclose(group);
		if (experiment_id > 0)
			H5.H5Gclose(experiment_id);
	}
	 */
	/*
	public void AddRecording(int location, ExperimentInfo experiment)
			throws NullPointerException, HDF5Exception {
		int recording_id = -1;
		recording_id = H5.H5Gcreate(location, odML.RECORDING,
				HDF5Constants.H5P_DEFAULT, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		AddHw(recording_id, experiment);
		if (recording_id > 0)
			H5.H5Gclose(recording_id);
	}
	 */

	private void AddExpElectrophysiology() {
	}

	private void AddExpImaging() {
	}

	private void AddExpPsychophysics() {
	}

	private void AddProtocol() {
	}

	private void AddHwDataAcquisition(DigitizationInfo acq,
			DigitizationInfo digi, HardwareInfo hw) {
	}

	private void AddHwFilter(DigitizationInfo filter) {
	}

	private void AddHwEyetracker(HardwareInfo hw) {
	}

	private void AddHwImageAcquisition(HardwareInfo hw) {
	}

	private void AddHwScaner(HardwareInfo hardware) {
	}

	private void AddSoftware(SoftwareInfo software) {
	}

	private void AddPerson(PersonInfo person) {
	}

	private void AddHwAttenuator() {
	}

	private void AddHwCameraObjective() {
	}

	private void AddHwStimulusIsolator() {
	}

	private void AddHwLightsource() {
	}

	private void AddHwMicroscopeObj() {
	}

	private void AddSetup() {
	}

	private void AddStimulus() {
	}

	private void AddStimDC() {
	}

	private void AddStimGabor() {
	}

	private void AddStimGrating() {
	}

	private void AddStimPulse() {
	}

	private void AddStimMovie() {
	}

	public void AddStimRamp() {
	}

	public void AddStimSawtooth() {
	}

	public void AddStimSinewave() {
	}

	public void AddStimSquarewave() {
	}

	public void AddStimWhiteNoise() {
	}

	public void AddStimAudio() {
	}

	public void AddStimImage() {
	}
/**
 * saves attribute into specified location
 * @param dataset_id location of attribute
 * @param savedString string value for save
 * @param HdfName name of saved string
 * @throws HDF5LibraryException
 * @throws NullPointerException
 */
	private void SaveAttributeString(int dataset_id, String savedString,
			String HdfName) throws HDF5LibraryException, NullPointerException {
		int attribute_space, attribute_id = -1;
		int stype = -1;
		attribute_space = H5.H5Screate(HDF5Constants.H5S_SCALAR);
		stype = H5.H5Tcopy(HDF5Constants.H5T_C_S1);
		H5.H5Tset_size(stype, savedString.length());
		attribute_id = H5.H5Acreate(dataset_id, HdfName, stype,
				attribute_space, HDF5Constants.H5P_DEFAULT,
				HDF5Constants.H5P_DEFAULT);
		H5.H5Awrite(attribute_id, stype, savedString.getBytes());
		if (attribute_space > -1)
			H5.H5Sclose(attribute_space);
		if (attribute_id > -1)
			H5.H5Aclose(attribute_id);
	}

}
