package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by quoctran on 8/13/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/debug.feature",
        glue = {"stepDefs", "hooks"},
        plugin = { "pretty", "html:target/cucumber-html-reports"}
)

public class TestRunner {
}
