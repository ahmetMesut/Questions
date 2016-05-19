package com.ahmetmesut.service;

import java.util.List;

import com.ahmetmesut.model.Employee;

public interface EmployeeService {

	public void createEmployee(Employee employee);
	
	public List<Employee> allEmployee();
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Employee employee);
	
	public Employee findEmployeeById(int id);
	
	public List<Employee> allEmployeeNames();
}
