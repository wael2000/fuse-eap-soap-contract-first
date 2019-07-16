package soap.mw1.tedata;

import javax.annotation.Resource;
import javax.jws.WebService;


import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;

import custom_types.wservices.BasicReturn;
import custom_types.wservices.QuotaReturn;
import custom_types.wservices.QuotaType;
import java.util.List;
import java.util.Map;
/**
 * @author rsearls@redhat.com
 */

@WebService(
			portName = "MiddlewareServices",
			serviceName  = "MiddlewareServices",
			wsdlLocation = "META-INF/wsdl/ws.wsdl",
			targetNamespace = "tedata.mw1.soap",
			endpointInterface = "soap.mw1.tedata.MiddlewareServices")
//@Addressing(enabled = true, required = true)

public class MiddlewareServicesImp implements MiddlewareServices{
	@Resource(name = "java:jboss/camel/context/tedata-spring-context")
	private CamelContext camelContext;
	
	@Override
	
	public QuotaReturn getUserQuota(String key, String userName) {
		// TODO Auto-generated method stub
		custom_types.wservices.ObjectFactory of = new custom_types.wservices.ObjectFactory();
		QuotaReturn qr = of.createQuotaReturn();
		// setQuota(JAXBElement<QuotaType> value)
		QuotaType qt = of.createQuotaType();
		qt.setBasicQuota(of.createQuotaTypeBasicQuota(new Double(10)));
		qt.setConsumedTopupQuota(of.createQuotaTypeConsumedTopupQuota(new Double(5)));
		qt.setEndDate(of.createQuotaTypeEndDate("1/8/2019"));
		qt.setRemainingTopupQuota(of.createQuotaTypeRemainingTopupQuota(new Double(7)));
		qt.setService(of.createQuotaTypeService(userName));
		qt.setStartDate(of.createQuotaTypeStartDate("1/1/2019"));
		qt.setTotalAllowedQuota(of.createQuotaTypeTotalAllowedQuota(new Double(30)));
		qt.setTotalConsumedQuota(of.createQuotaTypeTotalConsumedQuota(new Double(12)));
		qt.setTotalTopupQuota(of.createQuotaTypeTotalTopupQuota(new Double(5)));
		
		ProducerTemplate producer = camelContext.createProducerTemplate();
		producer.requestBodyAndHeader("direct:start", userName, "userName", userName, String.class);
		 
		//String result = producer.requestBodyAndHeader("direct:start", userName, "userName", userName, String.class);
		//System.out.println("---s----");
		//System.out.println(result); 
		
        //String result = producer.requestBody("direct:start", userName, String.class);
        //qt.setService(of.createQuotaTypeService(result));
        
		qr.setQuota(of.createQuotaType(qt));
		qr.setSuccess(of.createBasicReturnSuccess(true));
		
		
		return qr;
	}

	@Override
	public BasicReturn provisionTal2ASubscriber(String key, String userName, String serviceName, String startDate,
			String endDate, boolean resetConsumedQuota, double carryOver) {
		// TODO Auto-generated method stub
		return null;
	}
}
