package Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class Example2_testNG {
	
	@BeforeSuite
	public void suitstart() {
		System.out.println("suite start");
	}
	
	@AfterSuite
	public void suitend() {
		System.out.println("suite ends");
	}
	
	@BeforeClass(enabled=true)	
	public void startserver() {
		System.out.println("start server");
	}
	

	@Test(priority=0,enabled=true)
	
	public void testcase1()
	{
		System.out.println("My first case");
	}
	
	@Test
	public void testcase2()
	{
		
		System.out.println("My second case");
	}

	@BeforeMethod
	public void Openbrowser()
	{
		System.out.println("Opening browser");
	}

	
	@AfterMethod
	public void Closebrowser()
	{
		System.out.println("Closing Browser");
	}

}
