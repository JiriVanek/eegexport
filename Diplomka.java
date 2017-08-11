import hdf5.Export;

import java.io.IOException;

import ncsa.hdf.hdf5lib.exceptions.HDF5Exception;
/**
 * class for testing
 * @author vanek2
 *
 */
public class Diplomka {

	private final static String USER = "vanek2@rti.zcu.cz";
	private final static String PASS = "6RY45MFVDQF5Qp";
	private final static String END = "http://eeg2.kiv.zcu.cz:8080/webservice/UserDataService?wsdl";
	/*
	static String headerFile = "E:\\!skola\\diplomka\\stimulation\\data_mereni\\10-6_driver.vhdr";
	static String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\data_mereni\\10-6_driver.vmrk";
	static String dataFile = "E:\\!skola\\diplomka\\stimulation\\data_mereni\\10-6_driver.eeg";
	  static String headerFile = "E:\\!skola\\diplomka\\stimulation\\Data\\11_01_120041.vhdr"; 
	  static  String dataFile =  "E:\\!skola\\diplomka\\stimulation\\Data\\11_01_120041.eeg"; 
	  static  String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\Data\\11_01_120041.vmrk";
	 
	 static String headerFile = "E:\\!skola\\diplomka\\stimulation\\divis\\08-Divis.vhdr"; 
	 static String dataFile = "E:\\!skola\\diplomka\\stimulation\\divis\\08-Divis.eeg";
	 static String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\divis\\08-Divis.vmrk";
	 
	  static String headerFile = "E:\\!skola\\diplomka\\stimulation\\it\\lt.vhdr"; 
	  static String dataFile = "E:\\!skola\\diplomka\\stimulation\\it\\lt.eeg"; 
	  static String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\it\\lt.vmrk"; 
	  
	 static  String headerFile = "E:\\!skola\\diplomka\\stimulation\\06\\06.vhdr";
	  static String dataFile = "E:\\!skola\\diplomka\\stimulation\\06\\06.eeg";
	  static String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\06\\06.vmrk";
	 */
	/*
	  static String  headerFile = "E:\\!skola\\diplomka\\stimulation\\05\\05.vhdr"; static
	  String dataFile = "E:\\!skola\\diplomka\\stimulation\\05\\05.eeg"; static
	  String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\05\\05.vmrk";
	 */
	  
	  static String headerFile =  "E:\\!skola\\diplomka\\stimulation\\led\\LED_20_10_2011_66.vhdr"; static
	  String dataFile =  "E:\\!skola\\diplomka\\stimulation\\led\\LED_20_10_2011_66.eeg"; static
	  String stimuliFile = "E:\\!skola\\diplomka\\stimulation\\led\\LED_20_10_2011_66.vmrk";
	 
	static String filename = "hdfsoubor.h5";
	static String path = "E:\\temp\\";

	public static void main(String[] args) {
		
		//callWebService();
		
		try { hdfFile(headerFile,dataFile,stimuliFile,filename,path,10);
		 
		  } catch (IOException e) { e.printStackTrace(); }		 	
	}
	

	public static void hdfFile(String headerFile, String dataFile,
			String stimuliFile, String filename, String path, int experiment)
			throws IOException {
		long startTime = System.currentTimeMillis();
		Export export = new Export();
		try {
			/*export.hdfFilWithoutMeta(headerFile, dataFile, stimuliFile, "64", path, 64);
			export.hdfFilWithoutMeta(headerFile, dataFile, stimuliFile, "512", path, 512);
			export.hdfFilWithoutMeta(headerFile, dataFile, stimuliFile, "1024", path, 1024);*/
			export.hdfFile(headerFile, dataFile, stimuliFile, filename, path, experiment, 256);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("cas vytvoreni: " + (endTime - startTime));
	}

}
