package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
//		WebElement email=driver.findElement(By.name("identifier"));
//		email.sendKeys("fhdsajfhjadsfhjasld");
		WebElement nextButton=driver.findElement(By.xpath(".//*[@class='RveJvd snByac']"));
		nextButton.click();
		
		Thread.sleep(2000);
		
		WebElement errorMessage=driver.findElement(By.xpath(".//*[@name='identifier']//following::div[7]"));
		
		
		System.out.println(errorMessage.getText());
		
		
		
		
		
		
	}

}
