package Day1;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cookies {
	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.get("https://www.careerbuilder.co.in/JobSeeker/PostNewResume.aspx");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 //driver.quit();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException, AWTException {
	 
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.careerbuilder.co.in/JobSeeker/PostNewResume.aspx");
	 Cookie cookie= new Cookie("software","Bangalore");
	 driver.manage().addCookie(cookie);
	 Set<Cookie> cookie_set= driver.manage().getCookies();
	 
	 for(Cookie temp:cookie_set)
	 {
		 System.out.println("Name od the cookie :"+temp.getName()+"and its value"+temp.getValue());
	 }
	 
	 
}
}