package org.example.www.SumaWSDL;

public class SumaWSDLProxy implements org.example.www.SumaWSDL.SumaWSDL_PortType {
  private String _endpoint = null;
  private org.example.www.SumaWSDL.SumaWSDL_PortType sumaWSDL_PortType = null;
  
  public SumaWSDLProxy() {
    _initSumaWSDLProxy();
  }
  
  public SumaWSDLProxy(String endpoint) {
    _endpoint = endpoint;
    _initSumaWSDLProxy();
  }
  
  private void _initSumaWSDLProxy() {
    try {
      sumaWSDL_PortType = (new org.example.www.SumaWSDL.SumaWSDL_ServiceLocator()).getSumaWSDLSOAP();
      if (sumaWSDL_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sumaWSDL_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sumaWSDL_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sumaWSDL_PortType != null)
      ((javax.xml.rpc.Stub)sumaWSDL_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.SumaWSDL.SumaWSDL_PortType getSumaWSDL_PortType() {
    if (sumaWSDL_PortType == null)
      _initSumaWSDLProxy();
    return sumaWSDL_PortType;
  }
  
  public org.example.www.SumaWSDL.SumaResponse suma(org.example.www.SumaWSDL.SumaRequestType parameters) throws java.rmi.RemoteException{
    if (sumaWSDL_PortType == null)
      _initSumaWSDLProxy();
    return sumaWSDL_PortType.suma(parameters);
  }
  
  
}