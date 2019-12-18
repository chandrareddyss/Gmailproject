package gmailproject.gmailproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	public static WebDriver driver;

	@Test
	public static void gmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("google", Keys.ENTER);

		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='r']"));
		for (WebElement link : alllinks) {
			System.out.println(link.getText());
		}

	
		WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
		scrollDown(next);

		List<WebElement> allpagesss = driver.findElements(By.xpath("//td/child::a"));
		System.out.println(allpagesss.size());
		for (int i = 0; i <= allpagesss.size(); i++) {

			List<WebElement> alllinksss = driver.findElements(By.xpath("//div[@class='r']"));
			for (WebElement link : alllinksss) {
				System.out.println("*********************************************************");
				System.out.println("page " + i + " are " + link.getText());
			}

			

			if (driver.findElement(By.xpath("//*[text()='Next']")).isDisplayed()) {
				driver.findElement(By.xpath("//*[text()='Next']")).click();
			} else {

				System.out.println("plz provide valid");

				break;
			}

		}
	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].scrollIntoView()", element);
	}

}
// WebElement element=
// driver.findElement(By.xpath("//span[@class='S3Uucc' and text()='Google
// Accounts: Sign in']")).click();
// Thread.sleep(3000);
// WebElement element1=driver.findElement(By.xpath("//button[text()='Forgot
// email?']"));
// Actions a=new Actions(driver);
// a.contextClick(element).sendKeys(Keys.ENTER).build().perform();

/*
 * driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
 * Thread.sleep(2000); driver.navigate().back(); Thread.sleep(2000);
 * driver.navigate().back();
 */
//driver.findElements(By.xpath("//span[text()='Next']"));
		// for(int i=0;i<=nextpage.size()-1;i++) {
		// System.out.println(nextpage.size());//
		// }
/*
 * try { if (driver.findElement(By.xpath("//*[text()='Next']")).isDisplayed()) ;
 * driver.findElement(By.xpath("//*[text()='Next']")).click(); } catch
 * (Exception e) { // TODO: handle exception
 * System.out.println("plz provide valid"); }
 */