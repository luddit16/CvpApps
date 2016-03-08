package com.cvpapps.dao;

import java.util.List;

import com.cvpapps.model.CVPLeadMaster;

public interface DaoManager {
	public void getUserData();	
	public List<CVPLeadMaster> getLeadData(String userId);	
	
}
