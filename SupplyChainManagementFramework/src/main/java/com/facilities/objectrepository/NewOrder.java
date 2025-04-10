package com.facilities.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrder 
{
	WebDriver driver;
	public NewOrder(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="New Order")
	private WebElement NewOrderlink;
	@FindBy(id="btnSubmit")
	private WebElement PostOrderbtn;
	public WebElement getPostOrderbtn() {
		return PostOrderbtn;
	}
	public WebElement getNewOrderlink() {
		return NewOrderlink;
	}
	
}
