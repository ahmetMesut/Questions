package com.ahmetmesut.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_table")
public class Employee implements Serializable {

	private static final long serialVersionUID = -5704361191292565232L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empSurname")
	private String empSurname;
	
	@Column(name="empSalary")
	private String empSalary;
	
	public Employee() {
		System.out.println("Employee()");
	}
	
	

	public Employee(String empName, String empSurname, String empSalary) {
		super();
		this.empName = empName;
		this.empSurname = empSurname;
		this.empSalary = empSalary;
	}



	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSurname() {
		return empSurname;
	}

	public void setEmpSurname(String empSurname) {
		this.empSurname = empSurname;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	

	
}
