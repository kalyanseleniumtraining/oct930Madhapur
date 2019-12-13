package testngExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.PrePostConditions;

public class TC02 extends PrePostConditions {
	@Test
	public void f() {

		
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).submit();
		String title = driver.getTitle();
		Assert.assertEquals(title, "India - Google Search");

		
	}
}
