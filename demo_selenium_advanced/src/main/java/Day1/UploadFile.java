package Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class UploadFile {
	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.careerbuilder.co.in/JobSeeker/PostNewResume.aspx");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 //driver.quit();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException, AWTException {
	 
	 //Thread.sleep(2000);
	 
	// driver.get("https://www.facebook.com/");
	 WebElement file = driver.findElement(By.xpath("//*[@id=\"ucResumeUpload_newFileUpload_inputResumeUpload\"]"));
	 file.sendKeys("C:\\Users\\A07208trng_B4a.04.28\\Desktop\\princy.txt");
	 
}
}