package kiv.signal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * 
 * @author Stebetak, Vanek
 *
 */
public class VhdrReader {

	protected HashMap<String, HashMap<String, String>> properties;
	protected List<ChannelInfo> channels;
	protected HashMap<String, EEGMarker> markers;
	//edited
	protected List<AmplifierInfo> amplifier;
	protected List<ImpedanceInfo> impedance;

	public VhdrReader() {
		properties = new HashMap<String, HashMap<String, String>>();
		channels = new ArrayList<ChannelInfo>();
		markers = new HashMap<String, EEGMarker>();
		//edited
		amplifier = new ArrayList<AmplifierInfo>();
		impedance = new ArrayList<ImpedanceInfo>();
	}

	public void readVhdr(byte[] bytes) {
		properties.clear();
		channels.clear();
		amplifier.clear();
		impedance.clear();
		String vhdrIn = "";
		for (int i = 0; i < bytes.length; i++) {
			vhdrIn = vhdrIn + "" + ((char) (bytes[i] & 0xFF));
		}
		String[] lines = vhdrIn.split("\n");
		readCommonInfos(lines);
		loadChannelInfo();
		//edited
		loadAmplifierSetup(lines);
		loadElectrodeImpedance(lines);
		
	}

	public void readVmrk(byte[] bytes) {
		markers.clear();
		String vmrkIn = "";
		for (int i = 0; i < bytes.length; i++) {
			vmrkIn = vmrkIn + "" + ((char) (bytes[i] & 0xFF));
		}
		String[] lines = vmrkIn.split("\n");

		readMarkersInfos(lines);
	}

	private void readMarkersInfos(String[] lines) {
		int index;
		for (index = 0; index < lines.length; index++) {
			if (lines[index].contains("Marker Infos")) {
				break;
			}
		}
		for (int i = index + 1; i < lines.length; i++) {
			if (!(lines[i].startsWith(";"))) {
				String[] arr = lines[i].split("[=]");
				String[] par = arr[1].split("[,]");

				if (par[0].equals("Stimulus")) {
					EEGMarker marker = new EEGMarker();
					marker.setName(arr[0]);
					marker.setStimulus(par[1]);
					marker.setPosition(Integer.parseInt(par[2]));

					markers.put(arr[0], marker.clone());
				}
			}
		}

	}
/**
 * edited
 * @param lines
 */
	private void readCommonInfos(String[] lines) {
		properties.put("CI", readInfo(lines, "Common Infos"));
		properties.put("BI", readInfo(lines, "Binary Infos"));
		properties.put("CH", readInfo(lines, "Channel Infos"));
	}
	private void loadChannelInfo() {
		int channelCnt = Integer.parseInt(properties.get("CI").get(
				"NumberOfChannels"));
		for (int i = 1; i <= channelCnt; i++) {
			channels.add(new ChannelInfo(i, properties.get("CH").get("Ch" + i)));
		}

	}
	

	private HashMap<String, String> readInfo(String[] lines, String beginLine) {
		HashMap<String, String> info = new HashMap<String, String>();
		int index;
		for (index = 0; index < lines.length; index++) {
			if (lines[index].contains(beginLine)) {
				break;
			}
		}
		for (int i = index + 1; i < lines.length; i++) {
			if (!(lines[i].startsWith(";"))) {
				if (lines[i].trim().equals("")) {
					break;
				}
				String[] arr = lines[i].trim().split("[=]");
				info.put(arr[0], arr[1]);
			}

		}
		return info;
	}

	public HashMap<String, HashMap<String, String>> getProperties() {
		return properties;
	}

	public List<ChannelInfo> getChannels() {
		return channels;
	}

	public HashMap<String, EEGMarker> getMarkers() {
		return markers;
	}

	public int NumberOfChannels() {
		return getNumberOfChannels();
	}
	/**
	 * edited
	 */
	public List<AmplifierInfo> getAmplifierSetup(){
		return amplifier;
	}
	/**
	 * edited
	 * @param lines  the file splited in lines
	 */
	private void loadAmplifierSetup(String[] lines ){
		int index;
		int amplstart=0;
		for (index = 0; index < lines.length; index++) {
			if (lines[index].contains("#")){
				amplstart=index;
				break;
				}
			}
		amplstart++;
		for (int i = 0; i < getNumberOfChannels(); i++) {
			amplifier.add(new AmplifierInfo(lines[amplstart]));
			amplstart++;
		}		
	}
	/**
	 * edited
	 * @return list with electrode impedances from vhdr
	 */
	public List<ImpedanceInfo> getImapdanceInfo(){
		return impedance;
	}
	/**
	 * edited
	 * @param lines the file splited in lines
	 */
	private void loadElectrodeImpedance(String[] lines){
		int index;
		int amplstart =0;
		for (index = 0; index < lines.length; index++) {
			if (lines[index].contains("Impedance [kOhm]")){
				amplstart=index;
				amplstart++;
				break;
				}
		}
		for (int i = amplstart; i < lines.length; i++) {
			impedance.add(new ImpedanceInfo(lines[i]));
		}		
	}
	
	/**
	 * returns property of number of channels 
	 * @return int number of channels from vhdr
	 */
	private int getNumberOfChannels() {
		return Integer.parseInt(properties.get("CI").get("NumberOfChannels"));
	}
	/**
	 * returns property of sampling interval 
	 * @return sampling interval as string
	 */
	public String getSamplingInterval(){
		return properties.get("CI").get("SamplingInterval");
	}
	
	public String getSamplingRate(){
		return properties.get("CO").get("Sampling Rate");
	}
}
