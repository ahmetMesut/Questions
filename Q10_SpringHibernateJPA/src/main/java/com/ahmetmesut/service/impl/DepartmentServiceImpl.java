package com.ahmetmesut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahmetmesut.dao.DepartmentDao;
import com.ahmetmesut.model.Department;
import com.ahmetmesut.service.DepartmentService;


@Transactional
@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao departmentDao;
	
	@Override
	public void createDepartment(Department department) {
		departmentDao.createDepartment(department);
		
	}

	@Override
	public List<Department> allDepartment() {
		return departmentDao.allDepartment();
	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentDao.updateDepartment(department);
	}

	@Override
	public void deleteDepartment(Department department) {
		departmentDao.deleteDepartment(department);
		
	}

	@Override
	public Department findDepartmentById(int id) {
		return departmentDao.findDepartmentById(id);
	}

	@Override
	public List<Department> allDepartmentNames() {
		return departmentDao.allDepartmentNames();
	}

	

}
