package magentoPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.magentoBase;

public class CustomerLogin extends magentoBase{
	
	public CustomerLogin() {
		super();
	}
	
	@FindBy(xpath = "(//li/a)[1]")
	private WebElement signin;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "pass")
	private WebElement pass;
	
	@FindBy(css = "button.action.login.primary")
	private WebElement Login_signIn_btn;
	
	public void signinclick() {
		signin.click();
	}
	
	public void emailInput(String Email) {
		email.sendKeys(Email);
	}
	
	public void passInput(String Pass) {
		pass.sendKeys(Pass);
	}
	
	public void SignIn() {
		Login_signIn_btn.click();
	}
	
	

}
