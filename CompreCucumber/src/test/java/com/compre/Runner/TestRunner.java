package com.compre.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//features//",
		glue= "com.compre.StepDefinition"
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}