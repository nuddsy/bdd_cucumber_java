import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CalculatorStepDefinitions {
    private Calculator calculator;
    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        // Write code
        calculator = new Calculator();
        throw new io.cucumber.java.PendingException();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2){
        //Write code
        throw new io.cucumber.java.PendingException();
    }
    @Then("The result is {int}")
    public void the_result_is(Integer int1) {
        //Write code
        throw new io.cucumber.java.PendingException();
    }
}
