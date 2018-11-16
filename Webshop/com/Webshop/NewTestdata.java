package com.Webshop;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTestdata {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
	ChromeDriver driver;
	@Test(dataProvider = "dp")
  public void f(string name, string password) {
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("swaah@smaill.com");
		driver.findElement(By.id("Password")).sendKeys("Swaathi");
		driver.findElement(By.CssSelector("input[value='Log In"])).click();
		WebElement logout=driver.findelement(By.classNam("ico=logout"));
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


  @DataProvider(name="dp"){
  public Object[][] getDataValidUsers() {
   Object[][] obj= {
		{"swaah@mail.com","sree"),
		{"swaah1@mail.com","sree"),
		{"swaah2@mail.com","sree")
    };
    return obj;
  }
}
