package com.codurance.serviceAccount.repository;

import com.codurance.serviceAccount.domain.Transaction;

import java.util.Date;
import java.util.List;

public class InMemoryTransactionRepository implements TransactionRepository {

    @Override
    public void addTransaction(int amount, int balance, Date date) {
        new Transaction(amount, balance, date);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        throw new UnsupportedOperationException();
    }
}
