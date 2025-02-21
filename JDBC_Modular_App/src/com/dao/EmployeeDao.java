package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDao {

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into Employee values(2,'raj','goa')");
		System.out.println("Data is inserted...");
		c.close();
	}
}
