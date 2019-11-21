package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons");
	List<WebElement> checkbox =driver.findElements(By.xpath(".//input[@type='checkbox']"));
	for(int i=0;i<checkbox.size();i++)
	{
		
	boolean state =checkbox.get(i).isSelected();
	if(state==false)
	checkbox.get(i).click();
	}
	}
	
	

}
