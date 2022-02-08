package com.codurance.serviceAccount.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Transaction {
    private int balance;
    private int amount;
    private LocalDate date;

    public Transaction(int amount, int balance, LocalDate date) {
        this.amount = amount;
        this.balance = balance;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return balance == that.balance && amount == that.amount && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, amount, date);
    }
}
