package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try
		{
		driver.get("google.com");
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("page opened");
	
		}

	}

}