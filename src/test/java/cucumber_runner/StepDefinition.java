package cucumber_runner;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    @When("^test$")
    public void test() throws Exception {
        System.out.println("test");
    }

    @Then("^print hello world$")
    public void print_hello_world() throws Exception {
        System.out.println("hello world");
    }
    //test

    @When("email feld gefunden")
    public void email_feld_gefunden() {
        System.out.println("email feld gefunden");
    }

    @Then("email feld ausfuellen")
    public void email_feld_ausfuellen() {
        System.out.println("email feld ausfuellen");
    }

    @Before
    public void doSomethingBefore() {
        System.out.println("//////////////////");
    }



}
