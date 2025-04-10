package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facilities.generic.fileutility.ExcelUtility;
import com.facilities.generic.fileutility.FileUtility;
import com.facilities.generic.webdriverutility.WebDriverUtility;

import om.facilities.basetest.BaseClass;

public class Manufacturerlogin 
{
	
	WebDriver driver;
	public Manufacturerlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Add Products")
	private WebElement addprolink;
	@FindBy(id="product:name")
	private WebElement pname;
	@FindBy(id="product:price")
	private WebElement pprice;
	@FindBy(id="product:unit")
	private WebElement unit;
	@FindBy(id="product:category")
	private WebElement category;
	@FindBy(xpath="//input[@value='1']")
	private WebElement StockManagement;
	@FindBy(id="product:description")
	private WebElement description;
	@FindBy(xpath="//input[@value='Add Product']")
	private WebElement AddProduct;
	public WebElement getAddprolink() {
		return addprolink;
	}
	public WebElement getPname() {
		return pname;
	}
	public WebElement getPprice() {
		return pprice;
	}
	public WebElement getUnit() {
		return unit;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getStockManagement() {
		return StockManagement;
	}
	public WebElement getDescription() {
		return description;
	}
	public WebElement getAddProduct() {
		return AddProduct;
	}
	
	
	
	public void dropdown(String Munittype,String Mcategorytype)
	{
		WebDriverUtility wlib=new WebDriverUtility();
		wlib.selectbyvalue(unit, Munittype);
		wlib.selectbyvalue(category, Mcategorytype);
       
	}
	
}
