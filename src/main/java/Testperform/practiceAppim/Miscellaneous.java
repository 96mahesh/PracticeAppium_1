package Testperform.practiceAppim;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscellaneous extends BaseTest{
	
	AndroidDriver driver;

	public Miscellaneous(AndroidDriver driver) {
		this.driver = driver;
	  }
 
	public void miscellaneousDemo() throws InterruptedException {
    	
//		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
//		driver.startActivity(activity);
    	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
    	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
    	Thread.sleep(2000);
    	driver.findElement(AppiumBy.id("android:id/checkbox")).click();
    	DeviceRotation landscape = new DeviceRotation(0, 0, 90);
    	driver.rotate(landscape);
    	driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
    	String actData = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
    	System.out.println(actData);
    	Assert.assertEquals(actData, "WiFi settings");
    	//cpoy paste Operations
    	driver.setClipboardText("mahesh Wifi");
    	driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());
    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("(//android.widget.Button)[2]")).click();
    	driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	Thread.sleep(2000);
    	driver.pressKey(new KeyEvent(AndroidKey.HOME));
    	Thread.sleep(2000);
    	
    }
}
