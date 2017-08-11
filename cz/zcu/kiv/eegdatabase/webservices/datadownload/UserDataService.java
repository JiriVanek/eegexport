package cz.zcu.kiv.eegdatabase.webservices.datadownload;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2015-05-14T13:25:19.031+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", name = "UserDataService")
@XmlSeeAlso({ObjectFactory.class})
public interface UserDataService {

    @WebMethod
    @RequestWrapper(localName = "getExperimentsMetadata", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetExperimentsMetadata")
    @ResponseWrapper(localName = "getExperimentsMetadataResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetExperimentsMetadataResponse")
    @WebResult(name = "return", targetNamespace = "")
    public cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentMetadata getExperimentsMetadata(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getDataFiles", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetDataFiles")
    @ResponseWrapper(localName = "getDataFilesResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetDataFilesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo> getDataFiles() throws UserDataServiceException_Exception;

    @WebMethod
    @RequestWrapper(localName = "downloadDataFile", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.DownloadDataFile")
    @ResponseWrapper(localName = "downloadDataFileResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.DownloadDataFileResponse")
    @WebResult(name = "return", targetNamespace = "")
    public javax.activation.DataHandler downloadDataFile(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    ) throws UserDataServiceException_Exception;

    @WebMethod
    @RequestWrapper(localName = "addOrUpdateDataFile", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateDataFile")
    @ResponseWrapper(localName = "addOrUpdateDataFileResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateDataFileResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addOrUpdateDataFile(
        @WebParam(name = "arg0", targetNamespace = "")
        cz.zcu.kiv.eegdatabase.webservices.datadownload.DataFileInfo arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        javax.activation.DataHandler arg1
    ) throws UserDataServiceException_Exception;

    @WebMethod
    @RequestWrapper(localName = "getHardware", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetHardware")
    @ResponseWrapper(localName = "getHardwareResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetHardwareResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo> getHardware();

    @WebMethod
    @RequestWrapper(localName = "addOrUpdateHardware", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateHardware")
    @ResponseWrapper(localName = "addOrUpdateHardwareResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateHardwareResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addOrUpdateHardware(
        @WebParam(name = "arg0", targetNamespace = "")
        cz.zcu.kiv.eegdatabase.webservices.datadownload.HardwareInfo arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addOfUpdateWeather", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOfUpdateWeather")
    @ResponseWrapper(localName = "addOfUpdateWeatherResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOfUpdateWeatherResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addOfUpdateWeather(
        @WebParam(name = "arg0", targetNamespace = "")
        cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addOrUpdateExperiment", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateExperiment")
    @ResponseWrapper(localName = "addOrUpdateExperimentResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateExperimentResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addOrUpdateExperiment(
        @WebParam(name = "arg0", targetNamespace = "")
        cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addOrUpdatePerson", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdatePerson")
    @ResponseWrapper(localName = "addOrUpdatePersonResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdatePersonResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addOrUpdatePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getResearchGroups", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetResearchGroups")
    @ResponseWrapper(localName = "getResearchGroupsResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetResearchGroupsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo> getResearchGroups();

    @WebMethod
    @RequestWrapper(localName = "getExperiments", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetExperiments")
    @ResponseWrapper(localName = "getExperimentsResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetExperimentsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ExperimentInfo> getExperiments();

    @WebMethod
    @RequestWrapper(localName = "getWeather", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetWeather")
    @ResponseWrapper(localName = "getWeatherResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetWeatherResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.WeatherInfo> getWeather();

    @WebMethod
    @RequestWrapper(localName = "getScenarios", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetScenarios")
    @ResponseWrapper(localName = "getScenariosResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetScenariosResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo> getScenarios();

    @WebMethod
    @RequestWrapper(localName = "isServiceAvailable", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.IsServiceAvailable")
    @ResponseWrapper(localName = "isServiceAvailableResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.IsServiceAvailableResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean isServiceAvailable();

    @WebMethod
    @RequestWrapper(localName = "getPeople", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetPeople")
    @ResponseWrapper(localName = "getPeopleResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.GetPeopleResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cz.zcu.kiv.eegdatabase.webservices.datadownload.PersonInfo> getPeople();

    @WebMethod
    @RequestWrapper(localName = "addOrUpdateResearchGroup", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateResearchGroup")
    @ResponseWrapper(localName = "addOrUpdateResearchGroupResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateResearchGroupResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addOrUpdateResearchGroup(
        @WebParam(name = "arg0", targetNamespace = "")
        cz.zcu.kiv.eegdatabase.webservices.datadownload.ResearchGroupInfo arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addOrUpdateScenario", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateScenario")
    @ResponseWrapper(localName = "addOrUpdateScenarioResponse", targetNamespace = "http://datadownload.webservices.eegdatabase.kiv.zcu.cz/", className = "cz.zcu.kiv.eegdatabase.webservices.datadownload.AddOrUpdateScenarioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addOrUpdateScenario(
        @WebParam(name = "arg0", targetNamespace = "")
        cz.zcu.kiv.eegdatabase.webservices.datadownload.ScenarioInfo arg0
    );
}