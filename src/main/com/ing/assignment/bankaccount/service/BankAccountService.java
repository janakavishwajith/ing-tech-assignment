package com.ing.assignment.bankaccount.service;

import com.ing.assignment.bankaccount.model.AccountHolder;
import com.ing.assignment.bankaccount.model.AccountType;
import com.ing.assignment.bankaccount.model.BankAccount;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

@Service
public class BankAccountService {

    private List<BankAccount> bankAccountsList = new ArrayList<>();
    private List<AccountHolder> accountHolders = new ArrayList<>();


    private void generateDummyAccountHolders(){
        for(int i = 0 ; i < 5 ; i++) {
            AccountHolder accountHolder = new AccountHolder("859300495"+i+"x", "John"+i, "Doe",
                    i+"A", i+" lane", "Station Rd", "Bucharest", "", "Romania",
                    LocalDate.of(1987, 04, i), "Male", "+94885857394", LocalDate.of(2019, 01, i));
            accountHolders.add(accountHolder);
        }

    }

    private void generateDummmyAccounts(){

    }
}
