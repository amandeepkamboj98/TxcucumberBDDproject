package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class Googlesearchsteps {

	 WebDriver driver;
	 
@Given("brower is open")
public void brower_is_open() {
   System.out.println("Inside brower is open");
   
   WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
}

@When("user navigates to google home page")
public void user_navigates_to_google_home_page() {
	 System.out.println("Inside user navigates to google home page");
  driver.get("https://google.com");
}

@When("enters text in searchbox")
public void enters_text_in_searchbox() {
	 System.out.println("Inside enters text in searchbox");
  driver.findElement(By.name("q")).sendKeys("Selenium");
}

@When("clicks on search button or hits enter")
public void clicks_on_search_button_or_hits_enter() {
	 System.out.println("Inside clicks on search button on hits enter");
	 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}

@Then("search result page is displayed")
public void search_result_page_is_displayed() {
	 System.out.println("Inside search result page is displayed");
	 driver.getPageSource().contains("Cucumber (software) - Wikipedia");
	 
  String title= driver.getTitle();
  System.out.println("title of the page is: "+title);
  if(title.equals("Selenium - Google Search")) {
	  System.out.println("user is on the result page");
  }
	  driver.close();
}

}
