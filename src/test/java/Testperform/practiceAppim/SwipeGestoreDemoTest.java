package Testperform.practiceAppim;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwipeGestoreDemoTest extends BaseTest {

	AndroidDriver driver;
    @Test
   public void verifyLongClickFunctionality() throws Exception {
    	SwipeGesture swipe = new SwipeGesture(BaseTest.driver);
    	swipe.swipeDemo();
    	Thread.sleep(3000);
    }
}
