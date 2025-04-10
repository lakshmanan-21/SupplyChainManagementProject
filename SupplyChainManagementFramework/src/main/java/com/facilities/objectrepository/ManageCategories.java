package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategories 
{
	WebDriver driver;
	public ManageCategories(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Manage Category")
	private WebElement ManageCategorylink;
	@FindBy(xpath="//input[@value='+ Add Category']")
	private WebElement addcategory;
	@FindBy(id="categoryName")
	private WebElement categoryNametextfield;
	@FindBy(id="categoryDetails")
	private WebElement categoryDetailstextfield;
	@FindBy(xpath="//input[@value='Add Category']")
	private WebElement addcategorybtn;
	public WebElement getManageCategorylink() {
		return ManageCategorylink;
	}
	public WebElement getAddcategory() {
		return addcategory;
	}
	public WebElement getCategoryNametextfield() {
		return categoryNametextfield;
	}
	public WebElement getCategoryDetailstextfield() {
		return categoryDetailstextfield;
	}
	public WebElement getAddcategorybtn() {
		return addcategorybtn;
	}
	public void clickaddcategory()
	{
		Actions action=new Actions(driver);
		action.scrollByAmount(5000, 5000);
		action.scrollToElement(addcategory).perform();
	}
}



