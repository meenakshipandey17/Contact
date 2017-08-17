package stepDefinitions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
    @RunWith(Cucumber.class)
    @CucumberOptions(
            dryRun = false,
            strict = true,
            features = "classpath:features",
            glue = "stepDefinitions",
            tags = {},
            monochrome = false,
            plugin = {
                    "pretty",
                    "html:target/cucumber",
                    "json:results/cucumber.json",
                    "junit:results/cucumber.xml"
            }
    )
    public class RunContactPageTest{
    }
