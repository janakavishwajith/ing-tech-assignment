package com.ing.assignment.bankaccount.service;

import com.ing.assignment.bankaccount.model.AccountType;
import com.ing.assignment.bankaccount.model.BankAccount;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class LoadData {

    @Bean
    CommandLineRunner initBankAccountsDB(BankAccountRepository bankAccountRepository) {

        return args -> {
            bankAccountRepository.save(new BankAccount(1, 500, AccountType.SAVINGS_ACCOUNT,
                    "LKR", "AB", LocalDate.now(), false, -1));
            bankAccountRepository.save(new BankAccount(2, 200, AccountType.SAVINGS_ACCOUNT,
                    "LKR", "AB", LocalDate.now(), false, -1));
            bankAccountRepository.save(new BankAccount(4, 2500, AccountType.CURRENT_ACCOUNT,
                    "LKR", "AB", LocalDate.now(), true, 1));
        };
    }
}
