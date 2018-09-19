package Day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameExample {
	

	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.goibibo.com");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 driver.close();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
	WebElement frameid= driver.findElement(By.id("authiframe"));
	driver.switchTo().frame(frameid);
	driver.findElement(By.id("authMobile")).sendKeys("6428401");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[@id=\"authOverlay\"]/div/a")).click();
	Thread.sleep(2000);
	
 }
}
