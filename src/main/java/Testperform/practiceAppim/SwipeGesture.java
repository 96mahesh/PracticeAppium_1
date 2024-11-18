package Testperform.practiceAppim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwipeGesture {

	AndroidDriver driver;
	public SwipeGesture(AndroidDriver driver) {
		this.driver = driver;
	}
	
	MobileActions mobile = new MobileActions(BaseTest.driver);
	public void swipeDemo() throws Exception {
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"true");
	mobile.SwipeGuesture(ele, "left");
	Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"),"false");
	
	}
}
