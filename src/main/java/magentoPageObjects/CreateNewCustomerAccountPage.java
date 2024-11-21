package magentoPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.magentoBase;

public class CreateNewCustomerAccountPage extends magentoBase {

	public CreateNewCustomerAccountPage() {
		super();
	}
	
	@FindBy(css = "span.base")
	private WebElement createnewAccPageTitle;
	
	@FindBy(xpath = "(//legend/span)[1]")
	private WebElement personalInfo;
	
	@FindBy(id = "firstname")
	private WebElement Firstname;
	
	@FindBy(id = "lastname")
	private WebElement Lastname;
	
	@FindBy(xpath = "(//legend/span)[2]")
	private WebElement singinInfo;
	
	@FindBy(id = "email_address")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "password-confirmation")
	private WebElement Confirmpass;
	
	@FindBy(css = "button.action.submit.primary")
	private WebElement createAnAccount_Btn;
	
	public String CreateAnAccountPageTitle () {
		return createnewAccPageTitle.getText();
	}
	
	public String PersonalInfoTxt() {
		return personalInfo.getText();
	}
	
	public void firstname(String fname) {
		Firstname.sendKeys(fname);
	}
	
	public void Lastname(String lname) {
		Lastname.sendKeys(lname);
	}
	
	public String SignInInformationTxt() {
		return singinInfo.getText();
	}
	
	public void Email(String Email) {
		email.sendKeys(Email);
	}
	
	public void Password(String Pass) {
		pass.sendKeys(Pass);
	}
	
	public void ConfPassword(String ConfPass) {
		Confirmpass.sendKeys(ConfPass);
	}
	
	public SignIn clickOnCreateAnAccountButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", createAnAccount_Btn);
		createAnAccount_Btn.click();
		return new SignIn();
	}
	
}
