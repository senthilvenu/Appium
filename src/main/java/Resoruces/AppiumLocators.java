package Resoruces;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class AppiumLocators extends Launch_device {
	
	public static AndroidDriver<WebElement> driver;
	@Test
	public static void appiumLocat() throws MalformedURLException
	{
		driver=deviceLounch();	
		//Click Accessibility Link using ById Locator with using of Resource-id value 	
		driver.findElementById("android:id/text1").click(); 
		//Click Accessibility Node Querying using Xpath with class name values tag and index
    	driver.findElementByXPath("//android.widget.TextView[@index='1']").click();
    	//Getting text by using accessibilityid
    	String tex=driver.findElementByAccessibilityId("Task Take out Trash").getText();
    	System.out.println(tex);
    	//Click button by using of class name values
    	driver.findElementByClassName("android.widget.ImageButton").click();
    	String tex1=driver.findElementByAndroidUIAutomator("new UiSelector().text(\"ClockBack\")").getText();
    	System.out.println(tex1);
		
    	/************** didn't coded for findElementByLink and findElementByPartialLink********/
		
	}

}
