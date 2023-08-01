package frame_Acd;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Khan_Frame.Khan_Capability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;



public class Test_Acd extends Khan_Capability  {
        AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void tc_1() throws IOException, InterruptedException {   
		System.out.println("Hello World");
		Thread.sleep(5000);
		driver=test(deviceName, platformName,appPackage,appActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   	 
	}
	
	@Test
	public void tc_2() throws InterruptedException, IOException {
		Thread.sleep(3000);			
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.xpath("//*[@text='Computing']")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Computer science']")).click();
		Thread.sleep(8000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
		
		@Test
		public void tc_3() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(MobileBy.xpath("//*[@text='Cryptography']")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
		Thread.sleep(8000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Information theory']")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Add Bookmark\"])[1]/android.widget.ImageView")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.ImageView")).click();
		driver.findElement(MobileBy.id("android.widget.ImageView")).click();
		driver.findElement(MobileBy.xpath("//android.view.View[@content-desc=\"Bookmarks\"]/android.widget.ImageView")).click();
		driver.findElement(MobileBy.id("android.widget.ImageView")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.AccessibilityId("Bookmarks")).click();
}
		@Test
		public void tc_4() {
//			// verification on add courses in bookmarks
//			 Thread.sleep(5000);
//			 String course_1 = driver.findElements(MobileBy.className("android.widget.TextView")).get(4).getText();
//			 Thread.sleep(3000);
//			        System.out.println(course_1);
//			AndroidElement element = driver.findElement(MobileBy.xpath("(//*[@class='android.widget.TextView'])[5]"));
//			        String actualText = element.getText();
//			        String expectedText = "Ancient cryptography";
//			        Assert.assertEquals(actualText, expectedText, "course-1 name text verification failed.");
//			        Thread.sleep(5000);
//			        String course_2 = driver.findElements(MobileBy.className("android.widget.TextView")).get(7).getText();
//			        Thread.sleep(3000);
//			        System.out.println(course_2);
//			        AndroidElement element2 = driver.findElement(MobileBy.xpath("(//*[@class='android.widget.TextView'])[8]"));
//			        String actualText2 = element2.getText();
//			        String expectedText2 = "Ancient information theory";
//			        Assert.assertEquals(actualText2, expectedText2, "course-2 name text verification failed.");
//			        // printing the details of the bookmarks page
//			        Thread.sleep(5000);
//			        AndroidElement Ad = driver.findElement(MobileBy.className("android.widget.TextView"));
//			        String details = Ad.getText();
//			        System.out.println("Details: " + details);
//			        List<AndroidElement> alldetails = driver.findElements(MobileBy.className("android.widget.TextView"));
//			        int count = alldetails.size();
//			        System.out.println(count);
//			        for (WebElement detailscount : alldetails) 
//			 {
//				  System.out.println(detailscount.getText());
//				        }

			 }
		


}	

