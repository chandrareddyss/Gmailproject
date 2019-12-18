package framework;



import org.openqa.selenium.WebDriver;

public class Data {
	public static ThreadLocal<WebDriver> thread = new ThreadLocal<WebDriver>();

	public static void set(WebDriver driver) {
		thread.set(driver);
	}

	public static WebDriver get() {
		return thread.get();
	}
}
