package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		PreparedStatement ps = c.prepareStatement("insert into students values(?,?,?)");
		ps.setInt(1, 4);
		ps.setString(2, "laxam");
		ps.setString(3, "pune");
		ps.executeUpdate();
		System.out.println("Data is inserted...");
		c.close();
	} 
	
}
