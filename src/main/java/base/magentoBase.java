package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import magentoPageObjects.CreateNewCustomerAccountPage;
import magentoPageObjects.CustomerLogin;
import magentoPageObjects.HomePage;
import magentoPageObjects.SignIn;
import magentoUtilities.MagentoUtils;

public class magentoBase {

	public static HomePage homepage;
	public static CreateNewCustomerAccountPage createNewCusPage;
	public static SignIn signIn;
	public static CustomerLogin customer_login;
	
	public String fname = "viru";
	public String lname = "singh";
	public String email = "viru32@gmail.com";
	public String password = "Qwerty@123";
	public String conf_password = "Qwerty@123";
	

	public static WebDriver driver;
	public static Properties prop;
	public static ChromeOptions op;

	public magentoBase() {

		PageFactory.initElements(driver, this);

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"D:\\SOUL Eclipse Workspace\\Automation_Assesment\\src\\main\\java\\configMagento\\magentoConfig.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeSuite
	public void setup() {
		initialize();
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	@BeforeClass
	public void navigateToCreateNewCustomerAccountPage() {
		homepage = new HomePage();
		createNewCusPage = new CreateNewCustomerAccountPage();
		signIn = new SignIn();
		createNewCusPage = homepage.clickonCreateAnAccount();
		MagentoUtils.waitforclickOnCreateAnAccount();
		signIn = createNewCusPage.clickOnCreateAnAccountButton();
		MagentoUtils.waitforclickOnSignOut();
	}

	public static void initialize() {
		String browserName = prop.getProperty("browser");
		switch (browserName) {
		case "chrome":
//			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "headless mode":
			op = new ChromeOptions();
			op.addArguments("--headless=new");
			driver = new ChromeDriver(op);
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "brave":
			WebDriverManager.chromedriver().setup();
			op = new ChromeOptions();
			op.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(op);
			break;
		default:
			System.out.println("Browser not specified");
			return;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(MagentoUtils.PAGE_LOAD_TIMEOUT);
		driver.manage().timeouts().implicitlyWait(MagentoUtils.IMPLICIT_WAIT);
		driver.get(prop.getProperty("url"));

	}

}
