package com.codurance.serviceAccount;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsServiceAccount {

    private ServiceAccount serviceAccount;

    @Before
    public void init(){
        serviceAccount = new ServiceAccount();
    }

    @Given("a client makes a deposit of {int} on {int}-{int}-{int}")
    public void a_client_makes_a_deposit_of_on(Integer amount, Integer int2, Integer int3, Integer int4) {
        // Write code here that turns the phrase above into concrete actions
        serviceAccount.deposit(amount);
    }

    @Given("a withdrawal of {int} on {int}-{int}-{int}")
    public void a_withdrawal_of_on(Integer amount, Integer int2, Integer int3, Integer int4) {
        // Write code here that turns the phrase above into concrete actions
        serviceAccount.withdrawal(amount);
    }

    @When("they print their bank statement")
    public void they_print_their_bank_statement() {
        // Write code here that turns the phrase above into concrete actions

        throw new io.cucumber.java.PendingException();
    }

    @Then("they would see: {string}")
    public void they_would_see(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
