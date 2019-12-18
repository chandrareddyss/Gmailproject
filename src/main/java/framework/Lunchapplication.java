package framework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Lunchapplication {

	@Parameters({ "ur", "browser" })
	@BeforeMethod
	public void beforemethod(@Optional String url, @Optional String browser) throws InterruptedException {
		url = (url == null) ? "https://google.com" : url;
		browser = (browser == null) ? "chrome" : browser;
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			Data.set(new ChromeDriver());
			/*
			 * ChromeOptions options = new ChromeOptions(); //options.addExtensions(new
			 * File("Path to CRX File")); DesiredCapabilities capabilities = new
			 * DesiredCapabilities(); capabilities.setCapability(ChromeOptions.CAPABILITY,
			 * options);
			 * System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
			 * Data.set(new ChromeDriver(capabilities));
			 */
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "drivers//IEDriverServer.exe");
			Data.set(new InternetExplorerDriver());
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			Data.set(new FirefoxDriver());
			break;
		default:
			System.out.println("plz provide valid browser");
		}
		Data.get().manage().window().maximize();
		Data.get().get(url);
	}

	@AfterMethod
	public static void aftermethod() {
		Data.get().close();
		System.out.println("browser closed");
	}

}
