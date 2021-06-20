package com.abc.account.service;

import com.abc.account.model.Account;
import com.abc.account.model.AccountTransactions;
import com.abc.account.model.CustomerAccount;
import com.abc.account.respository.AccountRepository;
import com.abc.account.respository.AccountTransactionsRepository;
import com.abc.account.respository.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AccountTransactionsRepository accountTransactionsRepository;
    @Autowired
    CustomerAccountRepository customerAccountRepository;

    @Override
    public List<Account> fetchAccounts(Long customerNo) {
        List<CustomerAccount> customerAccountsList = customerAccountRepository.findAllById(customerNo);
        List<Long> accountNoList = customerAccountsList.stream().map(ca -> ca.getAccountNo()).collect(Collectors.toList());
        List<Account> accountList = accountRepository.findAllByIds(accountNoList);
        return accountList;
    }

    @Override
    public List<AccountTransactions> fetchAccountTransactions(Long accountNo) {
        List<AccountTransactions> accountTransactions = accountTransactionsRepository.findAllById(accountNo);
        return accountTransactions;
    }

}
