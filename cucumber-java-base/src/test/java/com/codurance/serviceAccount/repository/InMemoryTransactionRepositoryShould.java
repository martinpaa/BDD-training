package com.codurance.serviceAccount.repository;

import com.codurance.serviceAccount.domain.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class InMemoryTransactionRepositoryShould {

    private InMemoryTransactionRepository inMemoryTransactionRepository;

    @BeforeEach
    void setUp() {
        inMemoryTransactionRepository = new InMemoryTransactionRepository();
    }

    @Test
    void add_transaction() {
        // Arrange
        int amount = 1000;
        int balance = 1000;
        LocalDate date = LocalDate.now();

        // Act
        inMemoryTransactionRepository.addTransaction(amount, balance, date);

        // Assert
        Assertions.assertEquals(1, inMemoryTransactionRepository.getAllTransactions().size());
        Assertions.assertEquals(new Transaction(amount, balance, date), inMemoryTransactionRepository.getAllTransactions().get(0));
    }

    @Test
    void get_empty_transactions_list() {
        // Assert
        Assertions.assertTrue(inMemoryTransactionRepository.getAllTransactions().isEmpty());
    }

    @Test
    void get_not_empty_transactions_list() {
        // Act
        inMemoryTransactionRepository.addTransaction(1000, 1000, LocalDate.now());
        inMemoryTransactionRepository.addTransaction(10, 1010, LocalDate.now());
        inMemoryTransactionRepository.addTransaction(-20, 990, LocalDate.now());

        // Assert
        Assertions.assertEquals(3, inMemoryTransactionRepository.getAllTransactions().size());
    }
}