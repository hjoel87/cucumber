package cucumber_runner;

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
}
