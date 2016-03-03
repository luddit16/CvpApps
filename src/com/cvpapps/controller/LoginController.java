/**
 * 
 */
package com.cvpapps.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cvpapps.form.LoginForm;

/**
 * @author cvpapps.com
 *
 */
@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView initialize(@ModelAttribute("loginForm") LoginForm loginForm) {
 		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("loginForm") LoginForm loginForm,
			HttpServletRequest request, Model model) {
 		return new ModelAndView("dashboard");
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerNewUser(@ModelAttribute("registrationForm") LoginForm loginForm) {
		loginForm = null;
 		return new ModelAndView("register");
	}
}
