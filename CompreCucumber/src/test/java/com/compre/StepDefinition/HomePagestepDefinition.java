package com.compre.StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.compre.POMPack.HomePagePOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class HomePagestepDefinition extends Base {
	
	public static Logger log;
	
	HomePagePOM hp;
	
	@Before("@5HomePage")
	public void init()
	{
		test= report.startTest("Home Page");
		log=Logger.getLogger(Base.class.getName());
	}
	
	@Then("BigSmall Website logo should be displayed")
	public void big_small_website_logo_should_be_displayed() {
		hp=new HomePagePOM(driver);
		Assert.assertTrue(hp.getTitleImg().isDisplayed());
		test.log(LogStatus.PASS, "Title image displayed");
		log.info("Title image displayed");

		
	}

	@Then("the Navigation Bar should be Displayed")
	public void the_navigation_bar_should_be_displayed() throws IOException {

		Assert.assertTrue(hp.getNavBar().isDisplayed());
		test.log(LogStatus.PASS, "Nav Bar displayed");
		log.info("Nav bar ");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);

		
	}
	
	
	@After("@5HomePage")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}



}
