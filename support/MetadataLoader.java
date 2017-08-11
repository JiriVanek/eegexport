package support;

import java.util.List;

import kiv.signal.AmplifierInfo;
import kiv.signal.DataTransformer;
import kiv.signal.ImpedanceInfo;
import ws.EDEDClient;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentMetadata;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService;
import cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo;

/**
 * provides metadata from vhdr file of web serivce
 * 
 * @author Vanek
 *
 */
public class MetadataLoader {
	private final static String USER = "vanek2@rti.zcu.cz";
	private final static String PASS = "6RY45MFVDQF5Qp";
	private final static String END = "http://eeg2.kiv.zcu.cz:8080/webservice/UserDataService?wsdl";
	private DataTransformer transformer;
	private final int experimentId;
	private EDEDClient client;
	private UserDataService service;
/**
 * constructor
 * @param tr datatransformer for metadata load
 * @param experimentId ID of experiment in the EEGBase portal fro WS load
 */
	public MetadataLoader(DataTransformer tr, int experimentId) {
		this.client = new EDEDClient();
		this.experimentId = experimentId;
		try {
			client.userLogIn(USER, PASS, END);
			service = client.getService();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.transformer = tr;
	}
	
	public List<ImpedanceInfo> getImpedance(){
		return transformer.getImepadanceInfo();
	}

	public PersonInfo getPerson(int id) {
		List<PersonInfo> people = service.getPeople();
		return people.get(id);
	}

	public HardwareInfo getHwInfo(int id) {
		List<HardwareInfo> hardware = service.getHardware();
		return hardware.get(id);
	}

	public WeatherInfo getWeather(int id) {
		List<WeatherInfo> weather = service.getWeather();
		return weather.get(id);
	}

	public ExperimentMetadata getExperiment() {
		return service.getExperimentsMetadata(experimentId);
	}

	public List<ImpedanceInfo> getElectrodes() {
		return transformer.getImepadanceInfo();
	}

	public List<AmplifierInfo> getAmplifierInfo() {
		return transformer.getAmplifier();
	}

}
