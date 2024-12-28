package io.github.csabadaniel.cukes.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest
public class CukesStepDefinitions {

    @Given("I have a feature file")
    public void iHaveAFeatureFile() {
    }

    @When("I run cucumber")
    public void iRunCucumber() {

    }

    @Then("I can see the output")
    public void iCanSeeTheOutput() {
    }

}
