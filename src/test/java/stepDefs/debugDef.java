package stepDefs;

import app.pages.DebugPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public abstract class debugDef {
    DebugPage debugPage =  new DebugPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        debugPage.navigateToHomePage();
    }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() { debugPage.clickLogin(); }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() {
        debugPage.enterUserNamedAndPassWord();
        debugPage.clickSubmit();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() {
        debugPage.verifyInfo();
    }
}
