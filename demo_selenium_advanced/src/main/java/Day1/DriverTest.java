package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DriverTest {


	public static WebDriver getDriver(String browser)  {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\A07208trng_B4a.04.28\\\\Desktop\\\\chromedriver.exe");
			return new ChromeDriver();
			
		}

		else if(browser.equalsIgnoreCase("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\A07208trng_B4a.04.28\\Desktop\\geckodriver.exe");
			return new FirefoxDriver();
	}

		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\A07208trng_B4a.04.28\\Desktop\\IEDriverServer");
			return new InternetExplorerDriver();
	}	
		else
		{
			System.out.println("Imvalid Browser");
			return null;
		}
	}		
}
