package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentificationExample  {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");

		WebElement amazonSrchBox = driver.findElement(By.id("sklfjasldjflasdjfkl;asdjfjaksd"));

		amazonSrchBox.sendKeys("Mobiles");

		WebElement amazonSrchbtn = driver.findElement(By.className("nav-input"));
		amazonSrchbtn.click();

	}

}
