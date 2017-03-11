/**
 * WijkSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package inwoners;

public class WijkSoapBindingSkeleton implements inwoners.Wijk, org.apache.axis.wsdl.Skeleton {
    private inwoners.Wijk impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://inwoners", "wijk"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://inwoners", "jaar"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("calcInwonersVoorWijk", _params, new javax.xml.namespace.QName("http://inwoners", "calcInwonersVoorWijkReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://inwoners", "calcInwonersVoorWijk"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("calcInwonersVoorWijk") == null) {
            _myOperations.put("calcInwonersVoorWijk", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("calcInwonersVoorWijk")).add(_oper);
    }

    public WijkSoapBindingSkeleton() {
        this.impl = new inwoners.WijkSoapBindingImpl();
    }

    public WijkSoapBindingSkeleton(inwoners.Wijk impl) {
        this.impl = impl;
    }
    public int calcInwonersVoorWijk(java.lang.String wijk, int jaar) throws java.rmi.RemoteException
    {
        int ret = impl.calcInwonersVoorWijk(wijk, jaar);
        return ret;
    }

}
