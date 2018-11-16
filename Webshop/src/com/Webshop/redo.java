package com.Webshop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	@Test
public class redo {
	
	ChromeDriver driver;
	@BeforeClass
	public void beforeclass()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
		System.out.println("in after class");
	}
	
		
	public void register()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.findElementById("gender-female").click();
		driver.findElement(By.id("FirstName")).sendKeys("Swaathi");
		driver.findElement(By.id("LastName")).sendKeys("Sree");
		driver.findElement(By.id("Email")).sendKeys("swaah@smaill.com");
		driver.findElement(By.id("Password")).sendKeys("Swaathi");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Swaathi");
		driver.findElementById("register-button").click();
		String result=driver.findElement(By.className("result")).getText();
		Assert.assertTrue(result.contains("completed"));
		driver.findElement(By.className("ico-logout")).click();
	}
@Test
	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("swaah@smaill.com");
		driver.findElement(By.id("Password")).sendKeys("Swaathi");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		WebElement logout=driver.findElement(By.className("ico=logout"));
		Assert.assertNotNull(logout);
	
		
		
		

}
}
