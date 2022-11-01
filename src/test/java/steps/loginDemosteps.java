package steps;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginpage;

public class loginDemosteps {
	 WebDriver driver;
	 loginpage login;
	 
@Given("user has started the brower")
public void user_has_started_the_brower() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
}

@When("user  goes to to the logion page")
public void user_goes_to_to_the_logion_page() {
    driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^enters  valid (.*) and (.*)$")
public void enters_valid_username_and_password(String username, String password) throws InterruptedException {
Thread.sleep(200);
login = new loginpage(driver);
   login.enterusername(username);
   Thread.sleep(200);
   login.enterpassword(password);
}

@When("clicks on button to login")
public void clicks_on_button_to_login() {
	 login = new loginpage(driver);
   driver.findElement(By.id("btnLogin")).submit();
 
}

@Then("user is taken to the home page")
public void user_is_taken_to_the_home_page() {
	
	driver.close();
}

}
