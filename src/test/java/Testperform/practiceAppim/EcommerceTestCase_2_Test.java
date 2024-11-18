package Testperform.practiceAppim;

import org.testng.annotations.Test;

public class EcommerceTestCase_2_Test extends BaseTest {

	@Test
	public void verifyFristTestCase() throws InterruptedException {
		Ecommerce_SecoundCase secound = new Ecommerce_SecoundCase();
		secound.fillForm();
	}
}
