package om.facilities.basetest;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.facilities.generic.fileutility.ExcelUtility;
import com.facilities.generic.fileutility.FileUtility;
import com.facilities.generic.javautility.JavaUtility;
import com.facilities.generic.webdriverutility.WebDriverUtility;
import com.facilities.objectrepository.AdminLogin;

public class BaseClass
{
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public  JavaUtility jlib=new JavaUtility();
	public  WebDriverUtility wlib=new WebDriverUtility();
	public WebDriver driver;
	public static WebDriver sdriver=null;
	
	@BeforeSuite(groups= {"smoketest","regressiontest"})
	public void configBS()
	{
		System.out.println("connect to db,report config");
	}
	
	@Parameters("BROWSER")
	@BeforeClass(groups= {"smoketest","regressiontest"})
	public void configBC(@Optional("Chrome")String browser) throws Throwable
	
	{
		System.out.println("Launch the browser");
		String BROWSER=browser;
		//String BROWSER=flib.getDataFromPropertiesFile("browser");
		
		   if(BROWSER.equals("Chrome"))
		   {
		   	driver=new ChromeDriver();
		   }
		   else if(BROWSER.equals("firefox"))
		   {
		   	driver=new FirefoxDriver();
		   }
		   else if(BROWSER.equals("edge"))
		   {
		   	driver=new EdgeDriver();
		   }
		   else
		   {
		   	driver=new ChromeDriver();
		   	
		   }
		   sdriver=driver;
		   UtilityClassObject.setDriver(driver);
		   
	}
	
	@BeforeMethod(groups= {"smoketest","regressiontest"})
	public void configBM()
	{
		System.out.println("login");
	}
	
	
		  
		  
	@AfterMethod(groups= {"smoketest","regressiontest"})
	public void configAM()
	{
		System.out.println("Logout");
		
		
	}
	@AfterClass(groups= {"smoketest","regressiontest"})
	public void configAC()
	{
		System.out.println("close the browser");
		driver.quit();
		
	}
	@AfterSuite(groups= {"smoketest","regressiontest"})
	public void configAS() throws SQLException
	{
		System.out.println("close db,report backup");
		//dblib.closedbConnection();
	}
	
	

}
