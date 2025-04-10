package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageArea 
{
	WebDriver driver;
	public ManageArea(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Manage Area")
	private WebElement ManageArealink;
	@FindBy(xpath="//input[@value='+ Add Area']")
	private WebElement addarea;
	@FindBy(id="areaName")
	private WebElement areaNametextfield;
	@FindBy(id="areaCode")
	private WebElement areacodetextfield;
	@FindBy(xpath="//input[@value='Add Area']")
	private WebElement addareabtn;
	@FindBy(xpath="//input[@value='Log out']")
	private WebElement logout;
	
	
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getManageArealink() {
		return ManageArealink;
	}
	public WebElement getAddarea() {
		return addarea;
	}
	public WebElement getAreaNametextfield() {
		return areaNametextfield;
	}
	
	public WebElement getAreacodetextfield() {
		return areacodetextfield;
	}
	public WebElement getAddareabtn() {
		return addareabtn;
	}
	public void clickaddarea()
	{
		Actions action=new Actions(driver);
		action.scrollByAmount(5000, 5000);
		action.scrollToElement(addarea).perform();
	}
	
}
