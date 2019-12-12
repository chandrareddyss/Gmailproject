package gmailproject.gmailproject;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class Baseclass {

@Parameters({"ur","browser"})
@BeforeMethod
public void beforemethod(@Optional String url,@Optional String browser) throws InterruptedException {
	url=(url==null)?"https://fb.com":url;
	browser=(browser==null)?"ie":browser;
	switch (browser.toLowerCase()) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		Driver1.set(new ChromeDriver());
		break;
		case "ie":
			System.setProperty("webdriver.ie.driver","drivers//IEDriverServer.exe");
			Driver1.set(new InternetExplorerDriver());
			break;
		case "firefox":
		    System.setProperty("webdriver.gecko.driver","drivers//geckodriver.exe");
		    Driver1.set(new FirefoxDriver());
		    break;
	default:
		System.out.println("plz provide valid browser");
	}
	Driver1.get().manage().window().maximize();
	Thread.sleep(5000);
	Driver1.get().get(url);
}
    @AfterMethod(alwaysRun = true)
    public void aftermethod() {
    	Driver1.get().close();
    	System.out.println("close browser");
    }

}
