package com.facilities.generic.admin;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.facilities.objectrepository.AdminLogin;
import com.facilities.objectrepository.Adminpage;
import com.facilities.objectrepository.EditProfile;
import com.facilities.objectrepository.ManageArea;
import com.facilities.objectrepository.Manufacturer;
import com.facilities.objectrepository.Manufacturerlogin;
import com.facilities.objectrepository.NewOrder;
import com.facilities.objectrepository.RetailerLogin;

import om.facilities.basetest.BaseClass;

public class Retailer extends BaseClass
{
	@Test(groups= {"regressiontest"})
	public void Retailerclass() throws Throwable
	{
		
		Manufacturer ma=new Manufacturer(driver);
		ma.ManufacturerLogin();
		
		String Mproductname=elib.getDataFromExcel("Sheet6",1, 0)+jlib.getRandomNumber();
		String Mprice=elib.getDataFromExcel("Sheet6",1,1);
		String Munittype=elib.getDataFromExcel("Sheet6",1, 2);
		String Mcategorytype=elib.getDataFromExcel("Sheet6",1, 3);
		String Mdescription=elib.getDataFromExcel("Sheet6",1, 4);
		
		
		Manufacturerlogin m=new Manufacturerlogin(driver);
		
		m.getAddprolink().click();
		m.getPname().sendKeys(Mproductname);
		m.getPprice().sendKeys(Mprice);
		m.dropdown(Munittype, Mcategorytype);
		m.getStockManagement().click();
		m.getDescription().sendKeys(Mdescription);
		driver.manage().window().maximize();
		try
		{
		m.getAddProduct().click();
		driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			
		}
		ManageArea man=new ManageArea(driver);
		man.getLogout().click();
		
		RetailerLogin r=new RetailerLogin(driver);
		r.rLogin();
		String Quantity=elib.getDataFromExcel("Sheet6",1, 5);
		NewOrder no=new NewOrder(driver);
		no.getNewOrderlink().click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wlib.pageToLoad(driver);
	
		
		WebElement element=driver.findElement(By.xpath("//td[text()=' "+ Mproductname +" ']/../td[5]"));
		
	
		wlib.waitforelementpresent(driver,element);
		wlib.pageToLoad(driver);
		try
		{
		element.sendKeys(Quantity);
		}
		catch(Exception e)
		{
		
		}
		wlib.pageToLoad(driver);
		no.getPostOrderbtn().click();
		ManageArea mana=new ManageArea(driver);
		mana.getLogout().click();
		
	}
	@Test(groups= {"regressiontest"})
	public void profile() throws Throwable
	{
		RetailerLogin r=new RetailerLogin(driver);
		r.rLogin();
		String address=elib.getDataFromExcel("Sheet6", 2,0)+jlib.getRandomNumber();
		EditProfile ep=new EditProfile(driver);
		ep.getEditProfilelnk().click();
		ep.getRaddresstxtarea().clear();
		ep.getRaddresstxtarea().sendKeys(address);
		try
		{
		ep.getUpdateprofile().click();
		driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			
		}
		wlib.pageToLoad(driver);
		ManageArea mana=new ManageArea(driver);
		mana.getLogout().click();
		
	}
	

}
