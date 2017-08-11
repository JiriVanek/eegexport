
package cz.zcu.kiv.eegdatabase.webservices.datadownload;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experimentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="added" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="digitizationInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}digitizationInfo" minOccurs="0"/>
 *         &lt;element name="endTimeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="experimentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hwIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="privateFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="researchGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scenarioId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startTimeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="subjectGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subjectPersonId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weatherId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weatherNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentInfo", propOrder = {
    "added",
    "changed",
    "digitizationInfo",
    "endTimeInMillis",
    "experimentId",
    "hwIds",
    "ownerId",
    "privateFlag",
    "researchGroupId",
    "scenarioId",
    "startTimeInMillis",
    "subjectGroupId",
    "subjectPersonId",
    "temperature",
    "title",
    "weatherId",
    "weatherNote"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
public class ExperimentInfo {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected boolean added;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected boolean changed;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected DigitizationInfo digitizationInfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected long endTimeInMillis;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int experimentId;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<Integer> hwIds;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int ownerId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int privateFlag;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int researchGroupId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int scenarioId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected long startTimeInMillis;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int subjectGroupId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int subjectPersonId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int temperature;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected String title;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected int weatherId;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected String weatherNote;

    /**
     * Gets the value of the added property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public boolean isAdded() {
        return added;
    }

    /**
     * Sets the value of the added property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setAdded(boolean value) {
        this.added = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public boolean isChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setChanged(boolean value) {
        this.changed = value;
    }

    /**
     * Gets the value of the digitizationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DigitizationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public DigitizationInfo getDigitizationInfo() {
        return digitizationInfo;
    }

    /**
     * Sets the value of the digitizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitizationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setDigitizationInfo(DigitizationInfo value) {
        this.digitizationInfo = value;
    }

    /**
     * Gets the value of the endTimeInMillis property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public long getEndTimeInMillis() {
        return endTimeInMillis;
    }

    /**
     * Sets the value of the endTimeInMillis property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setEndTimeInMillis(long value) {
        this.endTimeInMillis = value;
    }

    /**
     * Gets the value of the experimentId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getExperimentId() {
        return experimentId;
    }

    /**
     * Sets the value of the experimentId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setExperimentId(int value) {
        this.experimentId = value;
    }

    /**
     * Gets the value of the hwIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hwIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHwIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<Integer> getHwIds() {
        if (hwIds == null) {
            hwIds = new ArrayList<Integer>();
        }
        return this.hwIds;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setOwnerId(int value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the privateFlag property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getPrivateFlag() {
        return privateFlag;
    }

    /**
     * Sets the value of the privateFlag property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setPrivateFlag(int value) {
        this.privateFlag = value;
    }

    /**
     * Gets the value of the researchGroupId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getResearchGroupId() {
        return researchGroupId;
    }

    /**
     * Sets the value of the researchGroupId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setResearchGroupId(int value) {
        this.researchGroupId = value;
    }

    /**
     * Gets the value of the scenarioId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getScenarioId() {
        return scenarioId;
    }

    /**
     * Sets the value of the scenarioId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setScenarioId(int value) {
        this.scenarioId = value;
    }

    /**
     * Gets the value of the startTimeInMillis property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public long getStartTimeInMillis() {
        return startTimeInMillis;
    }

    /**
     * Sets the value of the startTimeInMillis property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setStartTimeInMillis(long value) {
        this.startTimeInMillis = value;
    }

    /**
     * Gets the value of the subjectGroupId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getSubjectGroupId() {
        return subjectGroupId;
    }

    /**
     * Sets the value of the subjectGroupId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setSubjectGroupId(int value) {
        this.subjectGroupId = value;
    }

    /**
     * Gets the value of the subjectPersonId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getSubjectPersonId() {
        return subjectPersonId;
    }

    /**
     * Sets the value of the subjectPersonId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setSubjectPersonId(int value) {
        this.subjectPersonId = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setTemperature(int value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the weatherId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public int getWeatherId() {
        return weatherId;
    }

    /**
     * Sets the value of the weatherId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setWeatherId(int value) {
        this.weatherId = value;
    }

    /**
     * Gets the value of the weatherNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public String getWeatherNote() {
        return weatherNote;
    }

    /**
     * Sets the value of the weatherNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setWeatherNote(String value) {
        this.weatherNote = value;
    }

}
