package testcases;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LaunchPage;

public class TC01 {
	@Test
	public void f() throws Exception {

		XSSFWorkbook wb = new XSSFWorkbook("TestDtFile.xlsx");
		XSSFSheet sh = wb.getSheet("Data");
		int rowCount = sh.getPhysicalNumberOfRows();
		for (int i = 1; i < rowCount; i++) {
			
			String searchValue=sh.getRow(i).getCell(0).getStringCellValue();
			String dropDownValue=sh.getRow(i).getCell(1).getStringCellValue();
			String execute=sh.getRow(i).getCell(2).getStringCellValue();

			if(execute.equals("YES"))
			{
				WebDriver driver = new ChromeDriver();
				driver.get("http://ebay.com");
				driver.manage().window().maximize();
				LaunchPage lp = PageFactory.initElements(driver, LaunchPage.class);
				lp.enterTextInToEbaySrchBox(searchValue);
				lp.selectItemFromEbayDropDownBx(dropDownValue);
				lp.clickEbaySrchBtn();
				driver.quit();
			}
			
			
			
		}

		

	}
}
