package com.gap.hackathon.DataQuality.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


    private Double netSaleAmt;


    private String transactionDate;


    private String storeLocationCode;


    private String channel;
}
