package gmailproject.gmailproject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Totallinks {
	public static WebDriver driver;

	@Test
	public static void gmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("software", Keys.ENTER);
		int count=0;
		try {
			WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
			scrollDown(next);
			while (driver.findElement(By.xpath("//*[text()='Next']")).isDisplayed()) {
	
				driver.findElement(By.xpath("//*[text()='Next']")).click();

				count++;
				List<WebElement> alllinksss = driver.findElements(By.xpath("//div[@class='r']"));
				for (WebElement link : alllinksss) {
					
					System.out.println("*********************************************************");
					System.out.println("page "+ count +" are " + link.getText());
				}}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("there are no more pages hence loop is stopped***********");
		}
	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", element);

	}
}