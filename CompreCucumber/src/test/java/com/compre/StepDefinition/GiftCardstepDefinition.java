package com.compre.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.compre.POMPack.GiftCardPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardstepDefinition extends Base {
	
	public static Logger log;
	
	GiftCardPOM gc=new GiftCardPOM(driver);
	
	@Before("@7GiftCard")
	public void init()
	{
		test= report.startTest("Gift Card Page");
		log=Logger.getLogger(Base.class.getName());
	}
	    
    @And("^User clicks on Gift Card$")
    public void user_clicks_on_gift_card() throws Throwable {
    	
    	//test.info("Clicking on GiftCard");
		log.info("Clicking on GiftCard");
		gc.getGiftCard().click();
		test.log(LogStatus.PASS, "Giftcard page Opened");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    
    @Then("^A box for entering postal code is displayed$")
    public void a_box_for_entering_postal_code_is_displayed() throws Throwable {
    	
    	//test.info("Enter post code in post code column");
		
		log.info("Enter post code in post code column");
		gc.getPostCode().click();

        
    }

    @When("^The User enters the postal code and click on check$")
    public void the_user_enters_the_postal_code_and_click_on_check() throws Throwable {
       
    	gc.getPostCode().sendKeys("400014");
    	test.log(LogStatus.PASS, "Pin code Entered");
		log.info("Desired Message is displayed");
		
		gc.getCodeCheck().click();
		Thread.sleep(5000);
    }

    
    @Then("^The Available Message should be displayed on the screen$")
    public void the_available_message_should_be_displayed_on_the_screen() throws Throwable {
    	String str=gc.getCodeText().getText();
    	Assert.assertEquals(str,"Cash on Delivery is available.");
    	test.log(LogStatus.PASS, "COD Status"+str);
    	ExtentLogUtilities.pass(driver, test, "Task Done", log);
		
        
    }
    
    @After("@7GiftCard")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}
    
  

    
}
