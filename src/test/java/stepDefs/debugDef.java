package stepDefs;

import app.pages.DebugPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class debugDef extends DebugPage {
    DebugPage debugPage = PageFactory.initElements(getWebDriver(),DebugPage.class);

    @Given("^user is on homepage$")
    public void user_is_on_homepage() { debugPage.navigateToHome(); }

    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() { debugPage.clickLogin(); }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() {
        debugPage.enterUserNandAndPassWord();
        debugPage.clickSubmit();
    }

    @Then("^success message is displayed$")
    public void success_message_is_displayed() {
        debugPage.verifyInfo();
    }
}
