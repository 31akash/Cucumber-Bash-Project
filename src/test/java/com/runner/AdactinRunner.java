package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber.BaseClass;
import com.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature",glue="com.stepdefinition")
public class AdactinRunner 
{
public static WebDriver driver;
@BeforeClass
public static void setup() throws Throwable
{
	
String browser = FileReaderManager.getInstanceCR().getBrowser();
	driver=BaseClass.browserlaunch7(browser);
}
}
