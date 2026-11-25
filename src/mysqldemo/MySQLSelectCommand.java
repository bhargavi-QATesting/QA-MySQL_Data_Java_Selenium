package mysqldemo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSelectCommand {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db","root","Root@123");
		
		Statement stmt = con.createStatement();
		
		String s = "select emp_id,emp_name,city from employees";
		
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next())
		{
			int eid = rs.getInt("emp_id");
			String ename = rs.getString("emp_name");
			String ecity = rs.getString("city");
			
			System.out.println(eid+"    "+ename+"    "+ecity);
		}
		
		con.close();
		
		System.out.println("Query executed....");
	}

}

