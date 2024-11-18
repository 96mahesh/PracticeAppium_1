package Testperform.practiceAppim;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class scrollingGestoreDemoTest extends BaseTest {

	AndroidDriver driver;
    @Test
   public void verifyLongClickFunctionality() throws Exception {
    	ScrollingGesture scroll = new ScrollingGesture(BaseTest.driver);
    	scroll.scrollDemo();
    	Thread.sleep(3000);
    }
}
