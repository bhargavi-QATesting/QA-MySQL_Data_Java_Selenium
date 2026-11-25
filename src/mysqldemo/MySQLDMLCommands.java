package mysqldemo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDMLCommands {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Root@123");
		
		Statement stmt = con.createStatement();
		//String s = "INSERT INTO student VALUES(103,'Smith')";
		//String s = "UPDATE STUDENT SET SNAME='DAVID' WHERE SID=103";
		String s = "delete from student where sid = 103";
		
		stmt.execute(s);
		
		con.close();
		
		System.out.println("Query executed....");
	}

}

