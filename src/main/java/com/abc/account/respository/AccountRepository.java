package com.abc.account.respository;

import com.abc.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query("select acc from Account acc where acc.accountNo in ?1")
    public List<Account> findAllByIds(List<Long> accountsIds);
}
