package sources;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepFiles {


@Given("^user entered (\\d+),(\\d+),+$")
public void user1_entered_(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^user clicked the submit button$")
public void user2_clicked_the_submit_button() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^Result is (\\d+)$")
public void Result_is(int arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^user entered (\\d+),(\\d+),-$")
public void user3_entered_(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^user entered (\\d+),(\\d+),\\*$")
public void user4_entered_(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^(\\d+),(\\d+),/$")
public void _(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^(\\d+),(\\d+),+,(\\d+),\\*$")
public void __(int arg1, int arg2, int arg3) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^(\\d+),(\\d+),\\*,(\\d+),+$")
public void _(int arg1, int arg2, int arg3) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Given("^user entered (\\d+),(\\d+),/$")
public void user5_entered_(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^Error message \"([^\"]*)\" will be displayed$")
public void Error_message_will_be_displayed(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}



}
