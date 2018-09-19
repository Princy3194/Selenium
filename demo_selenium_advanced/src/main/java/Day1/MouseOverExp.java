package Day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOverExp {

	
	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.drikpanchang.com/");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 driver.quit();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException {
	 
	 //Thread.sleep(2000);
	 //driver.get("www.drikpanchang.com");
	 WebElement panchang = driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/a"));
	 Actions mouse = new Actions(driver);
	 mouse.moveToElement(panchang).perform();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/div[2]/div[2]/a[4]")).click();
	 Thread.sleep(2000);
	 
 }
}
 

