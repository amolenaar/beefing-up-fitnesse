package calculator.steps;

import calculator.Calculator;
import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;

public class MultiplySteps extends Steps {
    int x;
    int multiplyBy;

    @Given("a variable x with value $value")
    @Alias("a variable x with value <value>") // examples table
    public void givenXValue(@Named("value") int value) {
        x = value;
    }

    @When("I multiply x by $value")
    @Alias("I multiply x by <value>") // examples table
    public void whenImultiplyXBy(@Named("value") int value) {
        multiplyBy = value;
    }

    @Then("x should equal $outcome")
    @Alias("x should equal <outcome>") // examples table
    public void thenXshouldBe(@Named("outcome") int value) {
        int outcome = Calculator.multiply(x, multiplyBy);
        if (value != outcome)
            throw new AssertionError("x is " + outcome + ", but should be " + value);
    }

}