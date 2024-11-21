package Magento.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.magentoBase;

public class TC01_HomePageTest extends magentoBase {

	String ExpTxt = "This is a demo store to test your test automaiton scripts. No orders will be fulfilled. If you are facing any issue, email us at hello@softwaretestingboard.com.";

	public TC01_HomePageTest() {
		super();
	}

	@Test(priority = 2)
	public void HomePageTest() {
		String actualTxt = homepage.verifyHomePage();
		homepage.normalizeText(ExpTxt);
		Assert.assertEquals(actualTxt, ExpTxt, "Home Page mismatch");
	}

	@Test(priority = 1)
	public void HomePageTitleTest() {
		Assert.assertEquals(homepage.verifyHomePageTitle(), "Home Page", "Home Page Title mismatch");
	}

	@Test(priority = 3)
	public void ApplogoTest() {
		homepage.verifyAppLogo();
		Assert.assertTrue(true, "Application Logo not Visible");
	}

	@Test(priority = 4)
	public void NavBarlinksCountTest() {
		Assert.assertEquals(homepage.verifyNavbarlinksSize(), 6, "count of Navbar links not matched");
	}

	@Test(priority = 5, dependsOnMethods = {"HomePageTitleTest"})
	public void CreateanAccountClickTest() {
		createNewCusPage = homepage.clickonCreateAnAccount();
		Assert.assertTrue(true, "Create An Account not clicked");
	}

}
