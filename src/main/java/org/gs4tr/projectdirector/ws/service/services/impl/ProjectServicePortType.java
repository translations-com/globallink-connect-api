package org.gs4tr.projectdirector.ws.service.services.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2016-05-25T10:32:00.257+03:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", name = "ProjectServicePortType")
@XmlSeeAlso({ObjectFactory.class, org.gs4tr.projectdirector.model.dto.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface ProjectServicePortType {

    @WebMethod(action = "urn:getUserProjects")
    @Action(input = "urn:getUserProjects", output = "urn:getUserProjectsResponse")
    @RequestWrapper(localName = "getUserProjects", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.GetUserProjects")
    @ResponseWrapper(localName = "getUserProjectsResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.GetUserProjectsResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public java.util.List<org.gs4tr.projectdirector.model.dto.Project> getUserProjects(
        @WebParam(name = "isSubProjectIncluded", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        boolean isSubProjectIncluded
    );

    @WebMethod(action = "urn:findByTicket")
    @Action(input = "urn:findByTicket", output = "urn:findByTicketResponse")
    @RequestWrapper(localName = "findByTicket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindProjectByTicket")
    @ResponseWrapper(localName = "findByTicketResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindProjectByTicketResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.Project findByTicket(
        @WebParam(name = "ticket", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String ticket
    );

    @WebMethod(action = "urn:findProjectByShortCode")
    @Action(input = "urn:findProjectByShortCode", output = "urn:findProjectByShortCodeResponse")
    @RequestWrapper(localName = "findProjectByShortCode", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindProjectByShortCode")
    @ResponseWrapper(localName = "findProjectByShortCodeResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindProjectByShortCodeResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.Project findProjectByShortCode(
        @WebParam(name = "projectShortCode", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String projectShortCode
    );

    @WebMethod(action = "urn:findProjectByName")
    @Action(input = "urn:findProjectByName", output = "urn:findProjectByNameResponse")
    @RequestWrapper(localName = "findProjectByName", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindProjectByName")
    @ResponseWrapper(localName = "findProjectByNameResponse", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org", className = "org.gs4tr.projectdirector.ws.service.services.impl.FindProjectByNameResponse")
    @WebResult(name = "return", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
    public org.gs4tr.projectdirector.model.dto.Project findProjectByName(
        @WebParam(name = "projectName", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
        java.lang.String projectName
    );
}