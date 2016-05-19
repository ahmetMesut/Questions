package com.ahmetmesut.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahmetmesut.dao.EmployeeDao;
import com.ahmetmesut.model.Employee;

@SuppressWarnings("unchecked")
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory; 
	
	public EmployeeDaoImpl() {
		System.out.println("EmployeeDaoImpl()");
	}

	@Override
	public void createEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		
	}

	@Override
	public List<Employee> allEmployee() {
		return sessionFactory.getCurrentSession().createQuery("FROM " + Employee.class.getName()).list();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);
		
	}

	@Override
	public Employee findEmployeeById(int empId) {
		return sessionFactory.getCurrentSession().get(Employee.class, empId);
	}

	@Override
	public List<Employee> allEmployeeNames() {
		return sessionFactory.getCurrentSession().createSQLQuery("SELECT empName FROM factorydb.employee_table").list();
	}
	



}
