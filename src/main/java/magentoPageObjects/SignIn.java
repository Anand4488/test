package magentoPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.magentoBase;

public class SignIn extends magentoBase {

	public SignIn() {
		super();
	}

	@FindBy(xpath = "//div[@role='alert']")
	private WebElement SignInconfirmationMSG;

	@FindBy(xpath = "//div/strong[contains(.,'Account Information')]")
	private WebElement AccInfoTxt;

	@FindBy(xpath = "//span[.='Contact Information']")
	private WebElement contactInfoTxt;

	@FindBy(xpath = "(//div/p)[2]")
	private WebElement contactDetails;

	@FindBy(xpath = "(//li/span)[1]")
	private WebElement welcomeUser;

	@FindBy(xpath = "(//span/button)[1]")
	private WebElement btndrop;

	@FindBy(xpath = "(//ul[@class='header links']/li)[5]")
	private WebElement signOut;

	public CustomerLogin SignOutclick() {
		signOut.click();
		return new CustomerLogin();
	}

	public void SignInbuttondrop() {
		btndrop.click();
	}

	public String SignInConfirmationMSG() {
		System.out.println(SignInconfirmationMSG.getText());
		return SignInconfirmationMSG.getText();
	}

	public String AccInfo() {
		System.out.println(AccInfoTxt.getText());
		return AccInfoTxt.getText();
	}

	public String ContactInfo() {
		System.out.println(contactInfoTxt.getText());
		return contactInfoTxt.getText();
	}

	public boolean contactDetailsVisible() {
		return contactDetails.isDisplayed();
	}

	public String WelcomeUser() {
		System.out.println(welcomeUser.getText());
		return welcomeUser.getText();
	}

	public boolean WelcomeUserVisible() {
		return welcomeUser.isDisplayed();
	}

}
