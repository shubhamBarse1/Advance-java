package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee {

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");	
		PreparedStatement ps = c.prepareStatement("insert into employee(emp_id,name,city)values(?,?,?)");
		ps.setInt(1, 2);
		ps.setString(2, "raj");
		ps.setString(3, "goa");
		ps.executeUpdate();	
		System.out.println("Data is inserted...");
		c.close();	
	}
	
	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");	
		PreparedStatement ps = c.prepareStatement("delete from employee where emp_id=?");
		ps.setInt(1, 2);
		ps.executeUpdate();
		System.out.println("Data is deleted...");
		c.close();	
	}
	public void updateData() throws Exception {	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");	
		PreparedStatement ps = c.prepareStatement("update employee set name=?,city=? where emp_id =?");
		ps.setInt(3, 1);
		ps.setString(1,"viraj");
		ps.setString(2, "nagpur");
		ps.executeUpdate();
		System.out.println("Data is updated...");
		c.close();
	}

	public void getAllRecord() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");	
		PreparedStatement ps = c.prepareStatement("select * from employee");	
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
		}
		c.close();
	}

}








