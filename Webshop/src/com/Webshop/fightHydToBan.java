package com.Webshop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fightHydToBan {
	@Test
	public void flightDemo() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("FromTag"));
		from.sendKeys("hyd");
		Thread.sleep(5000);
		from.sendKeys(Keys.ENTER);	
		
		WebElement to = driver.findElement(By.id("ToTag"));
		to.sendKeys("ban");
		Thread.sleep(5000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ARROW_DOWN);
		
		to.sendKeys(Keys.ENTER);
}
}