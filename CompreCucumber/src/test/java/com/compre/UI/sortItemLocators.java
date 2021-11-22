package com.compre.UI;

import org.openqa.selenium.By;

public class sortItemLocators {

	public static By secretSanta=By.xpath("//div[@class='text-center main-menu']/div/ul/li[5]");
	
	public static By sortItem=By.xpath("//select[@id='sortBy']");
	
	public static By sortCheck=By.xpath("//div[contains(text(), 'Dumbbell Water Bottle')]");
	
//	public static By sortCheck=By.linkText("Hot Seller");
}
