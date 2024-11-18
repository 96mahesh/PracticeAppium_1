package Testperform.practiceAppim;

import org.testng.annotations.Test;

public class EcommerceTestCase_3 extends BaseTest {

	@Test
	public void verifyFristTestCase() throws InterruptedException {
		Ecommerce_ThrodTestCase throad = new Ecommerce_ThrodTestCase();
		throad.fillForm();
	}
}
