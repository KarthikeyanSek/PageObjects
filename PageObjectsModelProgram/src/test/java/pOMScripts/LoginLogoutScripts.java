package pOMScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pOMObjects.LoginLogoutObjects;





public class LoginLogoutScripts {
WebDriver driver;
	
	@Test
	public void init() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\KARTHIK\\SELENIUM NEW\\Essentials\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	LoginLogoutObjects qatest = PageFactory.initElements(driver, LoginLogoutObjects.class);
	qatest.login();
	qatest.logout();
	Thread.sleep(3000);
	qatest.login();
	
	}
}



