package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample {
	
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://paytm.com");
		WebElement loginLink=driver.findElement(By.className("_3ac-"));
		loginLink.click();
		Thread.sleep(8000);
		
		
		WebElement frm=driver.findElement(By.tagName("iframe"));
		
		
//		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
//		
//		System.out.println(frames.size());
//		
		
		driver.switchTo().frame(frm);
		
		WebElement ele=driver.findElement(By.xpath(".//*[@class='qrcode-footer-text']/span"));
		ele.click();
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
