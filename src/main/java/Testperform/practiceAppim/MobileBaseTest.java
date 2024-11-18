package Testperform.practiceAppim;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileBaseTest {
    public static AppiumDriverLocalService service;
    public static AndroidDriver driver;
	@BeforeClass
	public void setup() throws MalformedURLException{
		getDriver();
	}
	
	public AndroidDriver getDriver() throws MalformedURLException{
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
				withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
    	UiAutomator2Options options = new UiAutomator2Options();
    	options.setDeviceName("mahesh");
    	options.setChromedriverExecutable("C:\\drivers\\chromedriver.exe");
    	options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
    	//options.setCapability("browserName", "chrome");
    	//options.setCapability("noReset", true);
    	options.setCapability("ignoreHiddenApiPolicyError" , true);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
      
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
		//service.stop();
	}
}
