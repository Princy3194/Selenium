package Day1;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HubNode {

	WebDriver driver;
	String browser="chrome";
	String nodeURL;

 @BeforeMethod
	public void openbrowser() throws MalformedURLException {
	 
	    nodeURL="http://10.250.91.78:5566/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL),caps);
	}
	
	@Test
	public void testcase() {

		driver.get("https://google.com");
		
	} 
	

}
