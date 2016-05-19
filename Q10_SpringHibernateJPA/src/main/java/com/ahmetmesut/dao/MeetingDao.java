package com.ahmetmesut.dao;

import java.util.List;

import com.ahmetmesut.model.Meeting;


public interface MeetingDao {
	
	public void createMeeting(Meeting meeting);
	
	public List<Meeting> allMeeting();
	
	public Meeting updateMeeting(Meeting meeting);
	
	public void deleteMeeting(Meeting meeting);
	
	public Meeting findMeetingById(int meetId);

}
