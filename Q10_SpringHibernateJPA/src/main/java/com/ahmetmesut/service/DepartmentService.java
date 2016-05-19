package com.ahmetmesut.service;

import java.util.List;

import com.ahmetmesut.model.Department;


public interface DepartmentService {
	
	
	public void createDepartment(Department department);
	
	public List<Department> allDepartment();
	
	public Department updateDepartment(Department department);
	
	public void deleteDepartment(Department department);
	
	public Department findDepartmentById(int id);	
	
	public List<Department> allDepartmentNames();


}
