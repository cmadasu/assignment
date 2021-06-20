package com.abc.account.model;

import java.io.Serializable;
import java.util.Objects;

public class CustomerAccountId implements Serializable {
    private Long customerNo;
    private Long accountNo;

    public CustomerAccountId() {
    }

    public CustomerAccountId(Long customerNo, Long accountNo) {
        this.customerNo = customerNo;
        this.accountNo = accountNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerAccountId customerAccountId = (CustomerAccountId) o;
        return customerNo.equals(customerAccountId.customerNo) &&
                accountNo.equals(customerAccountId.accountNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerNo, accountNo);
    }
}

