package com.ahmetsahinoglu.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	
	private static final long serialVersionUID = -4664310882609220223L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@OneToMany
	@JoinTable(name="DEPARTMENT_EMPLOYEE",
	joinColumns = @JoinColumn(name="DEPARTMENT_ID"),
	inverseJoinColumns = @JoinColumn(name="EMPLOYEE_ID"))
	private List<Employee> employee = new ArrayList<Employee>();
	
	public Department() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	
	
	

}
