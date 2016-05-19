package com.ahmetmesut.model;

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
public class Meeting implements Serializable{

	private static final long serialVersionUID = 4116361972733423083L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int meetId;
	
	@Column(name="meetName")
	private String meetName;
	
	@Column(name="meetDescription")
	private String meetDescription;
	
	@ManyToMany
	@JoinTable(name="MEETING_DEPARTMENT",
	joinColumns = @JoinColumn(name="MEETING_ID"),
	inverseJoinColumns = @JoinColumn(name="DEPARTMENT_ID"))
	private Collection<Department> department = new ArrayList<Department>();
	
	public Meeting() {
		System.out.println(" Meeting()");
	}
	
	

	public Meeting(String meetName, String meetDescription, Collection<Department> department) {
		super();
		this.meetName = meetName;
		this.meetDescription = meetDescription;
		this.department = department;
	}



	public String getMeetName() {
		return meetName;
	}

	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}

	public String getMeetDescription() {
		return meetDescription;
	}

	public void setMeetDescription(String meetDescription) {
		this.meetDescription = meetDescription;
	}

	public Collection<Department> getDepartment() {
		return department;
	}

	public void setDepartment(Collection<Department> department) {
		this.department = department;
	}

	public int getMeetId() {
		return meetId;
	}


	public void setMeetId(int meetId) {
		this.meetId = meetId;
	}
	

}
