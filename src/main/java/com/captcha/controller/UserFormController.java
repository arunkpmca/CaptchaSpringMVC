package com.captcha.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.captcha.model.UserRegistration;
import com.captcha.service.UserService;


@Controller
public class UserFormController {
	
  @Autowired
  public UserService userService;
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("userRegistration");
		mav.addObject("userRegistration", new UserRegistration());
		return mav;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("userRegistration") UserRegistration userRegistration) {
		userService.register(userRegistration);
		return new ModelAndView("userRegistration", "name", userRegistration.getName());

	}

}
