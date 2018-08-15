package runner;

import core.webdriver.WebDriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by quoctran on 8/13/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/debug",
        glue = {"stepDefs", "hooks"},
        plugin = { "pretty", "html:target/cucumber-html-reports"}
)

public class TestRunner {
//    private static WebDriver webDriver = new WebDriverFactory().getWebDriver();

    @BeforeClass
    public static void beforeSuite() {
        System.out.println("**************** BEFORE SUITE");
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void afterSuite() {
        System.out.println("**************** AFTER SUITE");
//        webDriver.quit();
    }
}
