package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/test1.feature"},
        glue = {"stepdefs"},
        plugin = { "pretty", "html:target/html-reports"}
)

public class testrunner {
}
