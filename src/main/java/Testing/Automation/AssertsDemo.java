package Testing.Automation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsDemo {
	
	
	@Test
	public void softAssert(){
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
		softAssertion.assertAll();
	}
	
	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
		System.out.println("m2");
	}
	@Test
	public void m1() {
		System.out.println("m1");
	}
	@Test
	public void m2() {
		System.out.println("m1");
	
 }
	@Test
	public void m3() {
		System.out.println("m1");
}
}