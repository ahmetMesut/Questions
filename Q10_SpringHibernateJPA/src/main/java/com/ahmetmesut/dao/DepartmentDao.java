package com.ahmetmesut.dao;

import java.util.List;

import com.ahmetmesut.model.Department;



public interface DepartmentDao {
	
	public void createDepartment(Department department);
	
	public List<Department> allDepartment();
	
	public Department updateDepartment(Department department);
	
	public void deleteDepartment(Department department);
	
	public Department findDepartmentById(int depId);	
	
	public List<Department> allDepartmentNames();

}