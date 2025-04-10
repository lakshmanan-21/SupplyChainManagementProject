package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click 
{
	WebDriver driver;
	public Click(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Orders")
	private WebElement Orderslnk;
	@FindBy(linkText="Invoice")
	private WebElement Invoicelnk;
	public WebElement getOrderslnk() {
		return Orderslnk;
	}
	public WebElement getInvoicelnk() {
		return Invoicelnk;
	}

}
