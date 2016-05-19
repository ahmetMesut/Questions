package com.ahmetmesut.dao;

import java.util.List;

import com.ahmetmesut.model.User;

public interface UserDao {
	
	public void create(User user);
	
	public void delete(User user);
	
	public List<User> getAll();
	
	public User update(User user);
	
	public User findUserById(long id);

}
