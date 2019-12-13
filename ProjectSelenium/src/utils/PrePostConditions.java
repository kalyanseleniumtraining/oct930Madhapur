package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PrePostConditions {
	 public static WebDriver driver=null;
 
  @BeforeTest
  public void setUp() {
	   driver=new FirefoxDriver();
	  driver.get("http://google.com");
  }

  @AfterTest
  public void tearDown() {
	  driver.quit();
  }

}
