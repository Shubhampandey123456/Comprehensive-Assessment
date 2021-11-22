package com.compre.StepDefinition;

import org.apache.log4j.Logger;

import com.compre.POMPack.AccountPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExcelSheetRead;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountStepDefinition extends Base {

	public static Logger log;
	 AccountPOM ap;
	
	@Before("@1Account")
	public void init1()
	{
		test= report.startTest("Home Page");
		log=Logger.getLogger(Base.class.getName());
		ap=new AccountPOM(driver);
	}
	

	
	@Given("^User lands on Home Page$")
	public void user_lands_on_home_page() throws Throwable {
		
		driver=setthings();
		log.info("Driver Initialized");
		driver.get(prop.getProperty("url"));
		log.info("Site opened");
		
	}

	@Then("^User Cliked on Signin Tab$")
	public void user_cliked_on_signin_tab() throws Throwable {
		
		ap.SignIn().click();
		log.info("Clicked on login");
		test.log(LogStatus.PASS,"Login Clicked");
	}

	@When("^Page loaded User filled credentials$")
	public void page_loaded_user_filled_credentials() throws Throwable {
		String path=System.getProperty("user.dir");
		ExcelSheetRead exc = null;
		try {
			exc=new ExcelSheetRead(path+"\\testdata\\Data.xlsx","login");
			log.info("ExcelSheet opened");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Excel sheet noe accessible");
		}
		
		String name=exc.getStringData(0, 0);
		String pass=exc.getStringData(0, 1);
		log.info("Entering username");
	
		ap.nam().sendKeys(name);
		
		log.info("Entering Password");
	
		ap.pssw().sendKeys(pass);
		
		log.info("Entered username= "+name);
		log.info("Entered password= "+pass);
		test.log(LogStatus.PASS,"Data taken from Excel Sheet");
	}

	@Then("^User Clicked on Submit button$")
	public void user_clicked_on_submit_button() throws Throwable {
		ap.done().click();
		test.log(LogStatus.PASS,"Sign In Done");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
		
	}
	
	@After("@1Account")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}

	@And("^close driver$")
	public void close_driver() throws Throwable {
		
		driver.close();
	}

	
}