package gmailproject.gmailproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Lunchapplication {
	@BeforeSuite
	public static void beforesuite() {
		System.out.println("execute before suite");
	}
	@BeforeTest
	public static void beforetest() {
		System.out.println("execute before test");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("execute before class");
	}
	@BeforeMethod
	public static void beforemethod() {
		System.out.println("execute beforemethod");
	}
	@AfterMethod(alwaysRun = true)
	public static void aftermethod() {
		System.out.println("execute after method");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("execute after class");
	}
	@AfterTest
	public static void aftertest() {
		System.out.println("execute aftertest");
	}
	@AfterSuite
	public static void aftersuite() {
		System.out.println("execute after suite");
	}
	
	
	
	

}
