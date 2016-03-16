/**
 * SumaWSDL_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.SumaWSDL;

public interface SumaWSDL_Service extends javax.xml.rpc.Service {
    public java.lang.String getSumaWSDLSOAPAddress();

    public org.example.www.SumaWSDL.SumaWSDL_PortType getSumaWSDLSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.SumaWSDL.SumaWSDL_PortType getSumaWSDLSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
