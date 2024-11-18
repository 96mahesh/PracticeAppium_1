package Testperform.practiceAppim;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollingGesture extends BaseTest {

	AndroidDriver driver;
	public ScrollingGesture(AndroidDriver driver) {
		this.driver = driver;
	}
	
	MobileActions mobile = new MobileActions(BaseTest.driver);
	public void scrollDemo() throws Exception {
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	//mobile.scrollIngGesture();
	mobile.scrollingWithOutElement();
	}
}
