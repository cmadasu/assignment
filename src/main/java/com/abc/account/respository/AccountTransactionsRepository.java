package com.abc.account.respository;

import com.abc.account.model.AccountTransactions;
import com.abc.account.model.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions,Long> {
   // List<AccountTransactions> findAllById(Long accountNo);
   @Query("select at from AccountTransactions at where at.accountNo = ?1")
   public List<AccountTransactions> findAllById(Long accountNo);
}
