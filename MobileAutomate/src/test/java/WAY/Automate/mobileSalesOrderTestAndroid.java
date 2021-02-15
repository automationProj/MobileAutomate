package WAY.Automate;

import java.net.MalformedURLException;

import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import mobile.functions.application.MSA_ApplicationSpecification;
import mobile.functions.generic.MobileConfig;
  
public class mobileSalesOrderTestAndroid {

	
	@Test
	public void TestMSAAndroid() throws Exception
	{
		try {
			
			localVariable();
			
			 AndroidDriver androidDriver;
			//initialiseFunction( "Mobile_Test", "mobileSalesAppAndroid","Android");
			
			
			//Setting capabilities 
			mobileObjectDataSet.setMobileCapabilities(sDefaultPath, mobileObject);
			


			URL url = new URL("http://localhost:4723/wd/hub");
			androidDriver = new AndroidDriver(url, MobileConfig.setCapabilitiesAndroid(mobileObject));


			objectCreation();
			
			
			msa_ApplicationSpec.loginToMSA(androidDriver, sDefaultPath);

			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void localVariable()
	{
		mobileObject = new MobileObject();
		
		
	}

}
