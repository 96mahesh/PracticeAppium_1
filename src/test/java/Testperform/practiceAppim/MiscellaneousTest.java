package Testperform.practiceAppim;



import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class MiscellaneousTest extends BaseTest {

	AndroidDriver driver;
    @Test
   public void miscellaneousDemoRotate() throws Exception {
    	Miscellaneous miscellanceous = new Miscellaneous(BaseTest.driver);
    	miscellanceous.miscellaneousDemo();
    }
}
