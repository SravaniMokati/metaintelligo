package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeModuleTest {
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("+++im the first in this suit+++");
	} 
	@BeforeClass(alwaysRun=true)
	public void Beforeclass() {
		System.out.println("im the first in //HomeModuleTest// thisclass ");
	}
	@Test
	public void searchBuss() {
		System.out.println("this is search bus module");
	}
	@Test(dependsOnMethods= {"NagitiveToCityNameValid"})
	public void NagitiveFromCityNameValid() {
		System.out.println("(this is NagitiveFromCityNameValid)");
	}
	@Test
	public void NagitiveToCityNameValid() {
		System.out.println("(this is NagitiveToCityNameValid)");
		Assert.fail();
	}
	@Test
	public void SucsessfullDeparton() {
		System.out.println("(this is SucsessfullDeparton)");
	}
	@Test
	public void NagitiveDeparton() {
		System.out.println("(this is NagitiveDeparton)");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("[(this is BeforeTest)]");
	}
	@AfterSuite
	public void AfterSuit() {
		System.out.println("+++im the last in this suit+++");
	} 
}
