package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageStock 
{
	WebDriver driver;
	public ManageStock(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Manage Stock")
	private WebElement ManageStocklink;
	@FindBy(id="btnSubmit")
	private WebElement updatestock;
	public WebElement getManageStocklink() {
		return ManageStocklink;
	}
	public WebElement getUpdatestock() {
		return updatestock;
	}
	
	public void uStock()
	{
		Actions action=new Actions(driver);
		action.scrollByAmount(10000, 10000);
		action.scrollToElement(updatestock).perform();
		updatestock.click();
	}
	
	
}
