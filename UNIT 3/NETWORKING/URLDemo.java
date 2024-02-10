import java.net.*;
public class URLDemo {
	public static void main(String[] args)
	{  
		  try {
		      URL url = new URL("http://www.google.com/search?q=url+with+query+parameters&rlz=1C1VDKB_enIN953IN953&oq=url+with+qu&aqs=chrome.0.0i512j69i57j0i512l7j0i390.4839j0j7&sourceid=chrome&ie=UTF-8");  
		      //URL url = new URL("https://docs.oracle.com/javase/7/docs/api/java/net/URL.html");
		      System.out.println("Protocol: "+url.getProtocol());  
		      System.out.println("Host Name: "+url.getHost());  
		      System.out.println("Port Number: "+url.getPort());  
		      System.out.println("Default Port Number: "+url.getDefaultPort());   
		      System.out.println("File Name: "+url.getFile());  
		      System.out.println("Path: "+url.getPath()); 
		      System.out.println("Query: "+url.getQuery());
	}
				  catch(Exception e) 
		  {
		      System.out.println(e);
		  }  
	}  
}