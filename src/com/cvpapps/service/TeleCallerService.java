package com.cvpapps.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cvpapps.dao.DaoManager;
import com.cvpapps.model.CVPLeadMaster;

public class TeleCallerService {
	private static ApplicationContext context =  new ClassPathXmlApplicationContext("cvpapps-servlet.xml");

	public List<CVPLeadMaster> getLeadData(String userId) {
		DaoManager daoManager = (DaoManager) context.getBean("daoService");
		List<CVPLeadMaster> leadList = daoManager.getLeadData(userId);
		return leadList;
	}
	
	
	 
}
