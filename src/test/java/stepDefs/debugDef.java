package stepDefs;

import app.pages.DebugPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class debugDef extends DebugPage {
    public debugDef() throws Throwable{}

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        navigateToHome();
    }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() {
        clickLogin();
    }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() {
        enterUserNandAndPassWord();
        clickSubmit();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() {
        verifyInfo();
    }
}
