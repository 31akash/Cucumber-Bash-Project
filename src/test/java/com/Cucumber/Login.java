package com.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Cucumber.PrivateLoginPage;

public class Login extends BaseClass
{
	public static WebDriver driver;
	public Login(WebDriver driver2) 
	{
	this.driver=driver2;
	PageFactory.initElements(driver,driver2); 
	}
	public static void main(String[] args) throws Throwable 
	{
	PrivateLoginPage pl=new PrivateLoginPage(driver);
	driver=browserlaunch7("chrome");
	url7("http://adactinhotelapp.com/");
	WebElement name = driver.findElement(By.xpath("(//input[@class='login_input'])[1]"));
	sleep7(3000);
	sendkeys7(pl.getName(),"Akashadc7");
	WebElement pass = driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
	sendkeys7(pl.getPass(),"FC36LU");
	WebElement login = driver.findElement(By.xpath("//input[@class='login_button']"));
	click(pl.getLogin());
	System.out.println("Yes");
}
}
