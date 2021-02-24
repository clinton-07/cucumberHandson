package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\main\\java\\BDD1",
		glue={"stepDefinition"},
		format= {"pretty", "html:test-outout"},
		dryRun = false,
		monochrome = true
		)

public class HandsOn2TestRunner {


}
