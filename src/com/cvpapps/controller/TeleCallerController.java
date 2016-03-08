package com.cvpapps.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cvpapps.form.LoginForm;
import com.cvpapps.model.CVPLeadMaster;
import com.cvpapps.service.TeleCallerService;

@Controller
public class TeleCallerController {
	
	
	@RequestMapping(value = "/loadLeadDetails", method = RequestMethod.GET)
	public ModelAndView getLeadData(@ModelAttribute("loginForm") LoginForm loginForm) {
		
		TeleCallerService teleCallerService = new TeleCallerService();
		List<CVPLeadMaster> leadDataList = teleCallerService.getLeadData(loginForm.getUser_id());
 		return new ModelAndView("dashboard");
	}
	
	

}
