package com.ing.assignment.bankaccount.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
public class BankAccount {

    private @Id
    @GeneratedValue
    Long accountNumber;
    private long accountHolderId;
    private long accountBalance;
    private AccountType accountType;
    private String currency;
    private String branchCode;
    private LocalDate openDate;
    private boolean joinAccount;
    private long joinAccountHolder;

    public BankAccount() {
    }

    public BankAccount(long accountHolderId, long accountBalance, AccountType accountType, String currency,
                       String branchCode, LocalDate openDate, boolean joinAccount, long joinAccountHolder) {
        this.accountHolderId = accountHolderId;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.currency = currency;
        this.branchCode = branchCode;
        this.openDate = openDate;
        this.joinAccount = joinAccount;
        this.joinAccountHolder = joinAccountHolder;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(long accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public boolean isJoinAccount() {
        return joinAccount;
    }

    public void setJoinAccount(boolean joinAccount) {
        this.joinAccount = joinAccount;
    }

    public long getJoinAccountHolder() {
        return joinAccountHolder;
    }

    public void setJoinAccountHolder(long joinAccountHolder) {
        this.joinAccountHolder = joinAccountHolder;
    }
}
