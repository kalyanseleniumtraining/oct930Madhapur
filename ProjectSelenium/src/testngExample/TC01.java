package testngExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TC01 {
	WebDriver driver=null;
	
	@Test
    public void ts01()
    {
		 driver = new ChromeDriver();
    }
	
	@Parameters("url")
	@Test
    public void ts02(String url)
    {
		driver.get(url);
    }
	
	
	@Parameters("expected")
	@Test
    public void ts03(String expected)
    {
		String title = driver.getTitle();
		Assert.assertEquals(title,expected );
    }
	
	
	@Test
    public void ts04()
    {
		driver.quit();
    }
	
	
	
	
	
	
}
