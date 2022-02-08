package com.codurance.serviceAccount.repository;

import com.codurance.serviceAccount.domain.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InMemoryTransactionRepository implements TransactionRepository {

    private List<Transaction> transactionList = new ArrayList<>();

    @Override
    public void addTransaction(int amount, int balance, LocalDate date) {
        transactionList.add(new Transaction(amount, balance, date));
    }

    @Override
    public List<Transaction> getAllTransactions() {
       return transactionList;
    }
}
