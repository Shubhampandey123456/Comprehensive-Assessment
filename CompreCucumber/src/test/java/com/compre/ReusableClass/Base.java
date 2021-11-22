package com.compre.ReusableClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Base{


	public static WebDriver driver;
	
	//creating properties folder
	public Properties prop;
    
	
	public static ExtentTest test;
	public static ExtentReports report;
	
	public static void initializeReport()
	{
		if(report==null)
		report = new ExtentReports(System.getProperty("user.dir") + "\\Extentreports\\" + "ExtentReportResults-"
				+ System.currentTimeMillis() + "-.html");
	}
	
	@SuppressWarnings("deprecation")
	public WebDriver setthings() throws IOException
	{

		prop=new Properties();
		
		String pathin=System.getProperty("user.dir");

		//Taking names from file
		FileInputStream input=new FileInputStream(pathin+"\\src\\test\\resources\\config.properties");

		//loading file
		prop.load(input);

		//getting Browser Name
		String browsername=prop.getProperty("browser");
		
		String pathi=prop.getProperty("path");

		//printing browser name
		System.out.println(browsername);

		//invoking Browser
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", pathin+pathi);
			driver=new ChromeDriver();
		}
		
		else
		{
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;		
	}
}
