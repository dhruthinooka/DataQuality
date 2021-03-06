package com.gap.hackathon.DataQuality.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="DATA_VALIDATE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DataValidation {

    @Id
    @Column(name = "ORDER_ID")
    private int orderId;

    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "ERROR_CODE")
    private String errorCode;

    @Column(name = "ERROR_MESSAGE")
    private String errorMessage;

    @Column(name = "ERROR_TYPE")
    private String errorType;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "NET_SALES_AMT")
    private double netSaleAmt;

    @Column(name = "TRANSACTION_DATE")
    private Date transactionDate;

    @Column(name = "STORE_LOCATION_CODE")
    private String storeLocationCode;

    @Column(name = "CHANNEL")
    private String channel;
}
