package com.codurance.serviceAccount.domain;

import java.util.Date;

public class Transaction {
    private int balance;
    private int amount;
    private Date date;

    public Transaction(int amount, int balance, Date date) {
        this.amount = amount;
        this.balance = balance;
        this.date = date;
    }
}
