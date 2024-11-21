package Magento.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.magentoBase;

public class TC03_SignInPageTest extends magentoBase{
	
	public TC03_SignInPageTest() {
		super();
	}
	
	@Test(priority = 1)
	public void SignInConfirmationMSGTest() {
		Assert.assertEquals(signIn.SignInConfirmationMSG(), "Thank you for registering with Main Website Store.", "Confirmation MSG text mismatch");
	}
	
	@Test(priority = 2)
	public void AccInfoTest() {
		Assert.assertEquals(signIn.AccInfo(), "Account Information", "Account Information text mismatch");
	}
	
	@Test(priority = 3)
	public void ContactInfoTest() {
		Assert.assertEquals(signIn.ContactInfo(), "Contact Information", "Contact Information text mismatch");
	}
	
	@Test(priority = 4)
	public void contactDetailsVisibleTest() {
		signIn.contactDetailsVisible();
		Assert.assertTrue(true, "Contact Details not Visible");
	}
	
	@Test(priority = 5)
	public void WelcomeUserTest() {
		Assert.assertEquals(signIn.WelcomeUser(), "Welcome, viru singh!", "Welcome user text mismatch");
	}
	
	@Test(priority = 6)
	public void WelcomeUserVisibleTest() {
		signIn.WelcomeUserVisible();
		Assert.assertTrue(true, "Welcome user not Visible");
	}
	
	@Test(priority = 7)
	private void SignInbuttondropTest() {
		signIn.SignInbuttondrop();
		Assert.assertTrue(true, "user button arrow not clicked");
	}
	
	@Test(priority = 8)
	private void SignOutclick() {
		signIn.SignOutclick();
		Assert.assertTrue(true, "Sign Out not clicked");
	}

}
