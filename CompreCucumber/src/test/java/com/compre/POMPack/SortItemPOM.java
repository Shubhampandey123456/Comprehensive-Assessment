package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.compre.ReusableClass.Base;
import com.compre.UI.sortItemLocators;



public class SortItemPOM extends Base{
	
	public SortItemPOM(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getSecretSantaGifts() {
		return driver.findElement(sortItemLocators.secretSanta);
	}
	public Select DropdownClick()
	{
		Select sel=new Select(driver.findElement(sortItemLocators.sortItem));
		return sel;
	}
	public WebElement getSortCheck() {
		return driver.findElement(sortItemLocators.sortCheck);
	}
}
