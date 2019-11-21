package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		List<WebElement> allLinks = 
				driver.findElements(By.tagName("a"));
         int count = 0;
		System.out.println(allLinks.size());
        for (int i = 0; i < allLinks.size(); i++) {
			
			if (!allLinks.get(i).getText().equals("")) {
				System.out.println(allLinks.get(i).getText());
				count = count + 1;
           }

		}
		System.out.println("Total no of links with text are ");
		System.out.println(count);

	}

}
