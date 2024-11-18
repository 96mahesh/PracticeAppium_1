package Testperform.practiceAppim;

import org.testng.annotations.Test;

public class EcommerceTestCase_1_Test extends BaseTest {

	@Test
	public void verifyFristTestCase() throws InterruptedException {
		Ecommerce_FrsitTestCase frist = new Ecommerce_FrsitTestCase();
		frist.fillForm();
	}
}
