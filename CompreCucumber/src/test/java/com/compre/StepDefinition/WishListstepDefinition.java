package com.compre.StepDefinition;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.compre.POMPack.WishlistPOM;
import com.compre.ReusableClass.Base;
import com.compre.Utilities.ExtentLogUtilities;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListstepDefinition extends Base {
	
	public static Logger log;
	
	WishlistPOM wl=new WishlistPOM(driver);
	
	@Before("@9WishList")
	public void init()
	{
		test= report.startTest("WishList Validation");
		log=Logger.getLogger(Base.class.getName());
	}
	
	@And("User search for gifts in search box")
	public void user_search_for_gifts_in_search_box() throws InterruptedException {

		
		log.info("Searching an item from the search bar");
		
		wl.getSearchResult().sendKeys("gifts",Keys.ENTER);
		
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,"Product searched in sear bar");

	}

	@When("The Page is displayed user clicks on the product")
	public void the_page_is_displayed_user_clicks_on_the_product() {
	   
		log.info("Clicked on the desired product");
		//test.info("Clicked on the desired product");
		wl.selectWishlistItem().click();
		test.log(LogStatus.PASS,"Product Selected");
		
	}

	@Then("The Page with product details open")
	public void the_page_with_product_details_open() {
	    
		log.info("Clicked on the Add to wishlist");
		//test.info("Clicked on the Add to wishlist");
		
	}

	@And("User clicks on add to Wishlist Option")
	public void user_clicks_on_add_to_wishlist_option() throws InterruptedException {
		
		Thread.sleep(5000);
		wl.addToWishlist().click();
		test.log(LogStatus.PASS,"Added to wish list");
	    
	}

	@Then("A popup is displayed where user clicks on View wishlist url in the popup")
	public void a_popup_is_displayed_where_user_clicks_on_view_wishlist_url_in_the_popup() throws InterruptedException {
	    
		log.info("Clicked on View product in wishlist link and naviagated to the page");
		//test.info("Clicking on view product link and navigating to wishlist");
		wl.viewWishList().click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,"Wish list shown");
	}

	@When("The wishlist Page is displayed close popups")
	public void the_wishlist_page_is_displayed_close_popups() {
	   
		wl.closePopup().click();
	}

	@Then("The product added should be displayed correctly")
	public void the_product_added_should_be_displayed_correctly() throws InterruptedException, IOException {
		
		Assert.assertTrue(wl.getWishlist().isDisplayed());
		log.info("Product verified");
		//test.pass("Added item is present in Wishlist, Product Verified");
		
		Thread.sleep(5000);
		test.log(LogStatus.PASS,"Product verified");
		ExtentLogUtilities.pass(driver, test, "Task Done", log);
	    
	}
	
	@After("@9WishList")
	public void setReport()
	{
		report.endTest(test);
		report.flush();
	}
	
	


}
