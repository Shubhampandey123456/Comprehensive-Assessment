package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.GiftCardLocators;



public class GiftCardPOM extends Base{
	
	public GiftCardPOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getGiftCard() {
		return driver.findElement(GiftCardLocators.giftCard);
	}
	public WebElement getPostCode() {
		return driver.findElement(GiftCardLocators.postcode);
	}
	public WebElement getCodeCheck() {
		return driver.findElement(GiftCardLocators.codeCheck);
	}
	public WebElement getCodeText() {
		return driver.findElement(GiftCardLocators.codeText);
	}
	
	
	

}
