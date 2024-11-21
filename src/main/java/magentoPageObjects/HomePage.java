package magentoPageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.magentoBase;

public class HomePage extends magentoBase {

	public HomePage() {
		super();
	}

	@FindBy(xpath = "(//li/a)[2]")
	private WebElement CreateAnAccount;

	@FindBy(xpath = "(//a//img)[1]")
	private WebElement applogo;

	@FindBy(xpath = "(//div/p)[1]")
	private WebElement demoStoreTXT;

	@FindBy(xpath = "//ul[@id='ui-id-2']/li")
	private List<WebElement> navbarlinks;

	public String verifyHomePage() {
		System.out.println(demoStoreTXT.getText());
//		return demoStoreTXT.getText();
		return normalizeText(demoStoreTXT.getText());
	}
	
	public String normalizeText(String text) {
	    return text.trim().replaceAll("\\s+", " "); // Remove extra spaces and normalize
	}
	
	public String verifyHomePageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public boolean verifyAppLogo() {
		return applogo.isDisplayed();
	}

	public int verifyNavbarlinksSize() {
//		MagentoUtils.waitforNavbarlinkstoVisible();
		return navbarlinks.size();
	}

	public CreateNewCustomerAccountPage clickonCreateAnAccount() {
		CreateAnAccount.click();
		return new CreateNewCustomerAccountPage();
	}

}
