package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.WishlistLocators;



public class WishlistPOM extends Base {

	public WishlistPOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getSearchResult() {
		return driver.findElement(WishlistLocators.search);
		
	}
	public WebElement addToWishlist() {
		return driver.findElement(WishlistLocators.addToWishlist);
		
	}
	public WebElement viewWishList() {
		return driver.findElement(WishlistLocators.viewWishlist);
		
	}
	public WebElement getWishlist() {
		return driver.findElement(WishlistLocators.wishlist);
		
	}

	public WebElement selectWishlistItem() {
		
		return driver.findElement(WishlistLocators.selectWishlistItem);
	}
public WebElement closePopup() {
		
		return driver.findElement(WishlistLocators.popup);
	}
	
}
