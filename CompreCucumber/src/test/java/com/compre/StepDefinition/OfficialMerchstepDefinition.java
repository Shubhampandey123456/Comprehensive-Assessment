package com.compre.StepDefinition;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.compre.POMPack.OfficialMerchandisePOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfficialMerchstepDefinition extends Base {
	
	public static Logger log;
	
	OfficialMerchandisePOM om=new OfficialMerchandisePOM(driver);
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver,10);
	
	@Before("@6OfficialMerch")
	public void init()
	{
		test= report.startTest("Home Page");
		log=Logger.getLogger(Base.class.getName());
	}
	
	
	
	@And("^Hover the mouse over Official Merchandise section$")
    public void hover_the_mouse_over_official_merchandise_section() throws Throwable {
		Actions a=new Actions(driver);
		
		log.info("Hovered over Official Merchandise Tab");
		WebElement ele=om.getOfficialMerchandise();
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		a.moveToElement(ele).perform();
		test.log(LogStatus.PASS, "Officil Merchandised displayed");
       
    }

    @When("^The Option inside it are displayed user hover to Marvel Merchandise$")
    public void the_option_inside_it_are_displayed_user_hover_to_marvel_merchandise() throws Throwable {
    	
    	log.info("Hovered to Marvel Merchandise in subsection and clicked on it");
		//test.info("Hovered to Marvel Merchandise in subsection and clicked on it");
    	test.log(LogStatus.PASS, "Officil Merchandised Entered");
		
        
    }
    
    @And("^Click On The Marvel merchandise$")
    public void click_on_the_marvel_merchandise() throws Throwable {
    	WebElement ele1=om.getMarvelMerch();
    	wait.until(ExpectedConditions.elementToBeClickable(ele1));
    	ele1.click();
		test.log(LogStatus.PASS, "<Marven merchandize");
        
    }

    @Then("^the page displaying results for Marvel Merchandise should be displayed$")
    public void the_page_displaying_results_for_marvel_merchandise_should_be_displayed() throws Throwable {
    	
    	Assert.assertEquals(om.getVerifiedTitle().getText(),"Marvel Merchandise");
		log.info("Title Verified");
		test.log(LogStatus.PASS, "title verified");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		
        
    }
    
    @After("@6OfficialMerch")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}
    
  

}
