package com.ahmetmesut.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahmetmesut.dao.EmployeeDao;
import com.ahmetmesut.model.Employee;
import com.ahmetmesut.service.EmployeeService;


@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public void createEmployee(Employee employee) {
		employeeDao.createEmployee(employee);

	}

	@Override
	public List<Employee> allEmployee() {
		return employeeDao.allEmployee();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);

	}

	@Override
	public Employee findEmployeeById(int id) {
		return employeeDao.findEmployeeById(id);
	}

	@Override
	public List<Employee> allEmployeeNames() {
		return employeeDao.allEmployeeNames();
	}

}
	
