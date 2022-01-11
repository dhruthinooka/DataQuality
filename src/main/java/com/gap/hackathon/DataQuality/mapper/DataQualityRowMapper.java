package com.gap.hackathon.DataQuality.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gap.hackathon.DataQuality.Model.DataValidation1;

public class DataQualityRowMapper implements RowMapper<DataValidation1> {

	@Override
	public DataValidation1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		DataValidation1 dv = new DataValidation1();
		dv.setOrderId(rs.getInt("ORDER_ID"));
		dv.setCustomerId(rs.getInt("CUSTOMER_ID") == 0? null : rs.getInt("CUSTOMER_ID"));
		dv.setErrorCode(rs.getString("ERROR_CODE"));
		dv.setErrorMessage(rs.getString("ERROR_MESSAGE"));
		dv.setErrorType(rs.getString("ERROR_TYPE"));
		dv.setNetSaleAmt(rs.getDouble("NET_SALES_AMT"));
		dv.setTransactionDate(rs.getString("TRANSACTION_DATE"));
		dv.setStoreLocationCode(rs.getString("STORE_LOCATION_CODE"));
		dv.setChannel(rs.getString("CHANNEL"));
		return dv;
	}

}
