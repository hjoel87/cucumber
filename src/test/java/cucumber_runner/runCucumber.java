package cucumber_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@SuppressWarnings("ALL")
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", tags = "@important")
public class runCucumber{
}
