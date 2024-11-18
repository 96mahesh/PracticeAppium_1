package Testperform.practiceAppim;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LonPressGestureTest extends BaseTest {

	AndroidDriver driver;
    @Test
   public void verifyLongClickFunctionality() throws Exception {
    	LongClickGesture longclick = new LongClickGesture(BaseTest.driver);
    	longclick.longClickGestureActions();
    }
}
