package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//step 1 add jar 
public class Demo {
	public static void main(String[] args) throws Exception {
		// step 2 register and Load Driver Class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// step 3 Get Connection 		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		
		// step 4 Statement & preparedStatement		
		Statement  s = c.createStatement();
		
		// step 5
		s.executeUpdate("insert into students values(3,'shree','nashik')");
		
		System.out.println("Data is inserted Successfully...");
		// step 6  close all connection
		c.close();
	}
	
	
}
