
package cz.zcu.kiv.eegdatabase.webservices.datadownload;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for experimentMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="experimentMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artifactInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}artifactInfo" minOccurs="0"/>
 *         &lt;element name="artifactRemoveMethodInfos" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}artifactRemoveMethodInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coexperimenters" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}personInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataFileInfos" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}dataFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="digitizationInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}digitizationInfo" minOccurs="0"/>
 *         &lt;element name="diseaseInfos" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}diseaseInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="experimentInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}experimentInfo" minOccurs="0"/>
 *         &lt;element name="hardwareInfos" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}hardwareInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pharmaceuticalInfos" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}pharmaceuticalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="projectTypeInfos" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}projectTypeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="researchGroupInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}researchGroupInfo" minOccurs="0"/>
 *         &lt;element name="scenarioInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}scenarioInfo" minOccurs="0"/>
 *         &lt;element name="softwareInfos" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}softwareInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subjectGroupInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}subjectGroupInfo" minOccurs="0"/>
 *         &lt;element name="subjectPerson" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}personInfo" minOccurs="0"/>
 *         &lt;element name="weatherInfo" type="{http://datadownload.webservices.eegdatabase.kiv.zcu.cz/}weatherInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "experimentMetadata", propOrder = {
    "artifactInfo",
    "artifactRemoveMethodInfos",
    "coexperimenters",
    "dataFileInfos",
    "digitizationInfo",
    "diseaseInfos",
    "experimentInfo",
    "hardwareInfos",
    "pharmaceuticalInfos",
    "projectTypeInfos",
    "researchGroupInfo",
    "scenarioInfo",
    "softwareInfos",
    "subjectGroupInfo",
    "subjectPerson",
    "weatherInfo"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
public class ExperimentMetadata {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected ArtifactInfo artifactInfo;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<ArtifactRemoveMethodInfo> artifactRemoveMethodInfos;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<PersonInfo> coexperimenters;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<DataFileInfo> dataFileInfos;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected DigitizationInfo digitizationInfo;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<DiseaseInfo> diseaseInfos;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected ExperimentInfo experimentInfo;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<HardwareInfo> hardwareInfos;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<PharmaceuticalInfo> pharmaceuticalInfos;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<ProjectTypeInfo> projectTypeInfos;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected ResearchGroupInfo researchGroupInfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected ScenarioInfo scenarioInfo;
    @XmlElement(nillable = true)
	@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
    protected List<SoftwareInfo> softwareInfos;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected SubjectGroupInfo subjectGroupInfo;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected PersonInfo subjectPerson;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	protected WeatherInfo weatherInfo;

    /**
     * Gets the value of the artifactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArtifactInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public ArtifactInfo getArtifactInfo() {
        return artifactInfo;
    }

    /**
     * Sets the value of the artifactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtifactInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setArtifactInfo(ArtifactInfo value) {
        this.artifactInfo = value;
    }

    /**
     * Gets the value of the artifactRemoveMethodInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifactRemoveMethodInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifactRemoveMethodInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtifactRemoveMethodInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<ArtifactRemoveMethodInfo> getArtifactRemoveMethodInfos() {
        if (artifactRemoveMethodInfos == null) {
            artifactRemoveMethodInfos = new ArrayList<ArtifactRemoveMethodInfo>();
        }
        return this.artifactRemoveMethodInfos;
    }

    /**
     * Gets the value of the coexperimenters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coexperimenters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoexperimenters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<PersonInfo> getCoexperimenters() {
        if (coexperimenters == null) {
            coexperimenters = new ArrayList<PersonInfo>();
        }
        return this.coexperimenters;
    }

    /**
     * Gets the value of the dataFileInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFileInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFileInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataFileInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<DataFileInfo> getDataFileInfos() {
        if (dataFileInfos == null) {
            dataFileInfos = new ArrayList<DataFileInfo>();
        }
        return this.dataFileInfos;
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
     * Gets the value of the diseaseInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diseaseInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiseaseInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiseaseInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<DiseaseInfo> getDiseaseInfos() {
        if (diseaseInfos == null) {
            diseaseInfos = new ArrayList<DiseaseInfo>();
        }
        return this.diseaseInfos;
    }

    /**
     * Gets the value of the experimentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExperimentInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public ExperimentInfo getExperimentInfo() {
        return experimentInfo;
    }

    /**
     * Sets the value of the experimentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExperimentInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setExperimentInfo(ExperimentInfo value) {
        this.experimentInfo = value;
    }

    /**
     * Gets the value of the hardwareInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardwareInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardwareInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HardwareInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<HardwareInfo> getHardwareInfos() {
        if (hardwareInfos == null) {
            hardwareInfos = new ArrayList<HardwareInfo>();
        }
        return this.hardwareInfos;
    }

    /**
     * Gets the value of the pharmaceuticalInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pharmaceuticalInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPharmaceuticalInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PharmaceuticalInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<PharmaceuticalInfo> getPharmaceuticalInfos() {
        if (pharmaceuticalInfos == null) {
            pharmaceuticalInfos = new ArrayList<PharmaceuticalInfo>();
        }
        return this.pharmaceuticalInfos;
    }

    /**
     * Gets the value of the projectTypeInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTypeInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTypeInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectTypeInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<ProjectTypeInfo> getProjectTypeInfos() {
        if (projectTypeInfos == null) {
            projectTypeInfos = new ArrayList<ProjectTypeInfo>();
        }
        return this.projectTypeInfos;
    }

    /**
     * Gets the value of the researchGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchGroupInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public ResearchGroupInfo getResearchGroupInfo() {
        return researchGroupInfo;
    }

    /**
     * Sets the value of the researchGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchGroupInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setResearchGroupInfo(ResearchGroupInfo value) {
        this.researchGroupInfo = value;
    }

    /**
     * Gets the value of the scenarioInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ScenarioInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public ScenarioInfo getScenarioInfo() {
        return scenarioInfo;
    }

    /**
     * Sets the value of the scenarioInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScenarioInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setScenarioInfo(ScenarioInfo value) {
        this.scenarioInfo = value;
    }

    /**
     * Gets the value of the softwareInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public List<SoftwareInfo> getSoftwareInfos() {
        if (softwareInfos == null) {
            softwareInfos = new ArrayList<SoftwareInfo>();
        }
        return this.softwareInfos;
    }

    /**
     * Gets the value of the subjectGroupInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectGroupInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public SubjectGroupInfo getSubjectGroupInfo() {
        return subjectGroupInfo;
    }

    /**
     * Sets the value of the subjectGroupInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectGroupInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setSubjectGroupInfo(SubjectGroupInfo value) {
        this.subjectGroupInfo = value;
    }

    /**
     * Gets the value of the subjectPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public PersonInfo getSubjectPerson() {
        return subjectPerson;
    }

    /**
     * Sets the value of the subjectPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setSubjectPerson(PersonInfo value) {
        this.subjectPerson = value;
    }

    /**
     * Gets the value of the weatherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

    /**
     * Sets the value of the weatherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-05-14T01:25:18+02:00", comments = "JAXB RI v2.2.4")
	public void setWeatherInfo(WeatherInfo value) {
        this.weatherInfo = value;
    }

}
