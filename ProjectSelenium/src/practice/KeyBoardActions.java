package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	
	public static void main(String[] args) throws Exception{
		WebDriver d = new FirefoxDriver();
		d.get("http://amazon.com");
	
		Thread.sleep(10000);
		
		
		Actions act=new Actions(d);
		act
		.keyDown(Keys.LEFT_CONTROL)
		.sendKeys(Keys.F5)
		.keyUp(Keys.LEFT_CONTROL)
		.perform();
		
		
		
		
		
	}

}
