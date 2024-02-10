import java.net.*;  
public class InetDemo 
{
	
	public static void main(String[] args) 
	{  
	    try {
		   	InetAddress ip[] =InetAddress.getAllByName("www.google.co.in");  
		   	
		   	 //System.out.println("Host Name: "+ ip.getHostName()); 
		   	for(InetAddress adr:ip)
		   		System.out.println("Host Address:" + adr.getHostAddress());  
		   	
	    }
	    catch(UnknownHostException e) 
	   	{
	        System.out.println(e);
	    }  
	 }
}