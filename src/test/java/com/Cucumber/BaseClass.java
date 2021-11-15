

package com.Cucumber;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	public static WebDriver driver;
	public static WebDriver browserlaunch7(String a) 
	{
		if(a.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakas\\eclipse-workspace\\com.maven\\Driver\\chromedriver.exe");
            driver=new ChromeDriver();
        
		}
		else
		{
			System.out.println("Inavlid browser");
		}
        driver.manage().window().maximize();
        return driver;
	}
	//url
	public static void url7(String a) 
	{
		
        driver.get(a);
	}
//Sendkeys
	public static void sendkeys7(WebElement ele,String s) 
	{
	ele.sendKeys(s);
	}
//click
	public static void click7(WebElement ele) 
	{
		ele.click();

	}
	//text
	public static void text7(WebElement ele) 
	{
      ele.getText();
	}
	//Atrribute
	public static void attributtes7(WebElement ele,String str)
	{
		ele.getAttribute(str);
	}
	//TagName
	public static void tagname7(WebElement ele)
	{
		ele.getTagName();
	}
	//screenshot
	public static void to_screenshot7(String path) throws Throwable 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
	}
	//actions
	public static void close7() 
	{
	driver.close();	

	}
	//browser launch
public static void scrollup7(int num) 
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+num+")");

}
 public static void scrolldown7(int num) 
 {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+num+")");	
}
 public static void sleep7(int num) throws Throwable
 {
	 Thread.sleep(num);
 }
 public static void quit7() 
 {
	driver.quit();
}
 public static void navigateto7(String str) 
{
	
driver.navigate().to(str);
}
 public static void navigateback7(String str)
 {
	 driver.navigate().to(str);
 }
 public static void refresh7() 
 {
	 driver.navigate().refresh();
 }
 public static void alert_accept7(By selector)
 {
	 driver.findElement(selector).click();
	 driver.switchTo().alert().accept();
 }
 public static void alert_dismiss7(By selector)
 {
	 driver.findElement(selector).click();
	 driver.switchTo().alert().dismiss();
 }
 public static void move_to_element7(WebElement str)
 {
	 Actions a=new Actions(driver);
	 a.moveToElement(str).build().perform();
 }
 public static void context_click7(WebElement ele)
 {
	 Actions a=new Actions(driver);
	 a.contextClick(ele).build().perform();;
 }
 public static void double_click7(WebElement ele)
 {
	 Actions a=new Actions(driver);
	 a.doubleClick(ele);
 }
 public static void click_and_hold7()
 {
	 Actions a=new Actions(driver);
	 a.clickAndHold();
 }
 public static void drag_and_drop7(WebElement ele1,WebElement ele2)
 {
	 Actions a=new Actions(driver);
	 a.dragAndDrop(ele1,ele2);
 }
 public static void aclick(WebElement ele) 
	{
		Actions ax=new Actions(driver);
		ax.click(ele);

	}
 public static void frames_index7(int index)
 {
	 driver.switchTo().frame(index);
 }
 public static void frames_name7(String name)
 {
	 driver.switchTo().frame(name);
 }
 public static void frames_webelement7(WebElement ele)
 {
	 driver.switchTo().frame(ele);
 }
 public static void down_keypress7() throws Throwable 
 {
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_DOWN);
 }
 public static void down_release7() throws Throwable 
 {
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_DOWN);
 }
 public static void enter_keyrelase7() throws Throwable 
 {
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
 }
 public static void enter_keypress() throws Throwable 
 {
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
 }
 public static void window_Handle7(WebDriver ele)
 {
	 String main = ele.getWindowHandle();
	 String title = driver.switchTo().window(main).getTitle();
	 System.out.println(title);
 }
 public static void implicit_wait7(int seconds)
 {
	 driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
 }
public static  void select_by_value7(WebElement ele,String str)
{
	Select s=new Select(ele);
	s.selectByValue(str);
}
public static void select_by_text7(WebElement ele,String str)
{
	Select s=new Select(ele);
	s.selectByVisibleText(str);
}
public static void select_by_index7(WebElement ele,int num)
{
	Select s=new Select(ele);
	s.selectByIndex(num);
}
public static void get_Options(WebElement ele)
{
	Select s=new Select(ele);
	List<WebElement> options = s.getOptions();
	for(WebElement s1:options)
	{
		System.out.println(s1.getText());
	}
}
public static void get_First_Selected(WebElement ele)
{
	Select s=new Select(ele);
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println("First Selected Option is:"+firstSelectedOption.getText());
}
public static void  get_All_Selected(WebElement ele)
{
	Select s=new Select(ele);
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for(WebElement all:allSelectedOptions)
	{
		System.out.println("All selected options is:"+all.getText());
	}
}
public static void click(WebElement ele)
{
	ele.click();
}
}

