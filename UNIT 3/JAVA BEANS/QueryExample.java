import java.sql.*;

public class QueryExample 
{
	static final String DB_URL = "jdbc:mysql://localhost:3306/mnc";
   	static final String USER = "root";
   	static final String PWD = "1234";
   	static final String QUERY = "SELECT Id, Name, Age FROM student";

   	public static void main(String args[]) throws SQLException
   	{
   		Connection con = DriverManager.getConnection(DB_URL, USER, PWD);
      		Statement stmt = con.createStatement();
      		ResultSet rs = stmt.executeQuery(QUERY);
        
      		while(rs.next())
      		{
        			//Display values
        			System.out.print("ID: " + rs.getInt("Id"));
        			System.out.print(", Name: " + rs.getString("Name"));
        			System.out.println(", Age: " + rs.getInt("Age"));
      		}
		stmt.close();
		con.close();
   
   	} 

}