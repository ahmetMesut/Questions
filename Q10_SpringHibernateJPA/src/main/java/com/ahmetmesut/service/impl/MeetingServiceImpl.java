package com.ahmetmesut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahmetmesut.dao.MeetingDao;
import com.ahmetmesut.model.Meeting;
import com.ahmetmesut.service.MeetingService;


@Transactional
@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingDao meetingDao;
	
	@Override
	public void createMeeting(Meeting meeting) {
		meetingDao.createMeeting(meeting);

	}

	@Override
	public List<Meeting> allMeeting() {
		return meetingDao.allMeeting();
	}

	@Override
	public Meeting updateMeeting(Meeting meeting) {
		return meetingDao.updateMeeting(meeting);
	}

	@Override
	public void deleteMeeting(Meeting meeting) {
		meetingDao.deleteMeeting(meeting);

	}

	@Override
	public Meeting findMeetingById(int id) {
		return meetingDao.findMeetingById(id);
	}
}