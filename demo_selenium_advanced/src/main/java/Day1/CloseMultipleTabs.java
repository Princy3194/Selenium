package Day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CloseMultipleTabs {

	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://naukri.com");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 driver.quit();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException {
	 
	 Thread.sleep(2000);
	 String mwid= driver.getWindowHandle();
	 Set<String> allwinds= driver.getWindowHandles();
	 
	 for(String x:allwinds) {
		 if(!x.equals(mwid)) {
			 driver.switchTo().window(x);
			 driver.close();
		 }
	 }
	 
	 driver.switchTo().window(mwid);
	 Thread.sleep(2000);
	 
 }
}
 