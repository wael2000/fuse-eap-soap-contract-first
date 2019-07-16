package soap.mw1.tedata;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5.redhat-00001
 * 2019-07-16T18:19:37.827+04:00
 * Generated source version: 3.2.5.redhat-00001
 *
 */
@WebServiceClient(name = "MiddlewareServices",
                  wsdlLocation = "file:/Users/redhat/Documents/microservices/tedata/src/main/webapp/META-INF/wsdl/ws.wsdl",
                  targetNamespace = "tedata.mw1.soap")
public class MiddlewareServices_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("tedata.mw1.soap", "MiddlewareServices");
    public final static QName MiddlewareServices = new QName("tedata.mw1.soap", "MiddlewareServices");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/redhat/Documents/microservices/tedata/src/main/webapp/META-INF/wsdl/ws.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MiddlewareServices_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/redhat/Documents/microservices/tedata/src/main/webapp/META-INF/wsdl/ws.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MiddlewareServices_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MiddlewareServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MiddlewareServices_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MiddlewareServices_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MiddlewareServices_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MiddlewareServices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MiddlewareServices
     */
    @WebEndpoint(name = "MiddlewareServices")
    public MiddlewareServices getMiddlewareServices() {
        return super.getPort(MiddlewareServices, MiddlewareServices.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MiddlewareServices
     */
    @WebEndpoint(name = "MiddlewareServices")
    public MiddlewareServices getMiddlewareServices(WebServiceFeature... features) {
        return super.getPort(MiddlewareServices, MiddlewareServices.class, features);
    }

}