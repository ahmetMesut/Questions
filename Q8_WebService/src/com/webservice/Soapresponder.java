package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2016-05-19T17:08:42.921+03:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://soapclient.com/xml/soapresponder.wsdl", name = "soapresponder")
@XmlSeeAlso({ObjectFactory.class})
public interface Soapresponder {

    @WebMethod(operationName = "NewOperation", action = "http://soapclient.com/xml/soapresponder.wsdl/NewOperation")
    @RequestWrapper(localName = "NewOperation", targetNamespace = "http://soapclient.com/xml/soapresponder.wsdl", className = "com.webservice.NewOperation")
    @ResponseWrapper(localName = "NewOperationResponse", targetNamespace = "http://soapclient.com/xml/soapresponder.wsdl", className = "com.webservice.NewOperationResponse")
    @WebResult(name = "out", targetNamespace = "")
    public java.lang.String newOperation(
        @WebParam(name = "in", targetNamespace = "")
        java.lang.String i
    );
}