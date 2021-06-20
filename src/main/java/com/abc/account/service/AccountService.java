package com.abc.account.service;

import com.abc.account.model.Account;
import com.abc.account.model.AccountTransactions;
import com.abc.account.model.CustomerAccount;
import com.abc.account.respository.AccountRepository;
import com.abc.account.respository.AccountTransactionsRepository;
import com.abc.account.respository.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AccountService {
    List<Account> fetchAccounts(Long customerNo);

     List<AccountTransactions> fetchAccountTransactions(Long accountNo);
}
