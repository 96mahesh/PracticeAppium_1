package Testperform.practiceAppim;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Ecommerce_SecoundCase extends BaseTest {

//	AndroidDriver driver;
//	public Ecommerce_FrsitTestCase(AndroidDriver driver) {
//		this.driver = driver;	
//		}

	MobileActions mobile = new MobileActions(BaseTest.driver);
	public void fillForm() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mahesh Babu");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(By.id("com.androidsample.generalstore:id/toolbar_title"), "text", "Cart"));
		List<WebElement> productprice = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		int count = productprice.size();
		double totalsum = 0;
		for(int i=0;i<count;i++) {
			String amountPrice = productprice.get(i).getText();
			double price = mobile.getFormatteAmount(amountPrice);
			System.out.println("Total Price :"+price);
			totalsum = totalsum+price;
		}
		
		String totalPrice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		Double totalamount =mobile.getFormatteAmount(totalPrice);
		System.out.println("Total Price :"+totalamount);
		Assert.assertEquals(totalsum, totalamount,"Test script pass");
     
		WebElement ele = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		//mobile.longPressTouchActions(ele);
		Thread.sleep(5000);
		
		LongPressOptions longpressoption = new LongPressOptions();
		longpressoption.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(ele));
		AndroidTouchAction action = new AndroidTouchAction(driver);
		action.longPress(longpressoption).perform();
		
		String alertmsg = driver.findElement(By.id("com.androidsample.generalstore:id/alertTitle")).getText();
		Assert.assertEquals(alertmsg, "Terms Of Conditions");
		
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(3000);

		
		
		
//		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId()
//				,"duration",2000));
		
		
		// Toast message
//		String toastmasseg = driver.findElement(AppiumBy.xpath("//android.widget.Toast")).getAttribute("name");
//		System.out.println(toastmasseg);
//		Assert.assertEquals(toastmasseg, "Please enter your name");

	}
}
