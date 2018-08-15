package hooks;

import core.webdriver.WebDriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CustomHook {
    private WebDriver webDriver;

    @Before
    public void beforeScenario() {
        System.out.println("******** BEFORE SCENARIO");
        webDriver = new WebDriverFactory().getWebDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Go to Login page
    }

    @After
    public void afterScenario() {
        System.out.println("******** AFTER SCENARIO");
        webDriver.quit();
        //Back to Login page
    }
}
