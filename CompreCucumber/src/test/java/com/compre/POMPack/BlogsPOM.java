package com.compre.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.compre.UI.BlogsUI;



public class BlogsPOM extends BlogsUI{

	public WebDriver driver;
	
	public BlogsPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement ClickBlog()
	{
		return driver.findElement(BlogClick);
	}
	
	public WebElement Statemnt()
	{
		return driver.findElement(phrase);
	}
	
	
	
}
