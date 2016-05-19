package com.ahmetmesut.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahmetmesut.dao.MeetingDao;
import com.ahmetmesut.model.Meeting;

@SuppressWarnings("unchecked")
@Repository
public class MeetingDaoImpl implements MeetingDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public MeetingDaoImpl() {
		System.out.println(" MeetingDaoImpl()");
	}

	@Override
	public void createMeeting(Meeting meeting) {
		sessionFactory.getCurrentSession().save(meeting);

	}

	@Override
	public List<Meeting> allMeeting() {
		return sessionFactory.getCurrentSession().createQuery("FROM " + Meeting.class.getName()).list();
		
	}

	@Override
	public Meeting updateMeeting(Meeting meeting) {
		sessionFactory.getCurrentSession().update(meeting);
		return meeting;
	}

	@Override
	public void deleteMeeting(Meeting meeting) {
		sessionFactory.getCurrentSession().delete(meeting);

	}

	@Override
	public Meeting findMeetingById(int meetId) {
		return sessionFactory.getCurrentSession().get(Meeting.class, meetId);
	}



}
