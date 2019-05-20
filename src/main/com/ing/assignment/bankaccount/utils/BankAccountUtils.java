package com.ing.assignment.bankaccount.utils;

import com.ing.assignment.bankaccount.model.AccountHolder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.List;

public class BankAccountUtils {

    public static List<AccountHolder> generateDummyAccountHolders(){

        List<AccountHolder> accountHolders = new ArrayList<>();

        for(int i = 0 ; i < 5 ; i++) {
            AccountHolder accountHolder = new AccountHolder("859300495"+i+"x", "John"+i, "Doe",
                    i+"A", i+" lane", "Station Rd", "Bucharest", "", "Romania",
                    LocalDate.of(1987, 04, i), "Male", "+94885857394", LocalDate.of(2019, 01, i));
            accountHolders.add(accountHolder);
        }

        return accountHolders;
    }

    public static long generateNewBankAccountNumber() {
        return LocalDateTime.now().getLong(ChronoField.NANO_OF_DAY);

    }
}
