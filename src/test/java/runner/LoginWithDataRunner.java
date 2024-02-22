package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeatures\\LoginWithData.feature"},
		
		glue = {"stepsPackage"},
		
		publish =true
		
		)

public class LoginWithDataRunner extends AbstractTestNGCucumberTests {

}
