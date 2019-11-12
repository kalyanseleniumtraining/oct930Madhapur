package practice;

import java.time.temporal.WeekFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaterMarkExample {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		
		WebElement popupCloseButton=driver.findElement(By.xpath(".//*[@class='_2AkmmA _29YdH8']"));
		popupCloseButton.click();
		
		WebElement searchBox=driver.findElement(By.className("LM6RPg"));
		String watermarkText=searchBox.getAttribute("title");
		System.out.println(watermarkText);
	}

}
