package Day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDrop {
	WebDriver driver;
	String browser="chrome";

 @BeforeMethod
	public void openbrowser() throws IOException {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	SnapShot.getScreenShot(driver,"C:\\Users\\A07208trng_B4a.04.28\\Desktop\\pic.png");
 }

 @AfterMethod
 public void closebrowser() {
	 
	 //driver.quit();
	 
 }
 
 @Test
 public void testcase() throws InterruptedException {
	 
	 //Thread.sleep(2000);
	 
	 WebElement src = driver.findElement(By.xpath("//*[@id=\"treebox1\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr/td[4]/span"));
	 
	 WebElement dest = driver.findElement(By.xpath("//*[@id=\"treebox2\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
	 
	 Actions mouse = new Actions(driver);
	 Thread.sleep(2000);
	 mouse.dragAndDrop(src, dest).perform();
	 Thread.sleep(2000);
	 
	 
 }
}
