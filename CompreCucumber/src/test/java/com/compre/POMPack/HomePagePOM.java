package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.HomePageLocators;



	public class HomePagePOM extends Base {

	WebDriver driver=null;
	
	public HomePagePOM(WebDriver driver) {
		this.driver=driver;	
	}
	
	
	public WebElement getTitleImg() {
		return driver.findElement(HomePageLocators.titleImg);
	}
	public WebElement getNavBar() {
		return driver.findElement(HomePageLocators.navigationBar);
	}


	
	
}
