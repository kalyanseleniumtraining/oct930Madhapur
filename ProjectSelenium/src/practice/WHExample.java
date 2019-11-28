package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WHExample {

	public void closeWindow(WebDriver d,String windowToClose) {
		Set<String> ids = d.getWindowHandles();

		for (String id : ids) {
			d.switchTo().window(id);
			String title=d.getTitle();
			if (title.equals(windowToClose)) {
				d.close();
			}
		}
	}

	public static void main(String[] args) {

		WebDriver d = new FirefoxDriver();
		d.get("http://naukri.com");// 3 windows
		WHExample obj=new WHExample();
		obj.closeWindow(d, "Tech Mahindra");
		obj.closeWindow(d, "LnT");
		obj.closeWindow(d,"Xoriant");

	}

}
