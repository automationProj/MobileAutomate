package mobile.functions.generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class MobileConfig {



	public DesiredCapabilities setCapabilitiesAndroid(String strAppiumVersion, String strAutomationName, String strPlatformName, String strPlatformVersion, String strDeviceName, String strudid, String strPackage, String strActivity)
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, strAppiumVersion);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, strAutomationName);
	   //capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, strPlatformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, strPlatformVersion);
		capabilities.setCapability("deviceName", strDeviceName);
		capabilities.setCapability("udid", strudid);
		capabilities.setCapability("appPackage", strPackage);
		capabilities.setCapability("appActivity", strActivity);
		capabilities.setCapability("appPackage1", strPackage);
		capabilities.setCapability("appActivity2", strActivity);
		return capabilities;
	}
	public DesiredCapabilities setCapabilitiesKobiton(String strSessionName, String strDescription, String strPlatformName, String strPlatformVersion, String strDeviceName, String strDeviceOrientation, String strCaptureScreenshot, String strBrowserName, String strDeviceGroup)
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("sessionName", strSessionName);
		capabilities.setCapability("sessionDescription", strDescription); 
		capabilities.setCapability("deviceOrientation", strDeviceOrientation);  
		capabilities.setCapability("captureScreenshots", strCaptureScreenshot); 
		capabilities.setCapability("browserName", strBrowserName); 
		capabilities.setCapability("deviceGroup", strDeviceGroup); 
		capabilities.setCapability("deviceName", strDeviceName);
		capabilities.setCapability("platformVersion", strPlatformVersion);
		capabilities.setCapability("platformName", strPlatformName); 
		return capabilities;
	}

	public static  DesiredCapabilities setCapabilitiesAndroid(MobilePOJO mobileCapabilities) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		 //capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, strPlatformName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, mobileCapabilities.getStrPlatformVersion());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, mobileCapabilities.getStrDeviceName());
		capabilities.setCapability(MobileCapabilityType.UDID, mobileCapabilities.getStrUDID());
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,300000);

		capabilities.setCapability("appPackage", mobileCapabilities.getStrAppPackage());
		
		capabilities.setCapability("appActivity", mobileCapabilities.getStrAppActivity1());
		
		capabilities.setCapability("autoGrantPermissions","true");
		capabilities.setCapability("autoAcceptAlerts", true);

		return capabilities;


	}
	
	
}
