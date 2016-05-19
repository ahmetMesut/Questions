package com.ahmetmesut.service;

import java.util.List;

import com.ahmetmesut.model.Meeting;


public interface MeetingService {

	public void createMeeting(Meeting meeting);
	
	public List<Meeting> allMeeting();
	
	public Meeting updateMeeting(Meeting meeting);
	
	public void deleteMeeting(Meeting meeting);
	
	public Meeting findMeetingById(int id);
	

}
