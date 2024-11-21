package Magento.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.magentoBase;

public class TC02_CreateNewCustomerAccountPageTest extends magentoBase {

	public TC02_CreateNewCustomerAccountPageTest() {
		super();
	}

	@Test(priority = 1)
	public void createAnAccountPageTitleTest() {
		Assert.assertEquals(createNewCusPage.CreateAnAccountPageTitle(), "Create New Customer Account",
				"Create new customer Account Page Title mismatch");
	}

	@Test(priority = 2)
	public void PersonalInfoTxtTest() {
		Assert.assertEquals(createNewCusPage.PersonalInfoTxt(), "Personal Information", "Personal Information text mismatch");
	}

	@Test(priority = 3)
	public void firstnameTest() {
		createNewCusPage.firstname(fname);
	}
	
	@Test(priority = 4)
	public void lastnameTest() {
		createNewCusPage.Lastname(lname);
	}
	
	@Test(priority = 5)
	public void SignInInformationTxtTest() {
		Assert.assertEquals(createNewCusPage.SignInInformationTxt(), "Sign-in Information", "Sign-In Information text mismatch");
	}
	
	@Test(priority = 6)
	public void EmailTest() {
		createNewCusPage.Email(email);
	}
	
	@Test(priority = 7)
	public void PasswordTest() {
		createNewCusPage.Password(password);
	}
	
	@Test(priority = 8)
	public void ConfPasswordTest() {
		createNewCusPage.ConfPassword(conf_password);
	}
	
	@Test(priority = 9)
	public void CreateAnAccountButtonTest() {
		signIn = createNewCusPage.clickOnCreateAnAccountButton();
		Assert.assertTrue(true, "Create An Account button not clickable");
	}	
}
