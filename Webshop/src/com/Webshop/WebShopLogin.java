package com.Webshop;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebShopLogin {
	@Test
public void testLoginDemoWebShop()
{
	System.setProperty("webdriver.ie.diver","C:\\Users\\TRAINING_B6B.01.09\\Desktop\\selenium library\\seleniumdrivers\\IEDriverServer.exe");
    InternetExplorerDriver d= new InternetExplorerDriver();
    d.close();
	
}
}

