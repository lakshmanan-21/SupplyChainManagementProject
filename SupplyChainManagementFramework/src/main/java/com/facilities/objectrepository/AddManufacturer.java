package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddManufacturer 
{
	public WebElement getAddmanulink() {
		return addmanulink;
	}
	public WebElement getManufacturername() {
		return manufacturername;
	}
	public WebElement getManufacturerremail() {
		return manufacturerremail;
	}
	public WebElement getManufacturerphoneno() {
		return manufacturerphoneno;
	}
	public WebElement getManufacturerusername() {
		return manufacturerusername;
	}
	public WebElement getManufacturerpassword() {
		return manufacturerpassword;
	}
	public WebElement getAddmanufacturer() {
		return addmanufacturer;
	}
	WebDriver driver;
	public AddManufacturer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Add Manufacturer")
	private WebElement addmanulink;
	@FindBy(xpath="//input[@id='manufacturer:name']")
	private WebElement manufacturername;
	@FindBy(id="manufacturer:email")
	private WebElement manufacturerremail;
	@FindBy(id="manufacturer:phone")
	private WebElement manufacturerphoneno;
	@FindBy(id="manufacturer:username")
	private WebElement manufacturerusername;
	@FindBy(id="manufacturer:password")
	private WebElement manufacturerpassword;
	@FindBy(xpath="//input[@value='Add Manufacturer']")
	private WebElement addmanufacturer;
	
	
}
