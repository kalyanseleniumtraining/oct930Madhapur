package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalExample {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		
		driver.findElement(By.name("txtJourneyDate")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[2]/tbody/tr"));
		
	outerloop:for(int i=1;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calendar'])[2]/tbody/tr["+i+"]/td"));
			
			
	innerloop:for(int j=1;j<=cols.size();j++)
			{
				WebElement ele=driver.findElement(By.xpath("(.//*[@class='ui-datepicker-calendar'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				
				String date=ele.getText();
				if(date.equals("12"))
				{
					ele.click();
					break outerloop;
				}
			}
		}
		
		
	}

}
