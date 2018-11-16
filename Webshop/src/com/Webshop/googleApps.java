package com.Webshop;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googleApps {
@Test
public void appCount()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	driver.findElementByCssSelector("a title['Google apps']").click();
	WebElement app=driver.findElementByCssSelector("ul[aria-dropeffect='move']").click();
	List<WebElement> appcount=app.findElements(By.tagName("li"));
	Assert.assertEquals(appcount.size(), 13);
	
	}
	




	
}
