package com.compre.StepDefinition;

import org.apache.log4j.Logger;

import com.compre.POMPack.AccountPOM;
import com.compre.POMPack.ContactPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactstepDefinition extends Base {
	
	public static Logger log;

	ContactPOM cp=new ContactPOM(driver);

	@Before("@3Contact")
	public void init()
	{
		test= report.startTest("Contact Page");
		log=Logger.getLogger(Base.class.getName());
	}
	
	@Then("^User clicks on Contact Us link$")
	public void user_clicks_on_contact_us_link() throws Throwable {
		
		log.info("User is on home page");
		cp.contactClick().click();
		test.log(LogStatus.PASS, "Home page validated");

	}
	
	@When("^the User lands on Contact Us form$")
	public void the_user_lands_on_contact_us_form() throws Throwable {
		
		log.info("User Landed on Contact us Form ");
		test.log(LogStatus.PASS, "Contact form");

	}

	@Then("^User should enter (.+) , (.+) and (.+)$")
	public void user_should_enter_and(String name, String emailid, String message) throws Throwable {
		
		log.info("Enter Essential informations");
		cp.Nameclick().sendKeys(name);
		log.info("Name Entered");
		cp.Emailclick().sendKeys(emailid);
		log.info("Email Entered");
		cp.Msgclick().sendKeys(message);
		log.info("Meassage entered");
		
		test.log(LogStatus.PASS, "Information Entered");
		
	

	}

	@And("^User Clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
		
		cp.sendclick().click();
		log.info("Submitted");
		test.log(LogStatus.PASS, "Successfully submitted");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);

	}
	
	@After("@3Contact")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}
	
	



}