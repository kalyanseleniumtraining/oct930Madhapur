package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FFPExample {

	public static void main(String[] args) {

		ProfilesIni ini = new ProfilesIni();

		FirefoxProfile fp = ini.getProfile("default");

		WebDriver driver = new FirefoxDriver(fp);

	}

}
