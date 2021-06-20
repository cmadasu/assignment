package com.abc.account.controller;

import com.abc.account.model.Account;
import com.abc.account.model.AccountTransactions;
import com.abc.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/allAccounts/{customerId}")
    private List<Account> getAllAccounts(@PathVariable Long customerId) {
        return accountService.fetchAccounts(customerId);
    }

    @GetMapping("/allTransactions/{accountNo}")
    List<AccountTransactions> getAllAccountTransactions(@PathVariable Long accountNo) {
        return accountService.fetchAccountTransactions(accountNo);
    }
}
