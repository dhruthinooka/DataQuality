package com.gap.hackathon.DataQuality.Repository;


import com.gap.hackathon.DataQuality.Model.DataValidation;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DataQualityRepository extends JpaRepository<ErrorCountDetails, String> {

    @Query("SELECT errorCode,errorMessage,errorType,count(*) from DATA_VALIDATE group by errorCode")
    List<ErrorCountDetails> findCountForAllErrorCodes();

    @Query("SELECT * from DATA_VALIDATE where errorCode=:errorCode")
    List<DataValidation> fetchDataByErrorCode(@Param("errorCode")String errorCode);
}