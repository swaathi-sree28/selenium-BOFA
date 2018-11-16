package com.Webshop;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tagNameDemo {
	@Test
	public void testTableShoppingCart()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("swaah@smaill.com");
	driver.findElement(By.id("Password")).sendKeys("Swaathi");
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	driver.findElement(By.partialLinkText("Shopping Cart")).click();
	//WebElement table=driver.findElement(By.className("cart"));
	WebElement tbody=driver.findElement(By.xpath(""));
	
	List<WebElement> list=table.findElements(By.tagName("tr"));
	Assert.assertEquals(list.size()-1, 4);
}
}