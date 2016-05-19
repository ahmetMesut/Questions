package com.ahmetmesut.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahmetmesut.dao.DepartmentDao;
import com.ahmetmesut.model.Department;


@SuppressWarnings("unchecked")
@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public DepartmentDaoImpl() {
		System.out.println("DepartmentDaoImpl()");
	}

	@Override
	public void createDepartment(Department department) {
		sessionFactory.getCurrentSession().save(department);

	}
	
	@Override
	public List<Department> allDepartment() {
		return sessionFactory.getCurrentSession().createQuery("FROM " + Department.class.getName()).list();
	}

	@Override
	public Department updateDepartment(Department department) {
		 sessionFactory.getCurrentSession().update(department);
		 return department;
	}

	@Override
	public void deleteDepartment(Department department) {
		sessionFactory.getCurrentSession().delete(department);

	}

	@Override
	public Department findDepartmentById(int depId) {
		return sessionFactory.getCurrentSession().get(Department.class, depId);
	}

	@Override
	public List<Department> allDepartmentNames() {
		return sessionFactory.getCurrentSession().createSQLQuery("SELECT depName FROM factorydb.department_table").list();
	}


}
