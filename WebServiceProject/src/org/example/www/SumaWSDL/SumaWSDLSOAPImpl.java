/**
 * SumaWSDLSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.SumaWSDL;

public class SumaWSDLSOAPImpl implements org.example.www.SumaWSDL.SumaWSDL_PortType{
    public org.example.www.SumaWSDL.SumaResponse suma(org.example.www.SumaWSDL.SumaRequestType parameters) throws java.rmi.RemoteException {
    	SumaResponse response = new SumaResponse();
    	response.setResultado(parameters.getA()+parameters.getB());
        return response;
    }

}
