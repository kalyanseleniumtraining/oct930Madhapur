package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ObjectIdentificationExample {
	public static void main(String[] args) {
		WebDriver driver = null;
		try {
			driver = new ChromeDriver();
		} catch (IllegalStateException is) {
			System.out.println(is.getMessage());
		}
		try {
			driver.get("http://amazon.in");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
	WebElement amazonSrchBox = driver.findElement(By.id("sklfjasldjflasdjfkl;asdjfjaksd"));

			amazonSrchBox.sendKeys("Mobiles");
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		try {
			WebElement amazonSrchbtn = driver.findElement(By.className("nav-input"));
			amazonSrchbtn.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
