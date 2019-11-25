package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {
	
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://ebay.com");
		
		WebElement myebay=d.findElement(By.linkText("My eBay"));
		
		Actions act=new Actions(d);
		act.contextClick(myebay).perform();
	}

}
