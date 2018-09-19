package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputToBrowser {
	
	WebDriver driver;
	String browser="chrome";

@BeforeMethod
	public void openbrowser() {
	driver= DriverTest.getDriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
}
	@Test
	public void test() throws InterruptedException
	{
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	Thread.sleep(1000);
     WebElement search=	driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));//.sendKeys("Iphone 8");
	//Thread.sleep(1000);
	WebElement searchbutton= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button"));
	//Thread.sleep(3000);	
	
	search.sendKeys("Iphone");
	Thread.sleep(2000);
	searchbutton.click(); 
	Thread.sleep(2000);
	driver.navigate().back();
	search.clear();
	search.sendKeys("Watch");
	searchbutton.click();
	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
		

}


