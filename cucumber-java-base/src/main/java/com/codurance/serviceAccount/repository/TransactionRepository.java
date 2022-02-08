package com.codurance.serviceAccount.repository;

import com.codurance.serviceAccount.domain.Transaction;
import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository {
    void addTransaction(int amount, int balance, LocalDate date);

    List<Transaction> getAllTransactions();
}
