package Testperform.practiceAppim;

import org.testng.annotations.Test;

public class MobileBrowserTest extends MobileBaseTest {

	@Test
	public void lanchChrome() throws InterruptedException {
		driver.get("https://www.google.com");
		
	}
}
