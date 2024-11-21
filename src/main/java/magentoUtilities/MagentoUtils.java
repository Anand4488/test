package magentoUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.magentoBase;

public class MagentoUtils extends magentoBase{
	
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));

	public static Duration PAGE_LOAD_TIMEOUT = Duration.ofSeconds(7);
	public static Duration IMPLICIT_WAIT = Duration.ofSeconds(7);
	
	public static void waitforHomepage() {
		wait.until(ExpectedConditions.titleContains("Home Page"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div/p)[1]")));
	}
	
	public static void waitforNavbarlinkstoVisible() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-2']/li")));
	}
	
	public static void waitforclickOnCreateAnAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li/a)[2]")));
	}
	
	public static void waitforclickOnSignOut() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul[@class='header links']/li)[5]")));
	}

}
