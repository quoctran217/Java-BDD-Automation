package hooks;

import core.webdriver.WebDriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class CustomHook {
    private WebDriver webDriver;

    @Before
    public void beforeScenario() throws Throwable{
        System.out.println("*** BEFORE SCENARIO");
        this.webDriver = new WebDriverFactory().getWebDriver(); // Initiate a webdriver instance
    }

    @After
    public void afterScenario() {
        System.out.println("*** After SCENARIO");
        webDriver.close();
        webDriver.quit();
    }
}
