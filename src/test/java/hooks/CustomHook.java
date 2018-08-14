package hooks;

import core.webdriver.WebDriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class CustomHook {
    private static WebDriver webDriver;

    @Before
    public void beforeScenario() {
        System.out.println("******** BEFORE SCENARIO");
        webDriver = new WebDriverFactory().getWebDriver(); // Initiate a webdriver instance
    }

    @After
    public void afterScenario() {
        System.out.println("******** AFTER SCENARIO");
        webDriver.close();
        webDriver.quit();
    }
}
