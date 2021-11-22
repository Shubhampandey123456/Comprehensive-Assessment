package com.compre.StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.compre.POMPack.SortItemPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortItemstepDefinition extends Base{
	
	public static Logger log;
	
	SortItemPOM so=new SortItemPOM(driver);
	
	@Before("@ZShortItem")
	public void init()
	{
		test= report.startTest("Sorting Validation");
		log=Logger.getLogger(Base.class.getName());
	}

	@And("Click on Secret Santa Gifts section")
	public void click_on_secret_santa_gifts_section() {
	    
		so.getSecretSantaGifts().click();
		test.log(LogStatus.PASS,"Clicked om product");
	}

	@Then("The page with results should be displayed")
	public void the_page_with_results_should_be_displayed() {
	  
		log.info("Clicking on  Secret Santa Gifts section from Navigation Bar");
	}

	@When("User clicks on sort by")
	public void user_clicks_on_sort_by() {
	   
		log.info("Clicking on Sort and choose the Best Selling option from the dropdown");
		so.DropdownClick().selectByIndex(2);
		test.log(LogStatus.PASS,"Sorted using dropdown");
	}

	@Then("The Page showing results sorted with hot sellers should be displayed")
	public void the_page_showing_results_sorted_with_hot_sellers_should_be_displayed() throws IOException {
	   
		Assert.assertTrue(so.getSortCheck().isDisplayed());
		log.info("Best Selling Products displayed");
		test.log(LogStatus.PASS,"Product is displayed");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		
	}
	
	@After("@ZShortItem")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}
	


}
