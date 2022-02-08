package com.codurance.serviceAccount;

import com.codurance.serviceAccount.repository.InMemoryTransactionRepository;
import com.codurance.serviceAccount.repository.TransactionRepository;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

public class StepDefinitionsServiceAccount {

    private ServiceAccount serviceAccount;

    private TransactionRepository transactionRepository;
    private DateService dateService;
    private PrinterService printerService;


    @Before
    public void init(){
        dateService = new DateService();
        transactionRepository = new InMemoryTransactionRepository();
        printerService = new PrinterService();
        serviceAccount = new ServiceAccount(transactionRepository, dateService, printerService);

    }

    @Given("a client makes a deposit of {int} on {string}")
    public void a_client_makes_a_deposit_of_on(Integer amount, String date) {
        // Write code here that turns the phrase above into concrete actions
        serviceAccount.deposit(amount);
    }

    @Given("a client makes a withdrawal of {int} on {string}")
    public void a_withdrawal_of_on(Integer amount, String date) {
        // Write code here that turns the phrase above into concrete actions
        serviceAccount.withdrawal(amount);
    }

    @When("they print their bank statement")
    public void they_print_their_bank_statement() {
        // Write code here that turns the phrase above into concrete actions
        serviceAccount.print();
    }

    @Then("they would see: {string}")
    public void they_would_see(String report) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(report, "Date       | Amount | Balance");
    }
}
