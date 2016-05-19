package com.ahmetsahinoglu.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="meeting_table")
public class Meeting implements Serializable {
	

	private static final long serialVersionUID = 3563653324766402318L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String description;
	
	@ManyToMany
	@JoinTable(name="MEETING_DEPARTMENT",
	joinColumns = @JoinColumn(name="MEETING_ID"),
	inverseJoinColumns = @JoinColumn(name="DEPARTMENT_ID"))
	private Collection<Department> department = new ArrayList<Department>();
	
	public Meeting() {
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

	public Collection<Department> getDepartment() {
		return department;
	}

	public void setDepartment(Collection<Department> department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}
	
	

}
