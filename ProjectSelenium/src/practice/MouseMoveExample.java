package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveExample {
	
	public static void main(String[] args) throws Exception{
		WebDriver d = new FirefoxDriver();
		d.get("http://ebay.com");
		
		WebElement myebay=d.findElement(By.linkText("My eBay"));
		
		Actions act=new Actions(d);
		act.moveToElement(myebay).perform();
		Thread.sleep(2000);
		
		WebElement messagesLink=d.findElement(By.linkText("Messages"));
		
		act.click(messagesLink).perform();
	
	}

}
