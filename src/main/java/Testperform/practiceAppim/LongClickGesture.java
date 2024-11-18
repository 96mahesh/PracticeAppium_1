package Testperform.practiceAppim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LongClickGesture extends BaseTest {

	AndroidDriver driver;
	
	public LongClickGesture(AndroidDriver driver) {
		this.driver = driver;
	}
	
	MobileActions mobile = new MobileActions(BaseTest.driver);
	public void longClickGestureActions() throws InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		//Ist Way Of Lang click Gesture
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		mobile.longPressActions(element);
		Thread.sleep(3000);
		String actualText = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "Sample menu");		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']")).click();
		String name = driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(name);
		Assert.assertEquals(name, "People Names: Group 0 clicked");
	
	}
	
	
}
