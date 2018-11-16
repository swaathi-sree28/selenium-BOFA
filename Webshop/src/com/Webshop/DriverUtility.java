package com.Webshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
public WebDriver getdriver(String browsername)
{
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\chromedriver.exe");
		return new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\geckodriver.exe");
		return new FirefoxDriver();
	}
	else if(browsername.equals("internetexplorer"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\IEdriverServer.exe");
		return new InternetExplorerDriver();
	}else
	{
	return null;
}
}
}
