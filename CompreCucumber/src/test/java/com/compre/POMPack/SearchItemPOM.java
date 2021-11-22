package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.SearchBarLocators;



public class SearchItemPOM extends Base {

	WebDriver driver=null;
	
	public SearchItemPOM(WebDriver driver) {
		this.driver=driver;	
	}
	
	public WebElement getSearchBar() {
		return driver.findElement(SearchBarLocators.searchBox);
	}
	
	public WebElement getSearchIcon() {
		return driver.findElement(SearchBarLocators.SearchIcon);
	}
	
	
	public WebElement getSearchItem() {
		return driver.findElement(SearchBarLocators.searchItem);
	}
}