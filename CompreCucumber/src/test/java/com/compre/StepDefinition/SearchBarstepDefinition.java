package com.compre.StepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.compre.POMPack.SearchItemPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchBarstepDefinition extends Base {
	
	public static Logger log;
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver,10);
	SearchItemPOM si;
	
	@Before("@SearchBar")
	public void init()
	{
		test= report.startTest("Search Bar validation");
		log=Logger.getLogger(Base.class.getName());
	}
	

	
	@And("^User pass the input into search box and press Enter$")
    public void user_pass_the_input_into_search_box_and_press_enter() throws Throwable {
		si=new SearchItemPOM(driver);
		log.info("Entering text into the search bar");
		si.getSearchBar().click();
		si.getSearchBar().sendKeys("Iron Man",Keys.ENTER);
		test.log(LogStatus.PASS,"Value Enter in Seach bar");
		  
    }
	
	@Then("^The relevant products should be displayed onto the screen$")
    public void the_relevant_products_should_be_displayed_onto_the_screen() throws Throwable {
     
		log.info("Product dsiplayed");
		//test.pass("Product dsiplayed");
		Assert.assertTrue(si.getSearchItem().isDisplayed());
		test.log(LogStatus.PASS,"product validated");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		
    }
	
	@After("@SearchBar")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}



}
