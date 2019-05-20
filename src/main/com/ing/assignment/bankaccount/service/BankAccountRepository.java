package com.ing.assignment.bankaccount.service;

import com.ing.assignment.bankaccount.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
