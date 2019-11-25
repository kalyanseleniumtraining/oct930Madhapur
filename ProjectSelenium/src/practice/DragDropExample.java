package practice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample {

	public static void main(String[] args) {

		WebDriver d = new FirefoxDriver();
		d.get("http://ebay.com");

//		WebElement ele1 = d.findElement(By.id("gh-btn"));
//		WebElement ele2 = d.findElement(By.id("gf-norton"));
//		Actions act = new Actions(d);
//		act.dragAndDrop(ele1, ele2).perform();

		List<WebElement> li = d.findElements(By.tagName("a"));// 100

		for (WebElement ele : li) {
			System.out.println(ele.getText());
		}

	}

}
