package com.facilities.generic.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.facilities.objectrepository.AdminLogin;
import com.facilities.objectrepository.Adminpage;
import com.facilities.objectrepository.Deletesupply;

import om.facilities.basetest.BaseClass;

public class Delete extends BaseClass
{
	@Test(groups= {"regressiontest"})
	public void deleteclass() throws Throwable
	{
		AdminLogin al=new AdminLogin(driver);
		al.LoginasAdmin();
				
		String productname=elib.getDataFromExcel("Sheet1",1, 0)+jlib.getRandomNumber();
		String price=elib.getDataFromExcel("Sheet1",1,1);
		String unittype=elib.getDataFromExcel("Sheet1",1, 2);
		String categorytype=elib.getDataFromExcel("Sheet1",1, 3);
		String description=elib.getDataFromExcel("Sheet1",1, 4);
		
		
		Adminpage ap=new Adminpage(driver);
		ap.getAddprolink().click();
		ap.getPname().sendKeys(productname);
		ap.getPprice().sendKeys(price);
		ap.dropdown(unittype, categorytype);
		ap.getStockManagement().click();
		ap.getDescription().sendKeys(description);
		driver.manage().window().maximize();
		try
		{
		ap.getAddProduct().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		Deletesupply ds=new Deletesupply(driver);
		ds.getProductslnk().click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wlib.scrollPageToDown(driver);
		wlib.pageToLoad(driver);
		
		driver.findElement(By.xpath("//td[text()=' "+productname+" ']/../td[1]")).click();
		ds.getDeletebtn().click();
		
	}

}
