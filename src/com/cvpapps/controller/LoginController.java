/**
 * 
 */
package com.cvpapps.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cvpapps.dao.DaoManager;
import com.cvpapps.form.LoginForm;
import com.cvpapps.util.PBKDF2Hash;

/**
 * @author cvpapps.com
 *
 */
@Controller
public class LoginController {
	private static ApplicationContext context =  new ClassPathXmlApplicationContext("cvpapps-servlet.xml");

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView initialize(@ModelAttribute("loginForm") LoginForm loginForm) {
 		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("loginForm") LoginForm loginForm,
			HttpServletRequest request, Model model) {
		
		System.out.println("I am in controller");
		System.out.println("The Email data is:"+loginForm.getEmail());
		System.out.println("Original password is "+loginForm.getPassword());

		DaoManager daoService = (DaoManager) context.getBean("daoService");
		daoService.getUserData();
		
		String hashedPassword = null;
		try {
			hashedPassword=PBKDF2Hash.generateStorngPasswordHash(loginForm.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Encrypted password is "+hashedPassword);
 		return new ModelAndView("dashboard");
	}
}
