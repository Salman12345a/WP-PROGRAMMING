package mnc.webservices;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class HelloWorldPublisher
{
 	public static void main(String args[ ]) 
	{
	   	Endpoint.publish("http://localhost:6666/ws/hello", new HelloWorldImpl());
    	}
 }