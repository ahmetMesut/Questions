package com.ahmetmesut.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ahmetmesut.model.Department;
import com.ahmetmesut.model.Meeting;
import com.ahmetmesut.service.DepartmentService;
import com.ahmetmesut.service.MeetingService;



@Controller
public class MeetingController {
	
	@Autowired
	MeetingService meetingService;
	
	@Autowired
	DepartmentService departmentService;
	
	private static final Logger logger = Logger.getLogger(MeetingController.class);
	
	public MeetingController() {
		System.out.println("MeetingController() ");
	}
	
	@RequestMapping("newMeeting")
	public ModelAndView newMeeting(@ModelAttribute Meeting meeting) {
		logger.info("Meeting creating.INFO: " + meeting);
		List<Department> depNames = departmentService.allDepartmentNames();
		ModelAndView mav = new ModelAndView("meetingForm");
		mav.addObject("depNames", depNames);
		return mav;
	
		
	}
	
		@RequestMapping("editMeeting")
	    public ModelAndView updateMeeting(@RequestParam int id, @ModelAttribute Meeting meeting) {
	    	logger.info("Meeting editing. Id : "+id);
	    	meeting = meetingService.findMeetingById(id);
	    	List<Department> depNames = departmentService.allDepartmentNames();
	    	ModelAndView mav = new ModelAndView("meetingForm");
	    	mav.addObject("meetingObject", meeting);
	    	mav.addObject("depNames", depNames);
	        return mav;
	    }
	    
	    @RequestMapping("saveMeeting")
	    public ModelAndView saveMeeting(@ModelAttribute Meeting meeting) {
	    	logger.info("Meeting saving.INFO : " + meeting);
	        if(meeting.getMeetId() == 0){ 
	        	meetingService.createMeeting(meeting);
	        } else {
	        	meetingService.updateMeeting(meeting);
	        }
	        return new ModelAndView("redirect:listAllMeeting");
	    }
	    
	    @RequestMapping("removeMeeting")
	    public ModelAndView deleteMeeting(@RequestParam int id) {
	    	logger.info("Meeting deleting. Id : "+id);
	    	Meeting meeting = meetingService.findMeetingById(id);
	    	meetingService.deleteMeeting(meeting);
	        return new ModelAndView("redirect:listAllMeeting");
	    }
	    
	    @RequestMapping("listAllMeeting")
	    public ModelAndView findAllMeeting() {
	    	logger.info("All meeting.");
	        List<Meeting> meetingList = meetingService.allMeeting();
	        return new ModelAndView("meetingList", "meetingList", meetingList);
	    }

	
   
}
