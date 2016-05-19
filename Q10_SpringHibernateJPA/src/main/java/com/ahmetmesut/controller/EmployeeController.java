package com.ahmetmesut.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ahmetmesut.model.Employee;
import com.ahmetmesut.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	 EmployeeService employeeService;
	
	private static final Logger logger = Logger.getLogger(EmployeeController.class);
	
	 public EmployeeController() {
		 System.out.println("EmployeeController()");
	}
	
	@RequestMapping("newEmployee")
	public ModelAndView newEmployee(@ModelAttribute Employee employee) {
		logger.info("Employee creating.INFO: " + employee);
		return new ModelAndView("employeeForm");
		
	}
	
		@RequestMapping("editEmployee")
	    public ModelAndView updateEmployee(@RequestParam int id, @ModelAttribute Employee employee) {
	    	logger.info("Employee editing. Id : "+id);
	    	employee = employeeService.findEmployeeById(id);
	        return new ModelAndView("employeeForm", "employeeObject", employee);
	    }
	    
	    @RequestMapping("saveEmployee")
	    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
	    	logger.info("Employee saving.INFO : " + employee);
	        if(employee.getEmpId() == 0){ 
	        	employeeService.createEmployee(employee);
	        } else {
	        	employeeService.updateEmployee(employee);
	        }
	        return new ModelAndView("redirect:listAllEmployee");
	    }
	    
	    @RequestMapping("removeEmployee")
	    public ModelAndView deleteEmployee(@RequestParam int id) {
	    	logger.info("Employee deleting. Id : "+id);
	    	Employee employee = employeeService.findEmployeeById(id);
	    	employeeService.deleteEmployee(employee);
	        return new ModelAndView("redirect:listAllEmployee");
	    }
	    
	    @RequestMapping("listAllEmployee")
	    public ModelAndView findAllEmployee() {
	    	logger.info("All employee.");
	        List<Employee> employeeList = employeeService.allEmployee();
	        return new ModelAndView("employeeList", "employeeList", employeeList);
	    }

}
