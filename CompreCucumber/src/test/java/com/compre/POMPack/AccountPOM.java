package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.ReusableClass.Base;
import com.compre.UI.AccountUI;



public class AccountPOM extends Base {

	
	public AccountPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(AccountUI.sign);
	}
	
	public WebElement nam()
	{
		return driver.findElement(AccountUI.name);
	}
	
	public WebElement pssw()
	{
		return driver.findElement(AccountUI.pass);
	}
	
	public WebElement done()
	{
		return driver.findElement(AccountUI.sbmit);
	}
	

}
