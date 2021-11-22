package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.OfficialMerchandiseLocators;



public class OfficialMerchandisePOM extends Base {
	
	public OfficialMerchandisePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getOfficialMerchandise() {
		return driver.findElement(OfficialMerchandiseLocators.officialMerchandise);
	}
	
	public WebElement getMarvelMerch() {
		return driver.findElement(OfficialMerchandiseLocators.marvel);
	}
	
	public WebElement getVerifiedTitle() {
		return driver.findElement(OfficialMerchandiseLocators.titleVerify);
	}

}
