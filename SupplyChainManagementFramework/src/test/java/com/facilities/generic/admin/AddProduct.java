package com.facilities.generic.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.facilities.generic.fileutility.ExcelUtility;
import com.facilities.generic.fileutility.FileUtility;
import com.facilities.generic.javautility.JavaUtility;
import com.facilities.generic.webdriverutility.WebDriverUtility;
import com.facilities.objectrepository.AddDistributor;
import com.facilities.objectrepository.AddManufacturer;
import com.facilities.objectrepository.AddRetailer;
import com.facilities.objectrepository.AdminLogin;
import com.facilities.objectrepository.Adminpage;
import com.facilities.objectrepository.Manage;
import com.facilities.objectrepository.ManageArea;
import com.facilities.objectrepository.ManageCategories;
import com.facilities.objectrepository.ManageCategory;
import com.facilities.objectrepository.ManageStock;
import com.facilities.objectrepository.ManageUnit;
import com.facilities.objectrepository.Manufacturer;
import com.facilities.objectrepository.Manufacturerlogin;
import com.facilities.objectrepository.RetailerLogin;

import om.facilities.basetest.BaseClass;


public class AddProduct extends BaseClass
{
	
	@Test(groups= {"regressiontest"})
	public void adminpage() throws Throwable
	{

		AdminLogin al=new AdminLogin(driver);
		al.LoginasAdmin();
				
		String productname=elib.getDataFromExcel("Sheet1",1, 0)+jlib.getRandomNumber();
		String price=elib.getDataFromExcel("Sheet1",1,1);
		String unittype=elib.getDataFromExcel("Sheet1",1, 2);
		String categorytype=elib.getDataFromExcel("Sheet1",1, 3);
		String description=elib.getDataFromExcel("Sheet1",1, 4);
		String Retailername=elib.getDataFromExcel("Sheet2",1, 0)+jlib.getRandomNumber();
		String Retailerpassword=elib.getDataFromExcel("Sheet2",1, 1);
		String area=elib.getDataFromExcel("Sheet2",1, 2);
		String Rphone=elib.getDataFromExcel("Sheet2",1, 3);
		String Remail=elib.getDataFromExcel("Sheet2",1, 4);
		String Raddress=elib.getDataFromExcel("Sheet2",1,5);
		String Manufacturername=elib.getDataFromExcel("Sheet3",1, 0);
		String Memail=elib.getDataFromExcel("Sheet3",1, 1);
		String Mphone=elib.getDataFromExcel("Sheet3",1, 2);
		String Musername=elib.getDataFromExcel("Sheet3",1, 3)+jlib.getRandomNumber();
		String Mpassword=elib.getDataFromExcel("Sheet3",1, 4);
		String Distributorname=elib.getDataFromExcel("Sheet4",1, 0);
		String Demail=elib.getDataFromExcel("Sheet4",1, 1);
		String Dphone=elib.getDataFromExcel("Sheet4",1, 2);
		String Daddress=elib.getDataFromExcel("Sheet4",1, 3);
		
		wlib.pageToLoad(driver);
		
		driver.manage().window().maximize();
		
		Adminpage ap=new Adminpage(driver);
		ap.getAddprolink().click();
		ap.getPname().sendKeys(productname);
		ap.getPprice().sendKeys(price);
		ap.dropdown(unittype, categorytype);
		ap.getStockManagement().click();
		ap.getDescription().sendKeys(description);
		
		try
		{
		ap.getAddProduct().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		ap.getProductspage().click();
		wlib.scrollPageToDown(driver);
		
	String pname=	driver.findElement(By.xpath("//td[text()=' "+productname+" ']/../td[3]")).getText();
System.out.println(pname);
		Assert.assertEquals(productname,pname);
		
		
		AddRetailer ar=new AddRetailer(driver);
		ar.getAddretailerlink().click();
		ar.getRetailername().sendKeys(Retailername);
		ar.getRetailerpassword().sendKeys(Retailerpassword);
		ar.getRetailerarea().sendKeys(area);;
		ar.getRetailerphoneno().sendKeys(Rphone);
		ar.getRetaileremail().sendKeys(Remail);
		ar.getRetaileraddress().sendKeys(Raddress);
		try
		{
		ar.getAddretailer().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		RetailerLogin r=new RetailerLogin(driver);
		r.getRetailerspage().click();
		wlib.scrollPageToDown(driver);

		String rname=driver.findElement(By.xpath("//td[text()=' "+Retailername+" ']/../td[3]")).getText();
		Assert.assertEquals(Retailername,rname);
		
		
		AddManufacturer am=new AddManufacturer(driver);
		am.getAddmanulink().click();
		am.getManufacturername().sendKeys(Manufacturername);
		am.getManufacturerremail().sendKeys(Memail);
		am.getManufacturerphoneno().sendKeys(Mphone);
		am.getManufacturerusername().sendKeys(Musername);
		am.getManufacturerpassword().sendKeys(Mpassword);
		try
		{
			
		am.getAddmanufacturer().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
			
		}
		Manufacturerlogin  ml=new Manufacturerlogin (driver);
		ml.getManufacturerspage()
		.click();
		wlib.scrollPageToDown(driver);

		String mname=driver.findElement(By.xpath("//td[text()=' "+Manufacturername+" ']/../td[3]")).getText();
		Assert.assertEquals(Manufacturername,mname);
		
		
		AddDistributor ad=new AddDistributor(driver);
		ad.getAddDistributorlink().click();
		ad.getDistributorname().sendKeys(Distributorname);
		ad.getDistributoremail().sendKeys(Demail);
		ad.getDistributorphoneno().sendKeys(Dphone);
		ad.getDistributoraddress().sendKeys(Daddress);
		try
		{
		
		ad.getAdddistributor().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		AddDistributor adp=new AddDistributor(driver);
		adp.getDistributorspage().click();
		wlib.scrollPageToDown(driver);

		String dname=driver.findElement(By.xpath("//td[text()=' "+Distributorname+" ']/../td[3]")).getText();
		Assert.assertEquals(Distributorname,dname);
		
		ManageArea ma=new ManageArea(driver);
		ma.getLogout();
		
			
		
	}
	
	@Test(groups= {"regressiontest"})
	public void manageDetails() throws Throwable
	{
		AdminLogin al=new AdminLogin(driver);
		al.LoginasAdmin();
		driver.manage().window().maximize();
		String unit=elib.getDataFromExcel("Sheet5", 1, 0);
		String unitdes=elib.getDataFromExcel("Sheet5", 1, 1);
		
		Manage m=new Manage(driver);
		m.getManageUnitlink().click();
		m.clickaddunit();
		m.getAddunit().click();
		m.getUnitNametextfield().sendKeys(unit);
		m.getUnitDetailstextfield().sendKeys(unitdes);
		try
		{
		m.getAddunitbtn().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		/*m.getManageUnitlink().click();
		driver.manage().window().maximize();
		wlib.scrollPageToDown(driver);
		String unitname=driver.findElement(By.xpath("//td[text()='"+unit+"']/../td[3]")).getText();
		Assert.assertEquals(unit,unitname);*/
		
		String category=elib.getDataFromExcel("Sheet5", 1, 2);
		String categorydes=elib.getDataFromExcel("Sheet5", 1, 3);
		ManageCategory mc=new ManageCategory(driver);
		mc.getManageCategorylink().click();
		mc.clickaddcategory();
		mc.getAddcategory().click();
		mc.getCategoryNametextfield().sendKeys(category);
		mc.getCategoryDetailstextfield().sendKeys(categorydes);
		try
		{
		mc.getAddcategorybtn().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		/*mc.getManageCategorylink().click();
		wlib.scrollPageToDown(driver);
		String categoryname=driver.findElement(By.xpath("//td[text()=' "+category+" ']/../td[3]")).getText();
		System.out.println(categoryname);
		Assert.assertEquals(category,categoryname);*/

		String area=elib.getDataFromExcel("Sheet5", 1, 4);
		String areades=elib.getDataFromExcel("Sheet5", 1, 5);
		ManageArea ma=new ManageArea(driver);
		ma.getManageArealink().click();
		ma.clickaddarea();
		ma.getAddarea().click();
		ma.getAreaNametextfield().sendKeys(area);
		ma.getAreacodetextfield().sendKeys(areades);
		
		try
		{
		ma.getAddareabtn().click();
		wlib.switchtoAlertandAccept(driver);
		
		}
		catch(Exception e)
		{
			
		}
		/*ma.getManageArealink().click();
		wlib.scrollPageToDown(driver);
		String areaname=driver.findElement(By.xpath("//td[text()=' "+area+" ']/../td[3]")).getText();
		Assert.assertEquals(area,areaname);*/

		ma.getLogout().click();
		
	}
	
	@Test(groups= {"regressiontest"})
	public void manufacturerlogin() throws Throwable
	{
		Manufacturer ma=new Manufacturer(driver);
		ma.ManufacturerLogin();
		driver.manage().window().maximize();
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
		
		try
		{
		m.getAddProduct().click();
		driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			
		}
		ManageStock ms=new ManageStock (driver);
		ms.getManageStocklink().click();
		try
		{
		ms.uStock();
		ms.getUpdatestock().click();
		}
		catch(Exception e)
		{
			
		}
		
		String unit=elib.getDataFromExcel("Sheet5", 1, 0);
		String unitdes=elib.getDataFromExcel("Sheet5", 1, 1);
		ManageUnit mu=new ManageUnit(driver);
		mu.getManageUnitlink().click();
		mu.clickaddunit();
		mu.getAddunit().click();
		mu.getUnitNametextfield().sendKeys(unit);
		mu.getUnitDetailstextfield().sendKeys(unitdes);
		try
		{
		mu.getAddunitbtn().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		String category=elib.getDataFromExcel("Sheet5", 1, 2);
		String categorydes=elib.getDataFromExcel("Sheet5", 1, 3);
		ManageCategories mc=new ManageCategories(driver);
		mc.getManageCategorylink().click();
		mc.clickaddcategory();
		mc.getAddcategory().click();
		mc.getCategoryNametextfield().sendKeys(category);
		mc.getCategoryDetailstextfield().sendKeys(categorydes);
		try
		{
		mc.getAddcategorybtn().click();
		wlib.switchtoAlertandAccept(driver);
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}
