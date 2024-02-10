import java.rmi.*;
import java.util.*;

public class Client
{
	public static void main(String args[])
	{
		try
		{
			Adder stub=(Adder)Naming.lookup("//localhost:5555/mnc");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter value a:");
			int a = s.nextInt();

			System.out.println("Enter value b:");
			int b = s.nextInt();

			System.out.println("Sum is:"+stub.add(a,b));

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
