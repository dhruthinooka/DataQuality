package com.gap.hackathon.DataQuality.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gap.hackathon.DataQuality.Model.DataValidation1;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;
import com.gap.hackathon.DataQuality.mapper.DataQualityRowMapper;
@Repository
public class TutorialImpl implements Tutorial{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ErrorCountDetails> findAll() {
        try {
            List<ErrorCountDetails> errorCountDetails = jdbcTemplate.query("SELECT ERROR_CODE,ERROR_MESSAGE,count(*)as count from DATA_VALIDATE group by ERROR_CODE,ERROR_MESSAGE;",
                    BeanPropertyRowMapper.newInstance(ErrorCountDetails.class));

            return errorCountDetails;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override



    public List<DataValidation1> findByErrorCode(String errorCode) {

    	return jdbcTemplate.query("SELECT * from DATA_VALIDATE where ERROR_CODE=?",new Object[] { errorCode },new DataQualityRowMapper());



    }
}
