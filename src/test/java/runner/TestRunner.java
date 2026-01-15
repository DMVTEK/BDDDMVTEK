package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@tc002",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"},
        publish = true
)

public class TestRunner {

}
