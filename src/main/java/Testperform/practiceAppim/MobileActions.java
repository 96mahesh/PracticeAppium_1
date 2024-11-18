package Testperform.practiceAppim;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class MobileActions extends BaseTest {
	AndroidDriver driver;
	boolean canScrollMore;
	 public MobileActions(AndroidDriver driver) {
		 this.driver = driver;
	 }
	public void longPressActions(WebElement ele) {
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
				"duration",2000));
	}
	
	public void coordinateClick() {
		
    	//new AndroidTouchAction(driver).tap(PointOption.point(290, 1357)).release().perform();
		 new TouchAction(driver).tap(PointOption.point(290, 1357))
         .release().perform();
	}
	
	public void scrollIngGesture()throws Exception {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		Thread.sleep(3000);
	}
	
	public void scrollingWithOutElement() throws InterruptedException {
		do {
			
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0));	
		}while(canScrollMore);
	}
		
	public void SwipeGuesture(WebElement ele , String Direction) {
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),"direction",Direction,
				"percent",0.75));
	}
	
	public void longPressActionsClass(WebElement ele) {
		
		new Actions(driver).clickAndHold(ele).perform();
	}
	
	public void dragAndDropAction(WebElement a , WebElement b) {
		TouchAction action =new TouchAction(driver);
		action.longPress(PointOption.point(a.getLocation().x, a.getLocation().y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(b.getLocation().x, b.getLocation().y)).release().perform();
	}
	
	public void dargAndDropUsingCoordnator(WebElement ele ,int x , int y) {		
		((JavascriptExecutor) driver).executeScript("mobile"
				+ ": dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "endX", x,
			    "endY", y
			));
		}
	
	public Double getFormatteAmount(String amount) {
		Double price =Double.parseDouble( amount.substring(1));
		return price;
	}
	
//		public void tapActions(WebElement webelement) {
////		TouchAction ta=new TouchAction(driver);
////		ta.tap(TapOptions().withElement(element(webelement))).perform();
////			TouchAction ta=new TouchAction(driver);
////			ta.longPress(longPressOptions().withElement(element(webelement)).withDuration(ofSeconds(4))).release().perform();
//	}
	
	//Actions Class
	
	public void tapactions(WebElement element) {
		AndroidTouchAction action = new AndroidTouchAction(driver);
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
	}
	public void coordinateTapactions(WebElement element) {
		AndroidTouchAction action = new AndroidTouchAction(driver);
		action.tap(PointOption.point(0, 0)).release().perform();
		action.tap(PointOption.point(0, 0)).longPress(PointOption.point(0, 0)).release().perform();
	}
	
	
	
	
  }





