package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile 
{
	WebDriver driver;
	public EditProfile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Edit Profile")
	private WebElement EditProfilelnk;
	@FindBy(id="retailer:address")
	private WebElement raddresstxtarea;
	@FindBy(xpath="//input[@value='Update Profile']")
	private WebElement updateprofile;
	public WebElement getEditProfilelnk() {
		return EditProfilelnk;
	}
	public WebElement getRaddresstxtarea() {
		return raddresstxtarea;
	}
	public WebElement getUpdateprofile() {
		return updateprofile;
	}
	

}
