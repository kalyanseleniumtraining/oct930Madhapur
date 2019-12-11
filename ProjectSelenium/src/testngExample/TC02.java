package testngExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 {
	@Test(groups = "sanity")
	public void f() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).submit();
		String title = driver.getTitle();
		Assert.assertEquals(title, "India - Google Search");
		
		driver.quit();

	}
}
