package com.Webshop;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class datademo {
	
	ChromeDriver driver;
	@Test(dataProvider = "dp",dataProviderClass=NewTest.class)
	public void testLoginDemo(String n, String s) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(n);
		driver.findElement(By.id("Password")).sendKeys(s);
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		WebElement logout=driver.findElement(By.className("ico=logout"));
		Assert.assertNotNull(logout);
  }
  @BeforeClass
  public void beforeMethod() {
	driver=new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterMethod() {
	  driver.close();
	  
  }
}

 

