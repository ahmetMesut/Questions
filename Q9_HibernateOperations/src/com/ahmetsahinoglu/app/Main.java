package com.ahmetsahinoglu.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ahmetsahinoglu.model.Department;
import com.ahmetsahinoglu.model.Employee;
import com.ahmetsahinoglu.model.Meeting;

public class Main {
	
	public static void main(String[] args) {

		Employee employee = new Employee("Ahmet", "Mesut", "100");
		
		Department departmentSoftware = new Department();
		departmentSoftware.setName("Software");
		departmentSoftware.setDescription("Software Departmet");
		departmentSoftware.getEmployee().add(employee);
		
		
		Meeting meeting = new Meeting();
		meeting.setName("Investment");
		meeting.setDescription("It will be important decisions.");
		meeting.getDepartment().add(departmentSoftware);
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
			session.save(employee);
			session.save(departmentSoftware);
			session.save(meeting);
			
		
		session.getTransaction().commit();
		session.close();
		
	}

}
