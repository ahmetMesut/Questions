
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.webservice;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2016-05-19T17:08:42.889+03:00
 * Generated source version: 2.4.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "soapresponder",
                      portName = "soapresponderSOAP",
                      targetNamespace = "http://soapclient.com/xml/soapresponder.wsdl",
                      wsdlLocation = "file:/D:/YazilimDEPO/eclipse/workspace-eclipse/Q8_WebService/soapresponder.wsdl",
                      endpointInterface = "com.webservice.Soapresponder")
                      
public class SoapresponderImpl implements Soapresponder {

    private static final Logger LOG = Logger.getLogger(SoapresponderImpl.class.getName());

    /* (non-Javadoc)
     * @see com.webservice.Soapresponder#newOperation(java.lang.String  ın )*
     */
    public java.lang.String newOperation(java.lang.String in) { 
        LOG.info("Executing operation newOperation");
        System.out.println(in);
        try {
            java.lang.String _return = "_return415323943";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
