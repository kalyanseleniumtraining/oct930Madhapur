package practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(f, new File("C:\\Users\\S@f'\\Desktop\\kalyan\\chromebrowser.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// explicit wait declaration
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.findElement(By.id("identifierId")).sendKeys("kalyan");
		driver.findElement(By.xpath(".//*[@class='RveJvd snByac']")).click();

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("abcd");

	}

}
