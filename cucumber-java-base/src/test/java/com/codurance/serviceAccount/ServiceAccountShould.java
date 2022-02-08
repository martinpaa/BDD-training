package com.codurance.serviceAccount;

import com.codurance.serviceAccount.domain.Transaction;
import com.codurance.serviceAccount.repository.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceAccountShould {

    public static final int AMOUNT = 1000;

    private ServiceAccount serviceAccount;

    @Mock
    private TransactionRepository transactionRepository;

    @Mock
    private PrinterService printerService;

    @BeforeEach
    void beforeEach() {
        serviceAccount = new ServiceAccount(transactionRepository);
    }

    @Test
    void make_a_deposit() {
        // Act
        serviceAccount.deposit(AMOUNT);

        // Assert
        verify(transactionRepository).addTransaction(amount, AMOUNT, dateService.getDate());
    }

    @Test
    void make_a_withdrawal() {
        // Act
        serviceAccount.withdrawal(AMOUNT);

        // Assert
        verify(transactionRepository).addTransaction(amount, -AMOUNT, dateService.getDate());
    }

    @Test
    void print_transactions() {
        // Arrange
        List<Transaction> transactions = new ArrayList<>();
        when(transactionRepository.getAllTransactions()).thenReturn(transactions);

        // Act
        serviceAccount.print();

        // Assert
        verify(printerService).print(transactions);
    }
}