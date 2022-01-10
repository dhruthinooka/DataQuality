package com.gap.hackathon.DataQuality.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataValidation1 {

    private Integer orderId;

    private Integer customerId;

    private String errorCode;


    private String errorMessage;


    private String errorType;


    private String firstName;


    private String lastName;


    private Double netSaleAmt;


    private String transactionDate;


    private String storeLocationCode;


    private String channel;
}
