/**
 * WijkServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package inwoners;

public class WijkServiceLocator extends org.apache.axis.client.Service implements inwoners.WijkService {

    public WijkServiceLocator() {
    }


    public WijkServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WijkServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Wijk
    private java.lang.String Wijk_address = "http://localhost:8080/InwonersJava/services/Wijk";

    public java.lang.String getWijkAddress() {
        return Wijk_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WijkWSDDServiceName = "Wijk";

    public java.lang.String getWijkWSDDServiceName() {
        return WijkWSDDServiceName;
    }

    public void setWijkWSDDServiceName(java.lang.String name) {
        WijkWSDDServiceName = name;
    }

    public inwoners.Wijk getWijk() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Wijk_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWijk(endpoint);
    }

    public inwoners.Wijk getWijk(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            inwoners.WijkSoapBindingStub _stub = new inwoners.WijkSoapBindingStub(portAddress, this);
            _stub.setPortName(getWijkWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWijkEndpointAddress(java.lang.String address) {
        Wijk_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (inwoners.Wijk.class.isAssignableFrom(serviceEndpointInterface)) {
                inwoners.WijkSoapBindingStub _stub = new inwoners.WijkSoapBindingStub(new java.net.URL(Wijk_address), this);
                _stub.setPortName(getWijkWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Wijk".equals(inputPortName)) {
            return getWijk();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://inwoners", "WijkService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://inwoners", "Wijk"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Wijk".equals(portName)) {
            setWijkEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
