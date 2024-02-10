package mnc.webservices;

import javax.jws.*;
 
//Service Endpoint Interface

@WebService
@SOAPBinding(style = Style.DOCUMENT)

public interface HelloWorld
{
	@WebMethod 
	String getHelloWorldAsString(String name);
}