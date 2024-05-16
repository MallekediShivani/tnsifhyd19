package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE Employee SET employeename=?,employeeaddress=? WHERE employee_id=2";
		    		
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "amit");
		    statement.setString(2, "mbnr");
		   // statement.setString(3, "bill.gates@microsoft.com");
		    //statement.setString(4, "bill");
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing  emp was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
