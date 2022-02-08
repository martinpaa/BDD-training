package com.codurance.serviceAccount;

import com.codurance.serviceAccount.domain.Transaction;
import com.codurance.serviceAccount.repository.TransactionRepository;

import java.util.List;

public class ServiceAccount {

    private int currentBalance;

    private TransactionRepository transactionRepository;
    private DateService dateService;
    private PrinterService printerService;

    public ServiceAccount(TransactionRepository transactionRepository, DateService dateService, PrinterService printerService) {
        this.currentBalance = 0;
        this.transactionRepository = transactionRepository;
        this.dateService = dateService;
        this.printerService = printerService;
    }

    public void deposit(Integer amount) {
        currentBalance += amount;
        transactionRepository.addTransaction(amount, currentBalance, dateService.getDate());
    }

    public void withdrawal(Integer amount) {
        currentBalance -= amount;
        transactionRepository.addTransaction(-amount, currentBalance, dateService.getDate());
    }

    public void print() {
        List<Transaction> transactionsList =  transactionRepository.getAllTransactions();
        printerService.print(transactionsList);
    }
}
