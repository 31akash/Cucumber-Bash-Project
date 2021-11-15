package com.step2;

import org.openqa.selenium.WebDriver;

import com.Cucumber.BaseClass;
import com.Cucumber.PrivateLoginPage;
import com.runner.AdactinRunner;
import com.runner.AdactinRunner2;

import cucumber.api.java.en.*;

public class StepDefinition2 extends BaseClass 
{
	public static WebDriver driver=AdactinRunner2.driver;
PrivateLoginPage lp=new PrivateLoginPage(driver);
@Given("^user launch the application$")
public void user_launch_the_application() throws Throwable 
{
   url7("http://adactinhotelapp.com/");
}

@When("^user enter the  valid \"([^\"]*)\" in the field$")
public void user_enter_the_valid_in_the_field(String arg1) throws Throwable 
{
   sendkeys7(lp.getName(), arg1);
}

@When("^user enter   valid \"([^\"]*)\" in the field$")
public void user_enter_valid_in_the_field(String arg1) throws Throwable 
{
	 sendkeys7(lp.getPass(), arg1);
}

@Then("^user clicks the login button$")
public void user_clicks_the_login_button() throws Throwable 
{
   click7(lp.getLogin());
}



}
