package Testperform.practiceAppim;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class DragGestoreDemoTest extends BaseTest {

	AndroidDriver driver;
    @Test
   public void verifyLongClickFunctionality() throws Exception {
    	DragGesture drag = new DragGesture(BaseTest.driver);
    	drag.dragDemo();
    	Thread.sleep(3000);
    }
}
