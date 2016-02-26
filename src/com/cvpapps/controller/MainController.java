/**
 * 
 */
package com.cvpapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author cvpapps.com
 *
 */
@Controller
public class MainController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView initialize() {
 		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login() {
 		return new ModelAndView("dashboard");
	}
}
