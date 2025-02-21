package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	// Bussiness logic
	
	public void insertData() throws Exception {
		EmployeeDao ed  = new EmployeeDao();
		ed.insertData();
	}
	
}
