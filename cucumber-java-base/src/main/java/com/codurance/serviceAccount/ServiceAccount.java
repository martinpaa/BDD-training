package com.codurance.serviceAccount;

import com.codurance.serviceAccount.repository.TransactionRepository;

public class ServiceAccount {

    private int currentBalance;

    private TransactionRepository transactionRepository;
    private DateService dateService;

    public ServiceAccount(TransactionRepository transactionRepository) {
        this.currentBalance = 0;
        this.transactionRepository = transactionRepository;
    }

    public void deposit(Integer amount) {
        currentBalance += amount;
        transactionRepository.addTransaction(amount, currentBalance, dateService.getDate());
    }

    public void withdrawal(Integer amount) {
        transactionRepository.addTransaction(amount, -amount, dateService.getDate());
    }

    public void print() {
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
