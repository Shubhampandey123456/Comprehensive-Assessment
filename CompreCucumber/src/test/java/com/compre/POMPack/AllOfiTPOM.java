package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.AllItemLinkLocators;


public class AllOfiTPOM extends Base{

	public AllOfiTPOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getAllofIt() {
		return driver.findElement(AllItemLinkLocators.AllofIt);
		
	}
	public WebElement getNextPage() {
		return driver.findElement(AllItemLinkLocators.nextPage);
		
	}
	public WebElement getNewItem() {
		return driver.findElement(AllItemLinkLocators.newItem);
		
	}
	
	
}
