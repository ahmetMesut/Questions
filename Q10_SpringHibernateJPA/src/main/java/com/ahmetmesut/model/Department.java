package com.ahmetmesut.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="department_table")
public class Department implements Serializable {
	
	
	private static final long serialVersionUID = -7341734236861807964L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int depId;
	
	@Column
	private String depName;
	
	@Column
	private String depDescription;
	
	

	@OneToMany(fetch=FetchType.EAGER)
	@JoinTable(name="DEPARTMENT_EMPLOYEE",
	joinColumns = @JoinColumn(name="DEPARTMENT_ID"),
	inverseJoinColumns = @JoinColumn(name="EMPLOYEE_ID")) 
	private List<Employee> employee = new ArrayList<Employee>();
	
	public Department() {
		System.out.println(" Department()");
	}
	

	public Department(String depName, String depDescription, List<Employee> employee) {
		super();
		this.depName = depName;
		this.depDescription = depDescription;
		this.employee=employee;
	}


	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	


	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee=employee;
	}


	public String getDepDescription() {
		return depDescription;
	}


	public void setDepDescription(String depDescription) {
		this.depDescription = depDescription;
	}
	
	
}
