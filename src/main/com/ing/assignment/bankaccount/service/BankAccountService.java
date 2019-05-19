package com.ing.assignment.bankaccount.service;

import com.ing.assignment.bankaccount.model.AccountHolder;
import com.ing.assignment.bankaccount.model.AccountType;
import com.ing.assignment.bankaccount.model.BankAccount;
import com.ing.assignment.bankaccount.utils.BankAccountUtils;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

@Service
public class BankAccountService {

    private List<BankAccount> bankAccountsList = new ArrayList<>();
    private List<AccountHolder> accountHolders = new ArrayList<>();


    private BankAccount createNewAccount(BankAccount bankAccount) {

        bankAccount.setAccountNumber(BankAccountUtils.generateNewBankAccountNumber());

        bankAccountsList.add(bankAccount);

        return bankAccount;
    }





    private void generateDummmyAccounts(){

    }
}
