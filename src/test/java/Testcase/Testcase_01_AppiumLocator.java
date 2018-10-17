package Testcase;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Resoruces.AppiumLocators;
import Resoruces.Launch_device;

public class Testcase_01_AppiumLocator {
	
	@Test	
	public static void appiumLocator() throws MalformedURLException
	{
		//Launch_device mobileopen = new Launch_device();
		Launch_device.deviceLounch();
		//AppiumLocators Loc=new AppiumLocators();
		AppiumLocators.appiumLocat();
		
		
	}

}
