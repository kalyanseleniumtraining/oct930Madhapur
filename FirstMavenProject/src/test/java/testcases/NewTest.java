package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driv=new ChromeDriver();
	  driv.get("http://gmail.com");
	  driv.get("http://amazon.in");
  }
}
