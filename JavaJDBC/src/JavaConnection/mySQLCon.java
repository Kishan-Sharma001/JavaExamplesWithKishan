package JavaConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mySQLCon {

	public mySQLCon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws  SQLException {
		
	//1.Register the jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//2.Create connection object using getConnection Method of DriveManager class 
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadd_centre","root","....");
		
		// 3.create a statement object
		// create Instance of Statement type using createStatement method of Connection Interface;
		Statement stmt = conn.createStatement();
		
		//4. execute query
		// create a object of ResultSet type with executeQUery of Statement interface
		ResultSet rs = stmt.executeQuery("select*from student");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(5));
		}
		
		conn.close();

	}

}
