package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {
	
	@CucumberOptions(
			
			features = "Feature",
	        glue="stepdefs"
			
			
			)

	public class TestRunner extends AbstractTestNGCucumberTests{}   //inbuilt 
	
}