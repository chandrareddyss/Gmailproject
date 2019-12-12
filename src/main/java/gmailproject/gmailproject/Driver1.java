package gmailproject.gmailproject;

import org.openqa.selenium.WebDriver;

public class Driver1 {
	
	public static ThreadLocal<WebDriver> threaddriver=new ThreadLocal<WebDriver>() ;
		public static void set(WebDriver driver) {
			threaddriver.set(driver);
		}
		public static WebDriver get() {
			return threaddriver.get();
		}
	

}
