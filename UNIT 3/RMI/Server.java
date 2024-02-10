import java.rmi.*;

public class Server
{
	public static void main(String args[])
	{
		try
		{
			Adder stub=new AdderRemote();

			Naming.bind("//localhost:5555/mnc",stub);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
