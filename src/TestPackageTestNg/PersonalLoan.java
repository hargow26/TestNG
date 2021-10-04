package TestPackageTestNg;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PersonalLoan {

	@Test(groups= {"Smoke"})
	public void method1() {
		String className = new Object() {
		}.getClass().getEnclosingClass().getName();

		System.out.println("Inside method1 of " + className);
	}

	@Test
	public void method2() {
		String className = new Object() {
		}.getClass().getEnclosingClass().getName();

		System.out.println("Inside method2 of " + className);
	}
	
	@Test(groups= {"Smoke","Regression"},dataProvider = "getData",dataProviderClass = BussinessLoan.class)
	public void method3(String userName, String password) {
		String className = new Object() {
		}.getClass().getEnclosingClass().getName();

		System.out.println("Inside method3 of " + className);
		System.out.println(userName);
		System.out.println(password);
	}

	@BeforeGroups(groups= {"Smoke","Regression"})
	public void beforeSmokeGroup() {
		String className = new Object() {
		}.getClass().getEnclosingClass().getName();

		System.out.println("Inside beforeGroups of " + className);
	}
}
