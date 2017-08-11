package hdf5;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import support.MetadataLoader;
import kiv.signal.ChannelInfo;
import kiv.signal.DataTransformer;
import kiv.signal.EEGDataTransformer;
import kiv.signal.EEGMarker;
import kiv.signal.ImpedanceInfo;
import ncsa.hdf.hdf5lib.exceptions.HDF5Exception;
import ncsa.hdf.hdf5lib.exceptions.HDF5LibraryException;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
/**
 * hdf5 export class
 * @author vanek2
 *
 */
public class Export {

	protected DataTransformer transformer = new EEGDataTransformer();
	protected List<ChannelInfo> list;
	protected HDF5file hdf = null;

	/**
	 * exports raw data from Brain Vision format and metadata to hdf5 file
	 * 
	 * @param headerFile brain vision vhdr file
	 * @param dataFile brain vision eeg file
	 * @param stimuliFile brain vision vmrk file
	 * @param filename hdf5 export filename
	 * @param path path for hdf5 export file
	 * @param experiment number of experiment in the EEGBase portal
	 * @throws IOException
	 * @throws NullPointerException
	 * @throws HDF5Exception
	 */
	public void hdfFile(String headerFile, String dataFile, String stimuliFile,
			String filename, String path, int experiment, int chunkSize)
			throws IOException, NullPointerException, HDF5Exception {
		transformer.NumberOfChannels(headerFile);
		list = transformer.getChannelInfo();
		try {
			hdf = new HDF5file(filename, path, transformer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sampling = transformer.SamplingInterval();
		writeData(headerFile, dataFile, chunkSize, sampling);
		list = null;
		Multimap<String, Integer> typeSt = ArrayListMultimap.create();
		HashMap<String, EEGMarker> stimuli = transformer
				.readMarkers(stimuliFile);
		for (HashMap.Entry<String, EEGMarker> entry : stimuli.entrySet()) {
			typeSt.put(entry.getValue().getStimulus(), entry.getValue()
					.getPosition());
		}
		stimuli = null;
		System.gc();
		try {
			hdf.WriteStimuli(typeSt);
		} catch (NullPointerException | HDF5Exception e1) {
			e1.printStackTrace();
		}
		typeSt = null;
		List<ImpedanceInfo> list = transformer.getImepadanceInfo();
		hdf.writeMetadata(new MetadataLoader(transformer, experiment));
		try {
			hdf.CloseHDF();
		} catch (HDF5LibraryException e) {
			e.printStackTrace();
		}
	}

	/**
	 * exports raw data from Brain Vision format to hdf5 file - without metadata
	 * 
	* @param headerFile brain vision vhdr file
	 * @param dataFile brain vision eeg file
	 * @param stimuliFile brain vision vmrk file
	 * @param filename hdf5 export filename
	 * @param path path for hdf5 export file
	 * @throws IOException
	 */
	public void hdfFilWithoutMeta(String headerFile, String dataFile,
			String stimuliFile, String filename, String path, int chunkSize)
			throws IOException {
		transformer.NumberOfChannels(headerFile);
		list = transformer.getChannelInfo();
		try {
			hdf = new HDF5file(filename, path, transformer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sampling = transformer.SamplingInterval();
		writeData(headerFile, dataFile, chunkSize, sampling);
		list = null;
		Multimap<String, Integer> typeSt = ArrayListMultimap.create();
		HashMap<String, EEGMarker> stimuli = transformer
				.readMarkers(stimuliFile);
		for (HashMap.Entry<String, EEGMarker> entry : stimuli.entrySet()) {
			typeSt.put(entry.getValue().getStimulus(), entry.getValue()
					.getPosition());
		}
		stimuli = null;
		System.gc();
		try {
			hdf.WriteStimuli(typeSt);
		} catch (NullPointerException | HDF5Exception e1) {
			e1.printStackTrace();
		}
		typeSt = null;
		try {
			hdf.CloseHDF();
		} catch (HDF5LibraryException e) {
			e.printStackTrace();
		}

	}

	/**
	 * exports raw data from Brain Vision format to hdf5 file - without metadata
	 * and stimuli
	 * 
	 * @param headerFile brain vision vhdr file
	 * @param dataFile brain vision eeg file
	 * @param filename hdf5 export filename
	 * @param path path for hdf5 export file
	 * @throws IOException
	 */
	public void hdfFilWithoutMetaStimuli(String headerFile, String dataFile,
			String filename, String path, int chunkSize) throws IOException {
		transformer.NumberOfChannels(headerFile);
		list = transformer.getChannelInfo();
		try {
			hdf = new HDF5file(filename, path, transformer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sampling = transformer.SamplingInterval();
		writeData(headerFile, dataFile, chunkSize, sampling);
		list = null;
		System.gc();
		try {
			hdf.CloseHDF();
		} catch (HDF5LibraryException e) {
			e.printStackTrace();
		}
	}

	/**
	 * exports raw data from Brain Vision format to hdf5 file - without stimuli
	 * 
* @param headerFile brain vision vhdr file
	 * @param dataFile brain vision eeg file
	 * @param filename hdf5 export filename
	 * @param path path for hdf5 export file
	 * @param experiment ID number of experiment in the EEGBase portal
	 * @throws IOException
	 * @throws NullPointerException
	 * @throws HDF5Exception
	 */
	public void hdfFileWithoutStimuli(String headerFile, String dataFile,
			String filename, String path, int experiment, int chunkSize)
			throws IOException, NullPointerException, HDF5Exception {
		transformer.NumberOfChannels(headerFile);
		list = transformer.getChannelInfo();
		try {
			hdf = new HDF5file(filename, path, transformer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sampling = transformer.SamplingInterval();
		writeData(headerFile, dataFile, chunkSize, sampling);
		list = null;
		System.gc();
		hdf.writeMetadata(new MetadataLoader(transformer, experiment));
		try {
			hdf.CloseHDF();
		} catch (HDF5LibraryException e) {
			e.printStackTrace();
		}
	}

	/**
	 * NOT WORKING This method exports raw data from files saved in EEGBase
	 * portal but currently is not working
	 * 
	  * @param filename hdf5 export filename
	 * @param path path for hdf5 export file
	 * @param experimentID number of experiment in the EEGBase portal
	 * @throws IOException
	 * @throws NullPointerException
	 * @throws HDF5Exception
	 */
	public void hdfFileWs(String filename, String path, int experimentID,
			int chunkSize) throws IOException, NullPointerException,
			HDF5Exception {
		//TODO webservices not working yet
		/*
		 * transformer.NumberOfChannels(""); List<ChannelInfo> list =
		 * transformer.getChannelInfo(); try { hdf = new HDF5file(filename,
		 * path, transformer); } catch (Exception e) { e.printStackTrace(); }
		 * String sampling = transformer.SamplingInterval(); for (int j = 1; j <
		 * list.size(); j++) { try { hdf.WriteDataGzip(list.get(j),
		 * transformer.readBinaryData("", "", j), sampling,chunkSize); 
		 * doplnit steamy z WS } catch (Exception e) { e.printStackTrace(); }
		 * System.gc(); } list = null; System.gc(); hdf.writeMetadata(new
		 * MetadataLoader(transformer, 0)); try { hdf.CloseHDF(); } catch
		 * (HDF5LibraryException e) { e.printStackTrace(); }
		 */
	}
/**
 * method for saving data into hdf5 container
 * @param headerFile brain vision vhdr file
 * @param dataFile brain vision eeg file
 * @param chunkSize amount of compression chunk - bigger chunk - bigger compression
 * @param sampling sampling rate of recording
 */
	private void writeData(String headerFile, String dataFile, int chunkSize,
			String sampling) {
		if (chunkSize > 1) {
			for (int j = 1; j < list.size(); j++) {
				try {
					hdf.WriteDataGzip(
							list.get(j),
							transformer.readBinaryData(headerFile, dataFile, j),
							sampling, chunkSize);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.gc();
			}
		} else {
			for (int j = 1; j < list.size(); j++) {
				try {
					hdf.WriteData(
							list.get(j),
							transformer.readBinaryData(headerFile, dataFile, j),
							sampling);
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.gc();
			}
		}
	}
}
