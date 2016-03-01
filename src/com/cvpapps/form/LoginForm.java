package com.cvpapps.form;

import java.io.Serializable;

public class LoginForm implements Serializable{

	
	/**
	 * This is the form class for Login page
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
