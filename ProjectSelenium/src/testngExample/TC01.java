package testngExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC01 {
	@Test
	public void f() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Googleeeee");
		
		
	}
}
