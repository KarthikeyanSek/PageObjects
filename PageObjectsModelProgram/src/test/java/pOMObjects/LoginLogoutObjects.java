package pOMObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginLogoutObjects {
	WebDriver driver;

	public LoginLogoutObjects() {
		this.driver = driver;
	}
	@FindBy(how=How.ID,using="user-name") WebElement Username;
	@FindBy(how=How.ID,using="password") WebElement Password;
	@FindBy(how=How.ID,using="login-button") WebElement LoginButton;
	@FindBy(how=How.ID,using="react-burger-menu-btn") WebElement HamburgerMenu;
	@FindBy(how=How.ID,using="logout_sidebar_link") WebElement LogoutLink;
	
	public void login() {
		Username.sendKeys("problem_user");
		Password.sendKeys("secret_sauce");
		LoginButton.click();
	}
	public void logout() throws InterruptedException {
		Thread.sleep(4000);
		HamburgerMenu.click();
		Thread.sleep(4000);
		LogoutLink.click();
		
	}
		

	}

