package Testperform.practiceAppim;



import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class AppTest extends BaseTest {

	AndroidDriver driver;
    @Test
   public void verifyAppFunctionality() throws Exception {
       App app = new App(BaseTest.driver);
        app.loginApp();
    }
}
