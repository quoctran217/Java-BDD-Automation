package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by quoctran on 8/13/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"stepdefs", "hooks"},
        plugin = { "pretty", "html:target/cucumber-html-reports"}
)

public class TestRunner {

    @BeforeClass
    public static void beforeSuite() {
        System.out.println("**************** BEFORE SUITE");
    }

    @AfterClass
    public static void afterSuite() {
        System.out.println("**************** AFTER SUITE");
    }
}
