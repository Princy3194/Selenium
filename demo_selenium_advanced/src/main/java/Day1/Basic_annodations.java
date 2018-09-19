package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic_annodations {

	@Test	
	public void testcase1() throws InterruptedException {
		// step 1: Set the system property
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A07208trng_B4a.04.28\\Desktop\\chromedriver.exe");
		
		//step 2: Launch the browser
		
		WebDriver driver= new ChromeDriver();
		
		//Step: Launch the URL
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

	
}
