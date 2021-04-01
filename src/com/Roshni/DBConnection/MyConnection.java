package com.Roshni.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection connectTo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventregister","root","Roshnirao2301$");
			if(con!= null) {
				System.err.println("Connection Established");
				return con;
			}else {
				System.err.println("Connection not established");
			}
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}catch (SQLException ex) {
			// TODO: handle exception
		}
		return null;
		
	}
	public static void main(String[] args) {
		MyConnection.connectTo();
		
	}
}

