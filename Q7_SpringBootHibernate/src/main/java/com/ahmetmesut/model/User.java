package com.ahmetmesut.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
public class User  implements Serializable{

  
  private static final long serialVersionUID = -8862310901844613080L;
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @NotNull
  private String name;
  @NotNull
  private String surname;
  @NotNull
  private String adress;

  public User() {
	  
  }
  

public User(String name, String surname, String adress) {
	super();
	this.name = name;
	this.surname = surname;
	this.adress = adress;
}


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}


  
} 