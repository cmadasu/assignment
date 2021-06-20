package com.abc.account.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;


@Data
@Entity
public class Account {
    @Id
    @Column(name="account_no")
    private Long accountNo;
    @Column(name="account_name")
    private String accountName;
    @Column(name="account_type")
    private String accountType;
    @Column(name="account_currency")
    private String accountCurrency;
    @Column(name="account_balance")
    private Double accountBalance;
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Timestamp createTs;
    @JsonIgnore
    private Timestamp updateTs;
}
