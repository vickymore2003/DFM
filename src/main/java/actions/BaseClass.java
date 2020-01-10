package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.ReadProperty;
import utilites.StartUpInitilize;

public class BaseClass {
	public static WebDriver driver;

	@BeforeMethod
	@Parameters({ "envName", "browser" })
	public void beforeMethod(String envName, String browser) {
		ReadProperty read = new ReadProperty();
		StartUpInitilize start = new StartUpInitilize();
		start.setEnvName(envName);
		start.setDriver(driver);
		String k = null;
		selectBrowser(browser);
		String url = read.getProp(k);
		driver.get(url);
	}

	public void selectBrowser(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
