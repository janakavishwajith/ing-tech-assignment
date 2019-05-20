package com.ing.assignment.bankaccount.controller;

import com.ing.assignment.bankaccount.model.BankAccount;
import com.ing.assignment.bankaccount.service.BankAccountRepository;
import com.ing.assignment.bankaccount.utils.BankAccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankAccountsController {

    @Autowired
    BankAccountRepository bankAccountRepository;

    @PostMapping(path = "/accounts")
    public BankAccount createBankAccount(@RequestBody BankAccount bankAccount) {

        return bankAccountRepository.save(bankAccount);
    }

    @GetMapping(path = "/accounts")
    public List<BankAccount> getAllBankAccounts() {

        return bankAccountRepository.findAll();
    }

    @GetMapping(path = "/accounts/{accountNumber}")
    public BankAccount loadBankAccount(@PathVariable Long accountNumber) {
        return bankAccountRepository.findById(accountNumber)
                .orElseThrow(() -> new BankAccountNotFoundException(accountNumber));
    }
}
