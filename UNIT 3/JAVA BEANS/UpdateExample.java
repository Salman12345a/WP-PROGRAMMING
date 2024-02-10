import java.sql.*;

public class UpdateExample 
{
	static final String DB_URL = "jdbc:mysql://localhost:3306/mnc";
   	static final String USER = "root";
   	static final String PWD = "1234";
   	static final String QUERY = "INSERT INTO student VALUES(999, 'efgh', 21, 'uuuuuuuuuu')";

   	public static void main(String args[]) throws SQLException
   	{
   		Connection con = DriverManager.getConnection(DB_URL, USER, PWD);
      		Statement stmt = con.createStatement();
      		stmt.executeUpdate(QUERY);

		System.out.println("Record Inserted Successfully");
        
      		stmt.close();
		con.close();
   
   	} 
}