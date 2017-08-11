package kiv.signal;

import support.odML;
/**
 * class for storing impedance info loaded from vhdr
 * @author Vanek
 *
 */
public class ImpedanceInfo {
protected String name;
protected String usage;
protected int impedance;

/**
 * constructor
 * @param line line of vhdr file with impedance info
 */
ImpedanceInfo(String line){
	String[] splited = line.split("\\s+");
	String name=splited[0].replace(":", "");
	try {
		impedance= Integer.parseInt(splited[1]);		
	} catch (Exception e) {
		impedance=-1;
	}
	if(name.equalsIgnoreCase("ref")) this.usage=odML.REFERENCE;
	else
	if(name.equalsIgnoreCase("gnd")) this.usage=odML.GROUND;
	else this.usage=odML.CHANNEL;
	this.name=name;
}

public String getName() {
	return name;
}

public String getUsage() {
	return usage;
}

public int getImpedance() {
	return impedance;
}

}
