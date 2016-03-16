/**
 * SumaWSDLSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.SumaWSDL;

public class SumaWSDLSOAPSkeleton implements org.example.www.SumaWSDL.SumaWSDL_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.SumaWSDL.SumaWSDL_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/SumaWSDL/", "SumaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/SumaWSDL/", "SumaRequestType"), org.example.www.SumaWSDL.SumaRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("suma", _params, new javax.xml.namespace.QName("http://www.example.org/SumaWSDL/", "SumaResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/SumaWSDL/", ">SumaResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Suma"));
        _oper.setSoapAction("http://www.example.org/SumaWSDL/Suma");
        _myOperationsList.add(_oper);
        if (_myOperations.get("suma") == null) {
            _myOperations.put("suma", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("suma")).add(_oper);
    }

    public SumaWSDLSOAPSkeleton() {
        this.impl = new org.example.www.SumaWSDL.SumaWSDLSOAPImpl();
    }

    public SumaWSDLSOAPSkeleton(org.example.www.SumaWSDL.SumaWSDL_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.SumaWSDL.SumaResponse suma(org.example.www.SumaWSDL.SumaRequestType parameters) throws java.rmi.RemoteException
    {
        org.example.www.SumaWSDL.SumaResponse ret = impl.suma(parameters);
        return ret;
    }

}
