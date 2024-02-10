import java.io.*;  
import java.net.*;  

public class MyServer 
{  
	public static void main(String[] args)
	{  
		try
		{  
			ServerSocket ss=new ServerSocket(6665);  
			Socket s=ss.accept();	//establishes a connection   

			DataInputStream din=new DataInputStream(s.getInputStream());  

			String  str=din.readUTF();  
			System.out.println("message= "+str);  
			
			din.close();	
			s.close();
			ss.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}  
} 