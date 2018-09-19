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

public class KeyEventWithActions {
	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.get("https://www.facebook.com/");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 //driver.quit();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException, AWTException {
	 
	 //Thread.sleep(2000);
	 
	 driver.get("https://www.facebook.com/");
	 WebElement uname = driver.findElement(By.name("email"));
	 Actions mouse =  new Actions(driver);
	 mouse.moveToElement(uname).click().keyDown(uname,Keys.SHIFT)
	 .sendKeys(uname,"princu")
	 .keyUp(uname,Keys.SHIFT)
	 .doubleClick()
	 .contextClick().build().perform();
	 
	 Thread.sleep(2000);
	 
	 Robot win =new Robot();
	 Thread.sleep(2000);
	 win.keyPress(KeyEvent.VK_DOWN);
	 win.keyPress(KeyEvent.VK_DOWN);	 
	 win.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 
}
}