package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	WebDriver driver;

	By textbox_username =By.id("txtUsername");
	
	By textbox_password = By.id("txtPassword");
	
	@FindBy(id="txtUsername")
	WebElement txt_username;
	
	public loginpage(WebDriver driver) {
		this.driver= driver;
		
	}
	public void enterusername(String username) {
		driver.findElement(textbox_username).sendKeys(username);

	}
	
	public void enterpassword( String password) {
		driver.findElement(textbox_password).sendKeys(password);
	}
	public void submit_login() {
		driver.findElement(textbox_password).submit();
	}
}
