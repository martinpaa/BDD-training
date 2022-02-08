package com.codurance.serviceAccount.repository;

import com.codurance.serviceAccount.domain.Transaction;

import java.util.Date;
import java.util.List;

public interface TransactionRepository {
    void addTransaction(int amount, int balance, Date date);

    List<Transaction> getAllTransactions();
}
