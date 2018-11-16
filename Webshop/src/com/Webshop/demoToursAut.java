package com.Webshop;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoToursAut {

	@Test
	public class flightTours {
		public void flightDemo() throws InterruptedException
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("mercury");
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mercury");	
			driver.findElement(By.cssSelector("input[value='Login']")).click();
			driver.findElement(By.cssSelector("input[value='oneway']")).click();	
			driver.findElement(By.name("passCount")).sendKeys("4");
			Select city=new Select(driver.findElement(By.name("fromPort")));
			List<WebElement> list=city.getOptions();
					Assert.assertEquals(list.size(), 10);
					for(WebElement e:list)
					{
						String fromcity=e.getText();
						if(fromcity.equals("Paris"))
						{
							city.selectByVisibleText(fromcity);
							break;
							
						}
					}
			
			}
	}
}

		
