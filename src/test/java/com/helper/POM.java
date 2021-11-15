package com.helper;

import org.openqa.selenium.WebDriver;

import com.Cucumber.PrivateBooking;
import com.Cucumber.PrivateLoginPage;

public class POM 
{
	public static WebDriver driver;
	private PrivateBooking bp;
	private PrivateLoginPage lp;
	public POM(WebDriver driver2) 
	{
		this.driver=driver2;
		
	}
	public PrivateBooking getBp() 
	{
		bp=new PrivateBooking(driver);
		return bp;
	}
	public PrivateLoginPage getLp() 
	{
		lp=new PrivateLoginPage(driver);
		return lp;
	}

}
