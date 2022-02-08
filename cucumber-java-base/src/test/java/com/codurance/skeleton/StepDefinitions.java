package com.codurance.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    Belly belly = new Belly();

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void I_have_cukes_in_my_belly2(int hour) throws InterruptedException {
        belly.iWait(hour);
    }

    @Then("my belly should growl")
    public void I_have_cukes_in_my_belly2() {
        Assertions.assertTrue(belly.hasGrowled());
    }

}
