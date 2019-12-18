package framework;






import org.openqa.selenium.WebElement;


public class Commonmethods  {
	
	public static void testmethod1() {
		Actions.enterTextAndClick(Locators.SeachBoxButton, Locators.GoogleText);
		int count = 0;
		try {
			
			WebElement next1 = Data.get().findElement(Locators.next);
			Actions.scrollDown(next1);
			while (Actions.isDisPlayedElement(Locators.next)) {
				Actions.clickButton(Locators.next);

				count++;
				Actions.alllinks(Locators.links);
				}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("there are no more pages hence loop is stopped***********");
		}
	}
	public static void testmethod2() {
		Actions.enterTextAndClick(Locators.SeachBoxButton,Locators.GoogleText1);
		int count = 0;
		try {
			WebElement next1= Data.get().findElement(Locators.next);
			Actions.scrollDown(next1);
			while (Actions.isDisPlayedElement(Locators.next)) {
				Actions.clickButton(Locators.next);
				count++;
			Actions.alllinks(Locators.links);
				}

		} catch (Exception e) { // TODO: handle exception
			System.out.println("there are no more pages hence loop is stopped***********");
		}
	}
}

