package Testperform.practiceAppim;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AssignMent extends BaseTest {

	AndroidDriver driver;
	public AssignMent(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public void mobileAssgmMent() throws Exception {
	driver.findElement(AppiumBy.accessibilityId("App")).click();
	driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(AppiumBy.accessibilityId("List dialog")).getText();
	driver.findElement(By.xpath("//android.widget.TextView[1]")).click();
	String verifymsg = driver.findElement(By.id("android:id/message")).getText();
	System.err.println(verifymsg);
	Assert.assertEquals(verifymsg, "You selected: 0 , Command one");
	driver.findElement(AppiumBy.accessibilityId("Progress dialog")).click();
	Thread.sleep(3000);
	driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[3]")).click();
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
	driver.findElement(By.xpath("//android.widget.CheckedTextView[1]")).click();
	driver.findElement(AppiumBy.id("android:id/button1")).click();
	driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
	driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("mahesh babu");
	driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("Rampatruni@123");
	driver.findElement(By.id("android:id/button1")).click();
	
	
	
	
	}
}
