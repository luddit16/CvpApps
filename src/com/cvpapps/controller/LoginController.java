/**
 * 
 */
package com.cvpapps.controller;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cvpapps.form.LoginForm;
import com.cvpapps.util.PBKDF2Hash;

/**
 * @author cvpapps.com
 *
 */
@Controller
public class LoginController {

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
		
		String hashedPassword = null;
		try {
			hashedPassword=PBKDF2Hash.generateStorngPasswordHash(loginForm.getPassword());
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Encrypted password is "+hashedPassword);
 		return new ModelAndView("dashboard");
	}
}
