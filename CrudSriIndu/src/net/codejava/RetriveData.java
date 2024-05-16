package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "root";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM Employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String employeename = result.getString(2);
			    String employeeaddress = result.getString(3);
			    
			    String output = "User #%d: %s - %s ";
			    System.out.println(String.format(output, ++count, employeename,employeeaddress));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
