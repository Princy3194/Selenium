package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertClass {
	

	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 driver.close();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException {
	driver.findElement(By.name("proceed")).click();
	
	Alert a= driver.switchTo().alert();
	Thread.sleep(2000);
	String alertmsg= a.getText();
	System.out.println(alertmsg);
	Thread.sleep(2000);
	a.accept();
	//a.dismiss();
	Thread.sleep(2000);
	driver.findElement(By.id("login1")).sendKeys("Princy");
	Thread.sleep(2000);
	
 }
}
