package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRetailer 
{
	WebDriver driver;
	public AddRetailer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Add Retailers")
	private WebElement addretailerlink;
	@FindBy(id="retailer:username")
	private WebElement retailername;
	@FindBy(id="retailer:password")
	private WebElement retailerpassword;
	@FindBy(id="retailer:areaCode")
	private WebElement retailerarea;
	@FindBy(id="retailer:phone")
	private WebElement retailerphoneno;
	@FindBy(id="retailer:email")
	private WebElement retaileremail;
	@FindBy(id="retailer:address")
	private WebElement retaileraddress;
	@FindBy(xpath="//input[@value='Add Retailer']")
	private WebElement addretailer;
	
	
	public WebElement getAddretailer() {
		return addretailer;
	}
	public WebElement getAddretailerlink() {
		return addretailerlink;
	}
	public WebElement getRetailername() {
		return retailername;
	}
	public WebElement getRetailerpassword() {
		return retailerpassword;
	}
	public WebElement getRetailerarea() {
		return retailerarea;
	}
	public WebElement getRetailerphoneno() {
		return retailerphoneno;
	}
	public WebElement getRetaileremail() {
		return retaileremail;
	}
	public WebElement getRetaileraddress() {
		return retaileraddress;
	}

}
