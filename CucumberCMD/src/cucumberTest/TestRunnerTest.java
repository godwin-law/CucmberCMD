package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature", 
		glue = { "stepDefinition" }, 
		monochrome = true, 
		format = { "pretty","html:target/Destination" }
		)
public class TestRunnerTest {

}
