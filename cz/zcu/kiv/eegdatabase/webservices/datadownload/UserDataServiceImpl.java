
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cz.zcu.kiv.eegdatabase.webservices.datadownload;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2015-05-14T13:25:19+02:00
 * Generated source version: 2.5.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "UserDataImplService",
                      portName = "UserDataImplPort",
                      targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/",
                      wsdlLocation = "http://eeg2.kiv.zcu.cz:8080/webservice/UserDataService?wsdl",
                      endpointInterface = "cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService")
                      
public class UserDataServiceImpl implements UserDataService {

    private static final Logger LOG = Logger.getLogger(UserDataServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getExperimentsMetadata(int  arg0 )*
     */
    public cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentMetadata getExperimentsMetadata(int arg0) { 
        LOG.info("Executing operation getExperimentsMetadata");
        System.out.println(arg0);
        try {
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentMetadata _return = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentMetadata();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ArtifactInfo _returnArtifactInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ArtifactInfo();
            _returnArtifactInfo.setCompensation("Compensation150981102");
            _returnArtifactInfo.setId(-1087136732);
            _returnArtifactInfo.setRejectCondition("RejectCondition-605356702");
            _return.setArtifactInfo(_returnArtifactInfo);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ArtifactRemoveMethodInfo> _returnArtifactRemoveMethodInfos = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.ArtifactRemoveMethodInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ArtifactRemoveMethodInfo _returnArtifactRemoveMethodInfosVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ArtifactRemoveMethodInfo();
            _returnArtifactRemoveMethodInfosVal1.setDescription("Description-1394533639");
            _returnArtifactRemoveMethodInfosVal1.setId(-376247749);
            _returnArtifactRemoveMethodInfosVal1.setTitle("Title1455210931");
            _returnArtifactRemoveMethodInfos.add(_returnArtifactRemoveMethodInfosVal1);
            _return.getArtifactRemoveMethodInfos().addAll(_returnArtifactRemoveMethodInfos);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo> _returnCoexperimenters = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo _returnCoexperimentersVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo();
            _returnCoexperimentersVal1.setAdded(true);
            _returnCoexperimentersVal1.setChanged(true);
            _returnCoexperimentersVal1.setDefaultGroupId(2063858609);
            _returnCoexperimentersVal1.setEducationalLevel("EducationalLevel-2146256965");
            _returnCoexperimentersVal1.setGender(-217331433);
            _returnCoexperimentersVal1.setGivenName("GivenName91078952");
            _returnCoexperimentersVal1.setPersonId(1940050505);
            _returnCoexperimentersVal1.setSurname("Surname1498695907");
            _returnCoexperimenters.add(_returnCoexperimentersVal1);
            _return.getCoexperimenters().addAll(_returnCoexperimenters);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo> _returnDataFileInfos = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo _returnDataFileInfosVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo();
            _returnDataFileInfosVal1.setAdded(true);
            _returnDataFileInfosVal1.setChanged(false);
            _returnDataFileInfosVal1.setDescription("Description-1090121505");
            _returnDataFileInfosVal1.setExperimentId(-1143025971);
            _returnDataFileInfosVal1.setFileId(1679782781);
            _returnDataFileInfosVal1.setFileLength(-2035836850831601935l);
            _returnDataFileInfosVal1.setFileName("FileName1161125516");
            _returnDataFileInfosVal1.setMimeType("MimeType704010070");
            _returnDataFileInfos.add(_returnDataFileInfosVal1);
            _return.getDataFileInfos().addAll(_returnDataFileInfos);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.DigitizationInfo _returnDigitizationInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.DigitizationInfo();
            _returnDigitizationInfo.setFilter("Filter-906256431");
            _returnDigitizationInfo.setGain(0.46208704f);
            _returnDigitizationInfo.setSamplingRate(0.2804227f);
            _return.setDigitizationInfo(_returnDigitizationInfo);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.DiseaseInfo> _returnDiseaseInfos = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.DiseaseInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.DiseaseInfo _returnDiseaseInfosVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.DiseaseInfo();
            _returnDiseaseInfosVal1.setDescription("Description-1258133676");
            _returnDiseaseInfosVal1.setId(-1320224658);
            _returnDiseaseInfosVal1.setTitle("Title-1977434350");
            _returnDiseaseInfos.add(_returnDiseaseInfosVal1);
            _return.getDiseaseInfos().addAll(_returnDiseaseInfos);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo _returnExperimentInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo();
            _returnExperimentInfo.setAdded(true);
            _returnExperimentInfo.setChanged(false);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.DigitizationInfo _returnExperimentInfoDigitizationInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.DigitizationInfo();
            _returnExperimentInfoDigitizationInfo.setFilter("Filter-420314191");
            _returnExperimentInfoDigitizationInfo.setGain(0.64098203f);
            _returnExperimentInfoDigitizationInfo.setSamplingRate(0.17472404f);
            _returnExperimentInfo.setDigitizationInfo(_returnExperimentInfoDigitizationInfo);
            _returnExperimentInfo.setEndTimeInMillis(962531734436408744l);
            _returnExperimentInfo.setExperimentId(-1891003824);
            java.util.List<java.lang.Integer> _returnExperimentInfoHwIds = new java.util.ArrayList<java.lang.Integer>();
            java.lang.Integer _returnExperimentInfoHwIdsVal1 = Integer.valueOf(-682041411);
            _returnExperimentInfoHwIds.add(_returnExperimentInfoHwIdsVal1);
            _returnExperimentInfo.getHwIds().addAll(_returnExperimentInfoHwIds);
            _returnExperimentInfo.setOwnerId(-1446805547);
            _returnExperimentInfo.setPrivateFlag(-702241200);
            _returnExperimentInfo.setResearchGroupId(-368069687);
            _returnExperimentInfo.setScenarioId(1407954449);
            _returnExperimentInfo.setStartTimeInMillis(-8147528956918061205l);
            _returnExperimentInfo.setSubjectGroupId(529276304);
            _returnExperimentInfo.setSubjectPersonId(1222913955);
            _returnExperimentInfo.setTemperature(-1919868974);
            _returnExperimentInfo.setTitle("Title-1617869931");
            _returnExperimentInfo.setWeatherId(-204200430);
            _returnExperimentInfo.setWeatherNote("WeatherNote-1182834883");
            _return.setExperimentInfo(_returnExperimentInfo);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo> _returnHardwareInfos = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo _returnHardwareInfosVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo();
            _returnHardwareInfosVal1.setAdded(false);
            _returnHardwareInfosVal1.setChanged(false);
            _returnHardwareInfosVal1.setDescription("Description-815300736");
            java.util.List<java.lang.Integer> _returnHardwareInfosVal1ExperimentIds = new java.util.ArrayList<java.lang.Integer>();
            _returnHardwareInfosVal1.getExperimentIds().addAll(_returnHardwareInfosVal1ExperimentIds);
            _returnHardwareInfosVal1.setHardwareId(1092656059);
            _returnHardwareInfosVal1.setTitle("Title-1282015636");
            _returnHardwareInfosVal1.setType("Type-1803989248");
            _returnHardwareInfos.add(_returnHardwareInfosVal1);
            _return.getHardwareInfos().addAll(_returnHardwareInfos);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.PharmaceuticalInfo> _returnPharmaceuticalInfos = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.PharmaceuticalInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.PharmaceuticalInfo _returnPharmaceuticalInfosVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.PharmaceuticalInfo();
            _returnPharmaceuticalInfosVal1.setDescription("Description1029621713");
            _returnPharmaceuticalInfosVal1.setId(-566718019);
            _returnPharmaceuticalInfosVal1.setTitle("Title668821948");
            _returnPharmaceuticalInfos.add(_returnPharmaceuticalInfosVal1);
            _return.getPharmaceuticalInfos().addAll(_returnPharmaceuticalInfos);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ProjectTypeInfo> _returnProjectTypeInfos = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.ProjectTypeInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ProjectTypeInfo _returnProjectTypeInfosVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ProjectTypeInfo();
            _returnProjectTypeInfosVal1.setDescription("Description1104885995");
            _returnProjectTypeInfosVal1.setId(816092428);
            _returnProjectTypeInfosVal1.setTitle("Title-213611369");
            _returnProjectTypeInfos.add(_returnProjectTypeInfosVal1);
            _return.getProjectTypeInfos().addAll(_returnProjectTypeInfos);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo _returnResearchGroupInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo();
            _returnResearchGroupInfo.setAdded(true);
            _returnResearchGroupInfo.setChanged(true);
            _returnResearchGroupInfo.setDescription("Description2147254727");
            _returnResearchGroupInfo.setOwnerId(1824350860);
            _returnResearchGroupInfo.setResearchGroupId(-1020677479);
            _returnResearchGroupInfo.setTitle("Title1826064236");
            _return.setResearchGroupInfo(_returnResearchGroupInfo);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo _returnScenarioInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo();
            _returnScenarioInfo.setAdded(false);
            _returnScenarioInfo.setChanged(true);
            _returnScenarioInfo.setDescription("Description-882125013");
            _returnScenarioInfo.setMimeType("MimeType-311125216");
            _returnScenarioInfo.setOwnerId(-101652552);
            _returnScenarioInfo.setResearchGroupId(1779455834);
            _returnScenarioInfo.setScenarioId(555531241);
            _returnScenarioInfo.setScenarioLength(-856988421);
            _returnScenarioInfo.setScenarioName("ScenarioName-1543622384");
            _returnScenarioInfo.setTitle("Title-803048287");
            _return.setScenarioInfo(_returnScenarioInfo);
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.SoftwareInfo> _returnSoftwareInfos = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.SoftwareInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.SoftwareInfo _returnSoftwareInfosVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.SoftwareInfo();
            _returnSoftwareInfosVal1.setDescription("Description-469122140");
            _returnSoftwareInfosVal1.setId(-1381123276);
            _returnSoftwareInfosVal1.setTitle("Title1964446959");
            _returnSoftwareInfos.add(_returnSoftwareInfosVal1);
            _return.getSoftwareInfos().addAll(_returnSoftwareInfos);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.SubjectGroupInfo _returnSubjectGroupInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.SubjectGroupInfo();
            _returnSubjectGroupInfo.setDescription("Description-735493880");
            _returnSubjectGroupInfo.setId(1100059113);
            _returnSubjectGroupInfo.setTitle("Title-396338994");
            _return.setSubjectGroupInfo(_returnSubjectGroupInfo);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo _returnSubjectPerson = new cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo();
            _returnSubjectPerson.setAdded(false);
            _returnSubjectPerson.setChanged(false);
            _returnSubjectPerson.setDefaultGroupId(-1467992989);
            _returnSubjectPerson.setEducationalLevel("EducationalLevel1308120364");
            _returnSubjectPerson.setGender(1762760887);
            _returnSubjectPerson.setGivenName("GivenName1155001901");
            _returnSubjectPerson.setPersonId(-2026242435);
            _returnSubjectPerson.setSurname("Surname1417674986");
            _return.setSubjectPerson(_returnSubjectPerson);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo _returnWeatherInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo();
            _returnWeatherInfo.setAdded(true);
            _returnWeatherInfo.setChanged(true);
            _returnWeatherInfo.setDescription("Description-800720053");
            _returnWeatherInfo.setTitle("Title-1634976791");
            _returnWeatherInfo.setWeatherId(-707038493);
            _return.setWeatherInfo(_returnWeatherInfo);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getDataFiles(*
     */
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo> getDataFiles() throws UserDataServiceException_Exception    { 
        LOG.info("Executing operation getDataFiles");
        try {
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo> _return = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo _returnVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo();
            _returnVal1.setAdded(false);
            _returnVal1.setChanged(true);
            _returnVal1.setDescription("Description-1670866773");
            _returnVal1.setExperimentId(1393244499);
            _returnVal1.setFileId(289824215);
            _returnVal1.setFileLength(-3179129411986136862l);
            _returnVal1.setFileName("FileName2076975175");
            _returnVal1.setMimeType("MimeType710058172");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UserDataServiceException_Exception("UserDataServiceException...");
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#downloadDataFile(int  arg0 )*
     */
    public javax.activation.DataHandler downloadDataFile(int arg0) throws UserDataServiceException_Exception    { 
        LOG.info("Executing operation downloadDataFile");
        System.out.println(arg0);
        try {
            javax.activation.DataHandler _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UserDataServiceException_Exception("UserDataServiceException...");
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#addOrUpdateDataFile(cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo  arg0 ,)javax.activation.DataHandler  arg1 )*
     */
    public int addOrUpdateDataFile(cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo arg0,javax.activation.DataHandler arg1) throws UserDataServiceException_Exception    { 
        LOG.info("Executing operation addOrUpdateDataFile");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            int _return = -907318758;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UserDataServiceException_Exception("UserDataServiceException...");
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getHardware(*
     */
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo> getHardware() { 
        LOG.info("Executing operation getHardware");
        try {
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo> _return = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo _returnVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo();
            _returnVal1.setAdded(true);
            _returnVal1.setChanged(true);
            _returnVal1.setDescription("Description367112070");
            java.util.List<java.lang.Integer> _returnVal1ExperimentIds = new java.util.ArrayList<java.lang.Integer>();
            java.lang.Integer _returnVal1ExperimentIdsVal1 = Integer.valueOf(494942620);
            _returnVal1ExperimentIds.add(_returnVal1ExperimentIdsVal1);
            _returnVal1.getExperimentIds().addAll(_returnVal1ExperimentIds);
            _returnVal1.setHardwareId(1763185310);
            _returnVal1.setTitle("Title-429869252");
            _returnVal1.setType("Type-285221290");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#addOrUpdateHardware(cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo  arg0 )*
     */
    public int addOrUpdateHardware(cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo arg0) { 
        LOG.info("Executing operation addOrUpdateHardware");
        System.out.println(arg0);
        try {
            int _return = -449014373;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#addOfUpdateWeather(cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo  arg0 )*
     */
    public int addOfUpdateWeather(cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo arg0) { 
        LOG.info("Executing operation addOfUpdateWeather");
        System.out.println(arg0);
        try {
            int _return = 1734471219;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#addOrUpdateExperiment(cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo  arg0 )*
     */
    public int addOrUpdateExperiment(cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo arg0) { 
        LOG.info("Executing operation addOrUpdateExperiment");
        System.out.println(arg0);
        try {
            int _return = -434412957;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#addOrUpdatePerson(cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo  arg0 )*
     */
    public int addOrUpdatePerson(cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo arg0) { 
        LOG.info("Executing operation addOrUpdatePerson");
        System.out.println(arg0);
        try {
            int _return = 1047242397;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getResearchGroups(*
     */
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo> getResearchGroups() { 
        LOG.info("Executing operation getResearchGroups");
        try {
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo> _return = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo _returnVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo();
            _returnVal1.setAdded(false);
            _returnVal1.setChanged(true);
            _returnVal1.setDescription("Description1465652256");
            _returnVal1.setOwnerId(-235969333);
            _returnVal1.setResearchGroupId(-1143299680);
            _returnVal1.setTitle("Title115036115");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getExperiments(*
     */
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo> getExperiments() { 
        LOG.info("Executing operation getExperiments");
        try {
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo> _return = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo _returnVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo();
            _returnVal1.setAdded(false);
            _returnVal1.setChanged(false);
            cz.zcu.kiv.eegdatabase.webservices.datadownload.DigitizationInfo _returnVal1DigitizationInfo = new cz.zcu.kiv.eegdatabase.webservices.datadownload.DigitizationInfo();
            _returnVal1DigitizationInfo.setFilter("Filter1377422986");
            _returnVal1DigitizationInfo.setGain(0.38572395f);
            _returnVal1DigitizationInfo.setSamplingRate(2.4539232E-4f);
            _returnVal1.setDigitizationInfo(_returnVal1DigitizationInfo);
            _returnVal1.setEndTimeInMillis(1334434053549114302l);
            _returnVal1.setExperimentId(1205478864);
            java.util.List<java.lang.Integer> _returnVal1HwIds = new java.util.ArrayList<java.lang.Integer>();
            java.lang.Integer _returnVal1HwIdsVal1 = Integer.valueOf(-1794894639);
            _returnVal1HwIds.add(_returnVal1HwIdsVal1);
            _returnVal1.getHwIds().addAll(_returnVal1HwIds);
            _returnVal1.setOwnerId(-3668168);
            _returnVal1.setPrivateFlag(920951755);
            _returnVal1.setResearchGroupId(-167847299);
            _returnVal1.setScenarioId(518122044);
            _returnVal1.setStartTimeInMillis(7640967410636538416l);
            _returnVal1.setSubjectGroupId(-1298231384);
            _returnVal1.setSubjectPersonId(-1106105898);
            _returnVal1.setTemperature(346123258);
            _returnVal1.setTitle("Title-392435645");
            _returnVal1.setWeatherId(177545660);
            _returnVal1.setWeatherNote("WeatherNote-2024052030");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getWeather(*
     */
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo> getWeather() { 
        LOG.info("Executing operation getWeather");
        try {
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo> _return = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo _returnVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo();
            _returnVal1.setAdded(false);
            _returnVal1.setChanged(true);
            _returnVal1.setDescription("Description2093941040");
            _returnVal1.setTitle("Title-1085393593");
            _returnVal1.setWeatherId(1507897758);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getScenarios(*
     */
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo> getScenarios() { 
        LOG.info("Executing operation getScenarios");
        try {
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo> _return = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo _returnVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo();
            _returnVal1.setAdded(true);
            _returnVal1.setChanged(false);
            _returnVal1.setDescription("Description-748975916");
            _returnVal1.setMimeType("MimeType-970903361");
            _returnVal1.setOwnerId(1691906860);
            _returnVal1.setResearchGroupId(549910799);
            _returnVal1.setScenarioId(616513092);
            _returnVal1.setScenarioLength(-312781018);
            _returnVal1.setScenarioName("ScenarioName1584112443");
            _returnVal1.setTitle("Title-765350625");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#isServiceAvailable(*
     */
    public boolean isServiceAvailable() { 
        LOG.info("Executing operation isServiceAvailable");
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#getPeople(*
     */
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo> getPeople() { 
        LOG.info("Executing operation getPeople");
        try {
            java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo> _return = new java.util.ArrayList<cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo>();
            cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo _returnVal1 = new cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo();
            _returnVal1.setAdded(true);
            _returnVal1.setChanged(false);
            _returnVal1.setDefaultGroupId(-1567226048);
            _returnVal1.setEducationalLevel("EducationalLevel-1256643410");
            _returnVal1.setGender(-1097979);
            _returnVal1.setGivenName("GivenName-1811224538");
            _returnVal1.setPersonId(-873365799);
            _returnVal1.setSurname("Surname1658902113");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#addOrUpdateResearchGroup(cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo  arg0 )*
     */
    public int addOrUpdateResearchGroup(cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo arg0) { 
        LOG.info("Executing operation addOrUpdateResearchGroup");
        System.out.println(arg0);
        try {
            int _return = 1157516397;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cz.zcu.kiv.eegdatabase.webservices.datadownload.UserDataService#addOrUpdateScenario(cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo  arg0 )*
     */
    public int addOrUpdateScenario(cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo arg0) { 
        LOG.info("Executing operation addOrUpdateScenario");
        System.out.println(arg0);
        try {
            int _return = -258542027;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
