package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facilities.generic.fileutility.ExcelUtility;
import com.facilities.generic.fileutility.FileUtility;
import com.facilities.generic.webdriverutility.WebDriverUtility;

public class RetailerLogin 
{
	WebDriver driver;
	public RetailerLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="login:username")
	private WebElement usernamefield;
	@FindBy(id="login:password")
	private WebElement passwordfield;
	@FindBy(id="login:type")
	private WebElement logintypedropdown;
	@FindBy(xpath="//input[@value='Login']")
	private WebElement Loginbtn;
	public WebElement getUsername() {
		return usernamefield;
	}
	public WebElement getPassword() {
		return passwordfield;
	}
	public WebElement getLogintypedropdown() {
		return logintypedropdown;
	}
	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	 public void rLogin() throws Throwable
		{
			System.out.println("Login as Retailer");
			FileUtility flib=new FileUtility();
			ExcelUtility elib=new ExcelUtility();
			WebDriverUtility wlib=new WebDriverUtility();
			String URL=flib.getDataFromPropertiesFile("url");
			  String RUSERNAME=flib.getDataFromPropertiesFile("Rusername");
			  String RPASSWORD=flib.getDataFromPropertiesFile("Rpassword");
			  String Rlogintype=elib.getDataFromExcel("Sheet1",3,1);
			  driver.get(URL);
			  
			  usernamefield.sendKeys(RUSERNAME);
			  passwordfield.sendKeys(RPASSWORD);
			  wlib.select(logintypedropdown, Rlogintype);
			  Loginbtn.click();
			  
			  
	
    } 
	


}
