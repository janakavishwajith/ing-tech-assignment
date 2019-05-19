package com.ing.assignment.bankaccount.model;

import java.util.Date;

public class BankAccount {

    private long accountNumber;
    private long accountHolderId;
    private long accountBalance;
    private AccountType accountType;
    private String currency;
    private String branchCode;
    private Date openDate;
    private boolean joinAccount;
    private long joinAccountHolder;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
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

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
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
