package com.cvpapps.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CVPLeadMasterMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CVPLeadMaster cvpLeadMaster = new CVPLeadMaster();
		cvpLeadMaster.setLeadId(rs.getString("lead_id"));
		cvpLeadMaster.setDate(rs.getString("DATE"));
		cvpLeadMaster.setYear(rs.getString("year"));
		cvpLeadMaster.setMonth(rs.getString("month"));
		cvpLeadMaster.setHomeCircle(rs.getString("HOME_CIRCLE"));
		cvpLeadMaster.setBillingCirle(rs.getString("BILLING_CIRCLE"));
		cvpLeadMaster.setDateOfLogin(rs.getString("DATE_OF_LOGIN"));
		cvpLeadMaster.setLot(rs.getString("LOT"));
		cvpLeadMaster.setMsisdin(rs.getString("MSISDN"));
		cvpLeadMaster.setCefStatus(rs.getString("CEF_STATUS"));
		cvpLeadMaster.setAvStatus(rs.getString("AV_STATUS"));
		return null;
	}

}
