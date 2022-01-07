package com.gap.hackathon.DataQuality.Repository;


import com.gap.hackathon.DataQuality.Model.DataValidation;
import com.gap.hackathon.DataQuality.Model.ErrorCountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataValidationRepository extends JpaRepository<DataValidation, Integer> {

    @Query("SELECT errorCode,errorMessage,errorType,count(*) from DataValidation group by errorCode")
    List<ErrorCountDetails> findCountForAllErrorCodes();

    @Query("SELECT orderId,customerId,firstName,lastName,netSaleAmt,transactionDate,storeLocationCode,channel from DataValidation where errorCode=:errorCode")
    List<DataValidation> fetchDataByErrorCode(@Param("errorCode")String errorCode);
}