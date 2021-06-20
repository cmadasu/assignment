package com.abc.account.respository;

import com.abc.account.model.Account;
import com.abc.account.model.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount,Long> {
    @Query("select ca from CustomerAccount ca where ca.customerNo = :customerNo")
    public List<CustomerAccount> findAllById(@Param("customerNo") Long customerNo);
}
