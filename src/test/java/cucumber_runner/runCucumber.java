package cucumber_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@SuppressWarnings("ALL")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", plugin = {"pretty"})
public class runCucumber{
}
