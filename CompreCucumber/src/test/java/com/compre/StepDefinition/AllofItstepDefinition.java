package com.compre.StepDefinition;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.compre.POMPack.AllOfiTPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllofItstepDefinition extends Base{
	
	public static Logger log;
	
	
	AllOfiTPOM ai=new AllOfiTPOM(driver);
	
	@Before("@4AllOfIt")
	public void init3() throws IOException
	{
		test= report.startTest("AllofIT Page");
		log=Logger.getLogger(Base.class.getName());
		
	}

	
	@And("Clicks on AllOfIt Section from Navigation Bar")
	public void clicks_on_all_of_it_section_from_navigation_bar() {
		ai.getAllofIt().click();
		test.log(LogStatus.PASS,"Clickd on AllOfIt Section");
	}

	@Then("A page with product should be displayed")
	public void a_page_with_product_should_be_displayed() {
	   
		log.info("Clicking on All Of It section from Navigation Bar");
	}

	@When("the Product is displayed Click on Next Page arrow Button")
	public void the_product_is_displayed_click_on_next_page_arrow_button() {
		log.info("Clicking on next page button");
		ai.getNextPage().click();
		test.log(LogStatus.PASS,"Next Arrow Clicked");
	}

	@Then("The user should be taken to second page of product results")
	public void the_user_should_be_taken_to_second_page_of_product_results() throws IOException {
	   
		log.info("Verifying Next Page is displayed");
		Assert.assertTrue(ai.getNewItem().isDisplayed());
		test.log(LogStatus.PASS,"Validation done");	
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
	}
	
	@After("@4AllOfIt")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}
	


}
