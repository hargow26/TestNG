package TestPackageTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BussinessLoan {

	@DataProvider
	public static Object[][] getData() {

		Object[][] data = new Object[3][2];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				if (j % 2 == 0) {
					data[i][j] = (i + 1) + " username";
					System.out.println(data[i][j]);
				} else {
					data[i][j] = (i + 1) + " password";
					System.out.println(data[i][j]);
				}

			}
		}

		return data;
	}

	@BeforeMethod
	public void beforeMethod() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside" + methodName);
	}

	@AfterMethod
	public void afterMethod() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside " + methodName);
	}

	@BeforeClass
	public void beforeClass() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside " + methodName);
	}

	@AfterClass
	public void afterClass() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside " + methodName);
	}

	@BeforeTest
	public void beforeTest() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside " + methodName);
	}

	@AfterTest
	public void afterTest() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside " + methodName);
	}

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside " + methodName);
	}

	@AfterSuite
	public void afterSuite() {
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Inside " + methodName);
	}

	@Test(groups = { "Smoke" })
	public void method1() {
		System.out.println("Inside BussinessLoan method1");
	}

//	@Parameters({ "URL" })
	@Test(dataProvider = "getData")
	public void method2( String userName, String password) {
		System.out.println("Inside BussinessLoan method2");
//		System.out.println(URL);
		System.out.println(userName);
		System.out.println(password);
	}

	@Test(dependsOnGroups = { "Smoke" })
	public void method3() {
		System.out.println("Inside BussinessLoan method3");
	}

}
