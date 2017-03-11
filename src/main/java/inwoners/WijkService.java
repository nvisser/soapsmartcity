/**
 * WijkService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package inwoners;

public interface WijkService extends javax.xml.rpc.Service {
    public java.lang.String getWijkAddress();

    public inwoners.Wijk getWijk() throws javax.xml.rpc.ServiceException;

    public inwoners.Wijk getWijk(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
