package com.ahmetmesut.dao;

import java.util.List;

import com.ahmetmesut.model.Employee;


public interface EmployeeDao {
	
	
	public void createEmployee(Employee employee);
	
	public List<Employee> allEmployee();
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Employee employee);
	
	public Employee findEmployeeById(int empId);
	
	public List<Employee> allEmployeeNames();
	
	
	
	
}
