package com.cvpapps.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cvpapps.dao.DaoManager;

public class DaoManagerImpl implements DaoManager {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
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
