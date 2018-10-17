package Resoruces;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launch_device {
	
public static AndroidDriver<WebElement> driver;

public static AndroidDriver<WebElement> deviceLounch() throws MalformedURLException
{
	
	File f= new File("C:\\Users\\siva\\eclipse-workspace\\Appium\\src\\main\\ApiDemos-debug.apk");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.244.101:5555");
	cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
	 driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	return driver;
	
}
}