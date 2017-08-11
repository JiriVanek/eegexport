
package cz.zcu.kiv.eegdatabase.webservices.datadownload;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOfUpdateWeather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOfUpdateWeather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}weatherInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOfUpdateWeather", propOrder = {
    "arg0"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
public class AddOfUpdateWeather {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected WeatherInfo arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public WeatherInfo getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setArg0(WeatherInfo value) {
        this.arg0 = value;
    }

}
