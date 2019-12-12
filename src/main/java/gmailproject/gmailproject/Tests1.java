package gmailproject.gmailproject;

import org.testng.annotations.Test;

public class Tests1  extends Lunchapplication{
	@Test(groups="regression1")
	public static void test1() {
		System.out.println("execute test1");
	}
	@Test(groups="smoke1")
	public static void test2() {
		System.out.println("execute test2");
	}
	@Test(dependsOnMethods = "test2")
	public static void test3() {
		System.out.println("execute test3");
	}
	@Test(dependsOnGroups ="regression1"  )
	public static void test4() {
		System.out.println("execute test4");
	}
	
	

}
