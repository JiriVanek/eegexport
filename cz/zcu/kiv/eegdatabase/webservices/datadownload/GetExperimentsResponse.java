
package cz.zcu.kiv.eegdatabase.webservices.datadownload;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getExperimentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getExperimentsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}experimentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getExperimentsResponse", propOrder = {
    "_return"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
public class GetExperimentsResponse {

    @XmlElement(name = "return")
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<ExperimentInfo> _return;

    /**
     * Gets the value of the return property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the return property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<ExperimentInfo> getReturn() {
        if (_return == null) {
            _return = new ArrayList<ExperimentInfo>();
        }
        return this._return;
    }

}
