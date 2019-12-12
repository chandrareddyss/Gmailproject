package gmailproject.gmailproject;

import org.testng.annotations.Test;

public class Tests extends Lunchapplication {
	@Test(groups = "smoke")
	public static void method1() {
		System.out.println("execute method1");
	}
	@Test(dependsOnGroups = "smoke")
	public static void method2() {
		System.out.println("execute method2");
	}
	@Test(dependsOnMethods = "method1")
	public static void method3() {
		System.out.println("execute method3");
	}
	@Test//(dependsOnMethods = "method1")
	public static void method4() {
		System.out.println("execute method4");
	}
}
