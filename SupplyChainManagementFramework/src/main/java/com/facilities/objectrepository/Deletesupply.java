package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deletesupply 
{

	WebDriver driver;
	public Deletesupply(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deletebtn;
	@FindBy(linkText="Products")
	private WebElement productslnk;
	public WebElement getDeletebtn() {
		return deletebtn;
	}
	public WebElement getProductslnk() {
		return productslnk;
	}




}
