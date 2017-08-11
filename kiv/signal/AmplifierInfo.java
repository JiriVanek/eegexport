package kiv.signal;
/**
 * class for storing amplifier info
 * @author Vanek
 *
 */
public class AmplifierInfo {
protected int number;
protected String name;
protected int channel;
protected float resolution;
protected String resUnit;
protected String LowCutoff;
protected String HighCutoff;
protected String Notch;
/**
 * constructor
 * @param line line of vhdr file with amplifier info
 */
public AmplifierInfo(String line) {
	String[] splited = line.split("\\s+");
	this.number=Integer.parseInt(splited[0]);
	this.name=splited[1];
	this.channel=Integer.parseInt(splited[2]);
	this.resolution=Float.parseFloat(splited[3]);
	this.resUnit=splited[4];
	this.LowCutoff=splited[5];
	this.HighCutoff=splited[6];
	this.Notch=splited[7];
			
}

public int getNumber() {
	return number;
}
/**
 * 
 * @return channel name
 */
public String getName() {
	return name;
}
/**
 * 
 * @return channel number
 */
public int getChannel() {
	return channel;
}
/**
 * 
 * @return resolution in unit
 */
public float getResolution() {
	return resolution;
}
/**
 * 
 * @return unit of resolution
 */
public String getResUnit() {
	return resUnit;
}
/**
 * 
 * @return low cutoff [s]
 */
public String getLowCutoff() {
	return LowCutoff;
}
/**
 * 
 * @return high cutoff [Hz]
 */
public String getHighCutoff() {
	return HighCutoff;
}
/**
 * 
 * @return notch [Hz]
 */
public String getNotch() {
	return Notch;
}
	
}
