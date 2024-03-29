package com.example.demo.soapclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2019-06-30T23:42:14.323-04:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "BLZService",
                  wsdlLocation = "file:/D:/java/demo2/src/main/resources/wsdl/BLZService_1.wsdl",
                  targetNamespace = "http://thomas-bayer.com/blz/")
public class BLZService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://thomas-bayer.com/blz/", "BLZService");
    public final static QName BLZServiceSOAP11PortHttp = new QName("http://thomas-bayer.com/blz/", "BLZServiceSOAP11port_http");
    public final static QName BLZServiceHttpport = new QName("http://thomas-bayer.com/blz/", "BLZServiceHttpport");
    public final static QName BLZServiceSOAP12PortHttp = new QName("http://thomas-bayer.com/blz/", "BLZServiceSOAP12port_http");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/java/demo2/src/main/resources/wsdl/BLZService_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BLZService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/java/demo2/src/main/resources/wsdl/BLZService_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BLZService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BLZService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BLZService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BLZService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BLZService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BLZService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP11port_http")
    public BLZServicePortType getBLZServiceSOAP11PortHttp() {
        return super.getPort(BLZServiceSOAP11PortHttp, BLZServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP11port_http")
    public BLZServicePortType getBLZServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(BLZServiceSOAP11PortHttp, BLZServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceHttpport")
    public BLZServicePortType getBLZServiceHttpport() {
        return super.getPort(BLZServiceHttpport, BLZServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceHttpport")
    public BLZServicePortType getBLZServiceHttpport(WebServiceFeature... features) {
        return super.getPort(BLZServiceHttpport, BLZServicePortType.class, features);
    }


    /**
     *
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP12port_http")
    public BLZServicePortType getBLZServiceSOAP12PortHttp() {
        return super.getPort(BLZServiceSOAP12PortHttp, BLZServicePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BLZServicePortType
     */
    @WebEndpoint(name = "BLZServiceSOAP12port_http")
    public BLZServicePortType getBLZServiceSOAP12PortHttp(WebServiceFeature... features) {
        return super.getPort(BLZServiceSOAP12PortHttp, BLZServicePortType.class, features);
    }

}
