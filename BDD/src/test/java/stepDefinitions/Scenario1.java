package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Scenario1 {
	WebDriver driver;
//	@Given("^I opened the chrome browser$")
//	public void openChrome() throws Throwable {
//		driver=new ChromeDriver();
//		
//	   
//	}
//
//	@When("^I Entered google\\.com in the addressbar$")
//	public void goToGoogle() throws Throwable {
//	  
//		driver.get("http://google.com");
//		
//	}
//
//	
//	@Then("^I Enter India in the search box$")
//	public void i_Enter_India_in_the_search_box() throws Throwable {
//	   driver.findElement(By.name("q")).sendKeys("India");
//	   driver.findElement(By.name("q")).submit();
//	}
//
//	
//	@Then("^I should see \"([^\"]*)\" page$")
//	public void i_should_see_page(String data) throws Throwable {
//	   Assert.assertEquals(driver.getTitle(), data);
//	}

	@Given("^I opened the chrome browser$")
	public void i_opened_the_chrome_browser() throws Throwable {
		driver = new ChromeDriver();
	}

	@When("^I Entered google\\.com in the addressbar$")
	public void i_Entered_google_com_in_the_addressbar() throws Throwable {
		driver.get("http://google.com");
	}

	@Then("^I Enter \"([^\"]*)\" in the search box$")
	public void i_Enter_in_the_search_box(String arg1) throws Throwable {

		driver.findElement(By.name("q")).sendKeys(arg1);
		driver.findElement(By.name("q")).submit();
	}

	@Then("^I should see \"([^\"]*)\" page$")
	public void i_should_see_page(String arg1) throws Throwable {
		Assert.assertEquals(driver.getTitle(), arg1);
	}
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	    driver.quit();
	}

}
