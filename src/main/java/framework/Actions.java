package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Actions {
	public static void scrollDown(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) Data.get();
		jse.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	public static void enterTextAndClick(By by, String text) {
		
		Data.get().findElement(by).sendKeys(text,Keys.ENTER);  
	}
	
	public static void clickButton(By by) {
		Data.get().findElement(by).click();
	}
	
	public static boolean  isDisPlayedElement(By by) {
		boolean bln = Data.get().findElement(by).isDisplayed();
		return bln;
	}
public static void alllinks(By by) {
	List<WebElement> alllinksss = Data.get().findElements(by);
	for (WebElement link : alllinksss) {

		System.out.println("*********************************************************");
		System.out.println("page "  + " are " + link.getText());
	}
}
}

