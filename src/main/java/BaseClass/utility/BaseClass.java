package BaseClass.utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void BS() {
		System.out.println("Connect with the DB");
	}
	@AfterSuite
	public void AS() {
		System.out.println("Disconnect with the DB");
	}
	@BeforeTest
	public void BT() {
		System.out.println("Open Parallel Exe");
	}
	@AfterTest
	public void AT() {
		System.out.println("Close Parallel Exe");
	}
	@BeforeClass
	public void BC() {
		System.out.println("Open the browser");
	}
	@AfterClass
	public void AC() {
		System.out.println("Close the browser");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("Login");
	}
	@AfterMethod
	public void AM() {
		System.out.println("LogOut");
	}
	public static void main(String[] args) {
		

	}

}
