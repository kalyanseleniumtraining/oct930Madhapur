package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		
		WebElement dropDown=driver.findElement(By.id("gh-cat"));
		Select sel=new Select(dropDown);
		WebElement defaultElement=sel.getFirstSelectedOption();
		String defaultvalue=defaultElement.getText();
		System.out.println(defaultvalue);
		
		
		
		
//		List<WebElement> items=sel.getOptions();
//		for(int i=0;i<items.size();i++)
//		{
//			System.out.println(items.get(i).getText());
//		}
//		
//		
		
		
		
		
		
		
		
//		sel.selectByIndex(4);
		
		
	
	}

}
