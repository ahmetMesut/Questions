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
import com.ahmetmesut.model.Employee;
import com.ahmetmesut.service.DepartmentService;
import com.ahmetmesut.service.EmployeeService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	@Autowired
	EmployeeService employeeService;
	
	public DepartmentController() {
		System.out.println("DepartmentController()");
	}
	
	private static final Logger logger = Logger.getLogger(DepartmentController.class);
	
	@RequestMapping("newDepartment")
	public ModelAndView newDepartment(@ModelAttribute Department department) {
		logger.info("Department creating.INFO: " + department);
		List<Employee> employeeNames = employeeService.allEmployeeNames();
		ModelAndView mav = new ModelAndView("departmentForm");
		mav.addObject("employeeNames", employeeNames);
		return mav;
		
		
	}
	
		@RequestMapping("editDepartment")
	    public ModelAndView updateDepartment(@RequestParam int id, @ModelAttribute Department department) {
	    	logger.info("Department editing. Id : "+id);
	    	department = departmentService.findDepartmentById(id);
	    	List<Employee> employeeNames = employeeService.allEmployeeNames();
	    	ModelAndView mav = new ModelAndView("departmentForm");
	    	mav.addObject("departmentObject", department);
	    	mav.addObject("employeeNames", employeeNames);
	        return mav;
	    }
	    
	    @RequestMapping("saveDepartment")
	    public ModelAndView saveDepartment(@ModelAttribute Department department) {
	    	logger.info("Department saving.INFO : " + department);
	        if(department.getDepId() == 0){ 
	        	departmentService.createDepartment(department);
	        } else {
	        	departmentService.updateDepartment(department);
	        }
	        return new ModelAndView("redirect:listAllDepartment");
	    }
	    
	    @RequestMapping("removeDepartment")
	    public ModelAndView deleteDepartment(@RequestParam int id) {
	    	logger.info("Department deleting. Id : "+id);
	    	Department department = departmentService.findDepartmentById(id);
	    	departmentService.deleteDepartment(department);
	        return new ModelAndView("redirect:listAllDepartment");
	    }
	    
	    @RequestMapping("listAllDepartment")
	    public ModelAndView findAllDepartment() {
	    	logger.info("All department.");
	        List<Department> departmentList = departmentService.allDepartment();
	        return new ModelAndView("departmentList", "departmentList", departmentList);
	    }


	
}
