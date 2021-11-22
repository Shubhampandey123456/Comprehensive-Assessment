package com.compre.StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.compre.POMPack.AccountPOM;
import com.compre.POMPack.BlogsPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogsStepDefinition extends Base {
	
	public static Logger log;

	BlogsPOM bp;
	

	@Before("@2Blogs")
	public void init2() throws IOException
	{
		test= report.startTest("Blog Page");
		log=Logger.getLogger(Base.class.getName());
		
	}

	@When("^User Cliked on a blog in Latest Blog Section$")
	public void user_cliked_on_a_blog_in_latest_blog_section() throws Throwable {
		bp=new BlogsPOM(driver);
		try {
			bp.ClickBlog().click();
			log.info("User clicked on the blog");
			test.log(LogStatus.PASS,"Clicked on blog");
		}
		catch(Exception ex)
		{
			System.out.println("Element not clicked");
		}
		

	}

	@Then("^Page loaded and User Validated a Quote$")
	public void page_loaded_and_user_validated_a_quote() throws Throwable {
	
		String str=bp.Statemnt().getText();
		Assert.assertTrue(bp.Statemnt().isDisplayed());
		log.info("Quotes Validated: "+str);
		test.log(LogStatus.PASS,"Quote is"+str);
		ExtentLogUtilities.pass(driver, test, "Task Done", log);

	}

	

	@After("@2Blogs")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}

}

