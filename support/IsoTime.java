package support;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Clas for ISO Date distribution
 * 
 * @author Vanek
 * 
 */
public class IsoTime {

	/**
	 * return current Date and time in ISO8601 format
	 * 
	 * @return string of Date and time in ISO8601
	 */
	public static String getISODate() {
		DateTime dt = new DateTime();
		DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
		return fmt.print(dt);
	}
	/**
	 * converts time in miliseconds to Date in ISO8601 format
	 * @param milis time
	 * @return string time in ISO format
	 */
	public static String convertDateToISO(long milis){
		DateTimeFormatter fmt = ISODateTimeFormat.date();
		return fmt.print(milis);
	}
	/**
	 * converts date and time in miliseconds to ISO8601 format 
	 * @param milis time
	 * @return date and time in ISO firmat
	 */
	public static String convertDateTimeToISO(long milis){
		DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
		return fmt.print(milis);
	}
	/**
	 * converts time in miliseconds to ISO8601 format 
	 * @param milis time
	 * @return time in ISO firmat
	 */
	public static String convertTimeToISO(long milis){
		DateTimeFormatter fmt = ISODateTimeFormat.time();
		return fmt.print(milis);
	}
}
