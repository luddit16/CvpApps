package com.cvpapps.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cvpapps.constants.QueryConstants;
import com.cvpapps.dao.DaoManager;
import com.cvpapps.model.CVPLeadMaster;
import com.cvpapps.model.CVPLeadMasterMapper;

public class DaoManagerImpl implements DaoManager {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<CVPLeadMaster> getLeadData(String userId) {
		CVPLeadMaster cvpLeadMaster = new CVPLeadMaster();
		List<CVPLeadMaster> leadDataList =  (List<CVPLeadMaster>) jdbcTemplate
				.query(QueryConstants.getLeadData, new Object[] { userId },
						new CVPLeadMasterMapper());		
		
		return leadDataList;		
	}
	
	public int updateData(String query,Object[] params){
		int rowsUpdated = jdbcTemplate.update(query,params);
		return rowsUpdated;
	}
	
	public void getUserData() {
		String sql = "select count(*) from user_master";
		int total = getJdbcTemplate().queryForInt(sql);
		System.out.println("Total rows got "+total);
	}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	

	

	
}
