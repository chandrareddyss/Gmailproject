package gmailproject.gmailproject;

import org.testng.annotations.Test;

public class Ttitle extends Baseclass {
	@Test
	public void test1() {
		String titles=Driver1.get().getTitle();
		System.out.println(titles);
		System.out.println("i am in test1");
		
	}
	@Test
	public void test2() {
		String titles1=Driver1.get().getTitle();
		System.out.println(titles1);
		System.out.println("i am in test2");
}
}