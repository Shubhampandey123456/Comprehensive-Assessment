package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.ContactUI;



public class ContactPOM extends Base {

	public ContactPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement contactClick()
	{
		return driver.findElement(ContactUI.ContactClick);
	}

	public WebElement Nameclick()
	{
		return driver.findElement(ContactUI.naam);
	}

	public WebElement Emailclick()
	{
		return driver.findElement(ContactUI.mail);
	}

	
	public WebElement Msgclick()
	{
		return driver.findElement(ContactUI.msg);
	}

	
	public WebElement sendclick()
	{
		return driver.findElement(ContactUI.sbmit);
	}



}
