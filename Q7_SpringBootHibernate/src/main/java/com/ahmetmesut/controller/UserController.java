package com.ahmetmesut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ahmetmesut.dao.UserDao;
import com.ahmetmesut.model.User;


@Controller
@RequestMapping({"/user","/"})
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	
	//-------------------------------
	
	public UserController() {
		System.out.println("UserController()");
	}
	//--------------------------------

    @RequestMapping(value="", method=RequestMethod.GET)
    public String listUser(Model model) {
        model.addAttribute("userList", userDao.getAll());
        return "user/userList";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
    	User user = userDao.findUserById(id);
        userDao.delete(user);
        return new ModelAndView("redirect:/user");
    }

    @RequestMapping(value="/newUser", method = RequestMethod.GET)
    public String newUser() {
        return "user/newUser";
    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public ModelAndView createUser(@RequestParam("name") String name,@RequestParam("surname") String surname,
    							   @RequestParam("adress") String adress) {
        userDao.create(new User(name, surname, adress));
        return new ModelAndView("redirect:/user");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("user_id") long id, @RequestParam("name") String name,
    						   @RequestParam("surname") String surname,@RequestParam("adress") String adress) {
    	User user = userDao.findUserById(id);
    	user.setName(name);
    	user.setSurname(surname);
    	user.setAdress(adress);
        userDao.update(user);
        return new ModelAndView("redirect:/user");
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id,Model model) {
        User user = userDao.findUserById(id);
        model.addAttribute("user", user);
        return "user/edit";
    }

} 
