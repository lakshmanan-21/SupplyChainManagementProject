package com.facilities.generic.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility 
{
	public void pageToLoad(WebDriver driver)
	{
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	public void waitforelementpresent(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void select(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectbyvalue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void mousemoveonelement(WebElement element,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();;
		
	}
	public void doubleclick(WebElement element,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
		
	}
	public void scroll(WebElement element,WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.scrollToElement(element).perform();;
		
	}
	
	
   public void switchToTabOnURL(WebDriver driver,String partialurl)
   {
	   Set<String> childwindow=driver.getWindowHandles();
	   for(String window:childwindow)
	   {
		   driver.switchTo().window(window);
		   if(driver.getCurrentUrl().contains(partialurl))
		   {
			   break;
		   }
		   
	   }
   }
   
   public void switchToTabOnTitle(WebDriver driver,String partialtitle)
   {
	   Set<String> childwindow=driver.getWindowHandles();
	   for(String window:childwindow)
	   {
		   driver.switchTo().window(window);
		   if(driver.getCurrentUrl().contains(partialtitle))
		   {
			   break;
		   }
		   
	   }
   }
   
   public void switchtoAlertandAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
   
   public void switchtoAlertandDismiss(WebDriver driver)
  	{
  		driver.switchTo().alert().dismiss();
  	}
   
}
