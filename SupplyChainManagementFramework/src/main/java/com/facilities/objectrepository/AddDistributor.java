package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDistributor 
{
	WebDriver driver;
	public AddDistributor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Add Distributor")
	private WebElement addDistributorlink;
	@FindBy(id="distributor:name")
	private WebElement distributorname;
	@FindBy(id="distributor:email")
	private WebElement distributoremail;
	@FindBy(id="distributor:phone")
	private WebElement distributorphoneno;
	@FindBy(id="distributor:address")
	private WebElement distributoraddress;
	@FindBy(xpath="//input[@value='Add Distributor']")
	private WebElement adddistributor;
	
	@FindBy(linkText="Distributors")
	private WebElement Distributorspage;
	
	public WebElement getDistributorspage() {
		return Distributorspage;
	}
	public WebElement getAddDistributorlink() {
		return addDistributorlink;
	}
	public WebElement getDistributorname() {
		return distributorname;
	}
	public WebElement getDistributoremail() {
		return distributoremail;
	}
	public WebElement getDistributorphoneno() {
		return distributorphoneno;
	}
	public WebElement getDistributoraddress() {
		return distributoraddress;
	}
	public WebElement getAdddistributor() {
		return adddistributor;
	}
	
	

}
