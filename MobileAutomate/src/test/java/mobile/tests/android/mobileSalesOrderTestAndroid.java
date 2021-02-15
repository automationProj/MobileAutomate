package mobile.tests.android;

import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URL;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import mobile.functions.application.MSA_ApplicationSpecification;
import mobile.functions.generic.MobileConfig;
import mobile.functions.generic.MobilePOJO;
  
public class mobileSalesOrderTestAndroid {

	
	@Test
	public void TestMSAAndroid() throws Exception ,ParseException
	{
		try {
			
			localVariable();
			
			
			WebDriver driver ;
			String sDefaultPath;
			

				sDefaultPath = System.getProperty("user.dir");
				sDefaultPath = sDefaultPath.replace("batch", "");
					
			MobileObjectDataSet mobileObjectDataSet = new MobileObjectDataSet();
			
			 AndroidDriver androidDriver;
		
			 MobilePOJO mobileObject = new MobilePOJO();
			 MSA_ApplicationSpecification msa_ApplicationSpec  = new MSA_ApplicationSpecification();
				
			//Setting capabilities 
			mobileObjectDataSet.setMobileCapabilities(sDefaultPath, mobileObject);
			

			URL url = new URL("http://localhost:4723/wd/hub");
			androidDriver = new AndroidDriver(url, MobileConfig.setCapabilitiesAndroid(mobileObject));

			
			
			msa_ApplicationSpec.loginToMSA(androidDriver, sDefaultPath);

			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void localVariable()
	{
		//MobilePOJO mobileObject = new MobilePOJO();
		//MSA_ApplicationSpecification msa_ApplicationSpec  = new MSA_ApplicationSpecification();
		
		
		
	}

}
