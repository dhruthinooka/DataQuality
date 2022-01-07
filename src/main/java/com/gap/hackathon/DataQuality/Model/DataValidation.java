package com.gap.hackathon.DataQuality.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import java.util.Date;


@Table(name="DATA_VALIDATE")
@Getter
@Setter
public class DataValidation {

    private long orderId;

    private long customerId;

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
