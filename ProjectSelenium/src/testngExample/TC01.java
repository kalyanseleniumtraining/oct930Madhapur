package testngExample;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.PrePostConditions;

public class TC01 extends PrePostConditions {

	@Test
	public void ts01() {

		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");

	}

}
