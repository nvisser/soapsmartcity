/**
 * WijkSoapBindingImpl.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package inwoners;

public class WijkSoapBindingImpl implements inwoners.Wijk {
    public int calcInwonersVoorWijk(java.lang.String wijk, int jaar) throws java.rmi.RemoteException {
        return (int) ((3.2 * jaar) + (0.7 * wijk.length()));
    }

}
