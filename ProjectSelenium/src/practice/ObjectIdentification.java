package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		WebElement ebaySrchBtn = driver.findElement(By.name("q"));
		ebaySrchBtn.click();

	}
}
