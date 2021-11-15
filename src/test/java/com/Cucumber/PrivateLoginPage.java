package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivateLoginPage 
{

	private WebDriver driver;
public PrivateLoginPage(WebDriver driver2) 
{
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
public WebElement getName() {
		return name;
	}
	public WebElement getPass() 
	{
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	
@FindBy(xpath="(//input[@class='login_input'])[1]")
private WebElement name;
@FindBy(xpath="(//input[@class='login_input'])[2]")
private WebElement pass;
@FindBy(xpath="//input[@class='login_button']")
private WebElement login;
}
