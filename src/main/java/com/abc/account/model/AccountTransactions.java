package com.abc.account.model;

import com.abc.account.DateFormatter.CustomDateFormatter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
public class AccountTransactions {

    @JsonIgnore
    @Id
    @GeneratedValue
    @Column(name="transaction_no")
    private Integer transactionNo;
    @Column(name = "account_no")
    private long accountNo;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "transaction_currency")
    private String transactionCurrency;
    @Column(name = "transaction_amount")
    private float transactionAmount;
    @Column(name = "transaction_type")
    private String transactionType;
    @Column(name = "transaction_notes")
    private String transactionNotes;
    @JsonSerialize(using = CustomDateFormatter.class)
    private Timestamp createTs;
    @JsonIgnore
    private Timestamp updateTs;
}
