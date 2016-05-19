package com.ahmetmesut.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahmetmesut.dao.UserDao;
import com.ahmetmesut.model.User;
@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void create(User user) {
		sessionFactory.getCurrentSession().save(user);
		return;
		
	}

	@Override
	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM " + User.class.getName()).list();
	}

	@Override
	public User update(User user) {
		sessionFactory.getCurrentSession().update(user);
		return user;
	}

	@Override
	public User findUserById(long id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}
	  @PersistenceContext
	  private EntityManager entityManager;

}
