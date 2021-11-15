package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature2",glue="com.step2",monochrome = true,plugin = {
		"pretty", "html:report",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" },dryRun = true)

public class AdactinRunner2 
{
	public static WebDriver driver;
	@BeforeClass
	public static void setup()
	{
		driver=BaseClass.browserlaunch7("chrome");
	}
}
