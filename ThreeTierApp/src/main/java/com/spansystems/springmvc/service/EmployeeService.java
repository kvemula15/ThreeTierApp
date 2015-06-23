package com.spansystems.springmvc.service;

import java.util.List;

import com.spansystems.springmvc.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees(); 
	
	void deleteEmployeeBySsn(String ssn);
	
	List<Employee> findEmployeeBySsn(String ssn);
	
	void updateEmployee(Employee employee);
}
