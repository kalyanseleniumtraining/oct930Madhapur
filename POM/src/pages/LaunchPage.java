package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.OR;

public class LaunchPage {
	@FindBy(id = OR.ebayLnchPgSrchBxObject)
	WebElement ebayLnchPgSrchBxObject;

	@FindBy(id =OR.ebayLnchPgDropDwObject )
	WebElement ebayLnchPgDropDwObject;

	@FindBy(xpath =OR.ebayLnchPgSrchBtnObject )
	WebElement ebayLnchPgSrchBtnObject;

	public void enterTextInToEbaySrchBox(String data) {
		ebayLnchPgSrchBxObject.sendKeys(data);
	}

	public void selectItemFromEbayDropDownBx(String data) {
		Select sel = new Select(ebayLnchPgDropDwObject);
		sel.selectByVisibleText(data);

	}

	public void clickEbaySrchBtn() {
		ebayLnchPgSrchBtnObject.click();
	}

}
