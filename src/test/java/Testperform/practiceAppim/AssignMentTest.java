package Testperform.practiceAppim;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AssignMentTest extends BaseTest{

	AndroidDriver driver;
	
	@Test
	public void demoAssignMent() throws Exception {
	AssignMent assin = new AssignMent(BaseTest.driver);
	assin.mobileAssgmMent();
	}
}
