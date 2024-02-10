import java.io.*;  
import java.net.*;  

public class MyClient 
{  
	public static void main(String[] args) 
	{  
		try
		{      
			Socket s=new Socket("localhost",6665);  

			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			
			dout.writeUTF(str);  

			dout.flush();  
			dout.close();  
			s.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}  
}  