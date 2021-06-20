package com.abc.account.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@Entity
@IdClass(CustomerAccountId.class)
public class CustomerAccount {
    @Id
    @Column(name="customer_no")
    private long customerNo;
    @Id
    @Column(name="account_no")
    private long accountNo;
    private Timestamp createTs;
    private Timestamp updateTs;
}
