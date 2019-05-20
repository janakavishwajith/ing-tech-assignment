package com.ing.assignment.bankaccount.utils;

public class BankAccountNotFoundException extends RuntimeException{

    public BankAccountNotFoundException(Long id) {
        super("Could not found the account " + id);
    }
}
