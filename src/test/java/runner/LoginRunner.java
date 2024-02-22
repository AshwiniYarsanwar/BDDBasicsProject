package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\AppFeatures\\Login.feature"},
		
		glue = {"stepsPackage"},
		
		publish = true
	
		)

public class LoginRunner extends AbstractTestNGCucumberTests
{
	

}
