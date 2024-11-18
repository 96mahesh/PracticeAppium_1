package Testperform.practiceAppim;

import org.openqa.selenium.By;
import org.testng.Assert;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class App extends BaseTest{
	
	AndroidDriver driver;

	public App(AndroidDriver driver) {
		this.driver = driver;
	  }
 
	public void loginApp() throws InterruptedException {
    	
    	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
    	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
    	Thread.sleep(2000);
    	driver.findElement(AppiumBy.id("android:id/checkbox")).click();
    	driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
    	String actData = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
    	System.out.println(actData);
    	Assert.assertEquals(actData, "WiFi settings");
    	driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("IQ00 Z3 5G");
    	driver.findElement(By.xpath("(//android.widget.Button)[2]")).click();
    	
    }
}
