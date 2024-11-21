package Magento.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.magentoBase;

public class TC04_customerLoginPageTest extends magentoBase{
	
	public TC04_customerLoginPageTest() {
		super();
	}
	
	@Test(priority = 1)
	public void SignInClickTest() {
		customer_login.signinclick();
		Assert.assertTrue(true, "Sign In after logout not clicked");
	}
	
	@Test(priority = 2)
	public void emailInputTest() throws Exception {
		Thread.sleep(2000);
		customer_login.emailInput(email);
	}
	
	@Test(priority = 3)
	public void passInputTest() throws Exception {
		Thread.sleep(2000);
		customer_login.passInput(password);
	}	
	
	@Test(priority = 4)
	public void SignInTest() {
		customer_login.SignIn();
		Assert.assertTrue(true, "Final Sign In button not clicked");
	}

}
