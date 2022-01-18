
package atm.simulation;

import java.sql.*;

// For Connecting the database

public class Conn {
	
// global variables
	
	Connection c;
	Statement s;
	
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// register JDBC driver in our program
			c= DriverManager.getConnection("jdbc:mysql:///projectDB1","root","@#aman@#");
			s= c.createStatement();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}