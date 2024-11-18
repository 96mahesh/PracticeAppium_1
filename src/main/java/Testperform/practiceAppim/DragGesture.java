package Testperform.practiceAppim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class DragGesture {

	AndroidDriver driver;
	public DragGesture(AndroidDriver driver) {
		this.driver = driver;
	}
	
	MobileActions mobile = new MobileActions(BaseTest.driver);
	public void dragDemo() throws Exception {
		
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	WebElement source = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	WebElement target = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
	mobile.dragAndDropAction(source, target);
//	mobile.dargAndDropUsingCoordnator(source,651,586);
	String resultText = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
	System.out.println(resultText);
	Assert.assertEquals(resultText, "Dropped!");
	
	}
}
