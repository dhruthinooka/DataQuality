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

    private int orderId;

    private int customerId;

    private String errorCode;


    private String errorMessage;


    private String errorType;


    private String firstName;


    private String lastName;


    private double netSaleAmt;


    private Date transactionDate;


    private String storeLocationCode;


    private String channel;
}
