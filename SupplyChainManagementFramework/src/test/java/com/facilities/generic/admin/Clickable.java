package com.facilities.generic.admin;

import org.testng.annotations.Test;

import com.facilities.objectrepository.AdminLogin;
import com.facilities.objectrepository.Click;

import om.facilities.basetest.BaseClass;

public class Clickable extends BaseClass
{
	@Test(groups= {"smoketest"})
	public void visible() throws Throwable
	{
		AdminLogin al=new AdminLogin(driver);
		al.LoginasAdmin();
	Click c=new Click(driver);
	c.getOrderslnk().click();
	
	wlib.pageToLoad(driver);

   }
	@Test(groups= {"smoketest"})
	public void visibles() throws Throwable
	{
		AdminLogin al=new AdminLogin(driver);
		al.LoginasAdmin();
	Click c=new Click(driver);
	
	c.getInvoicelnk().click();
	wlib.pageToLoad(driver);

   }
	
	
}
