package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Students {

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204?useSSL=true", "root", "root");

		Statement s = c.createStatement();

		s.executeUpdate("update students set name='ram' where id=1");

		System.out.println("Data is updated Successfully...");

		c.close();

	}
	public void deleteData() throws Exception {

	}
	
	public void insertData() throws Exception {

	}
	
	public void getallData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204?useSSL=true", "root", "root");
		Statement s = c.createStatement();	
		 ResultSet rs = s.executeQuery("select * from students");
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+"   "+rs.getString(3));
		 }		
	}
	
	
	public static void main(String[] args) throws Exception {

		Students s = new Students();
		
//		s.insertData();
		s.updateData();
//		s.deleteData();
		s.getallData();
		

	}

}
