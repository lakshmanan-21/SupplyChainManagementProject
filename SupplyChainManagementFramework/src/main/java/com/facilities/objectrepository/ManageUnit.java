package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUnit 
{
	WebDriver driver;
	public ManageUnit(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Manage Unit")
	private WebElement ManageUnitlink;
	@FindBy(xpath="//input[contains(@value,'+ Add Unit')]")
	private WebElement addunit;
	@FindBy(id="unitName")
	private WebElement unitNametextfield;
	@FindBy(id="unitDetails")
	private WebElement unitDetailstextfield;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getManageUnitlink() {
		return ManageUnitlink;
	}
	public WebElement getAddunit() {
		return addunit;
	}
	public WebElement getUnitNametextfield() {
		return unitNametextfield;
	}
	public WebElement getUnitDetailstextfield() {
		return unitDetailstextfield;
	}
	public WebElement getAddunitbtn() {
		return addunitbtn;
	}
	@FindBy(xpath="//input[@value='Add Unit']")
	private WebElement addunitbtn;
	public void clickaddunit()
	{
		Actions action=new Actions(driver);
		action.scrollByAmount(5000, 5000);
		action.scrollToElement(addunit).perform();
	}

}
