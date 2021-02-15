package mobile.tests.android;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import mobile.functions.generic.MobilePOJO;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

public class MobileObjectDataSet {

		public void setMobileCapabilities(String sDefaultPath,MobilePOJO mobileCapabilities) 
			{
				File f1= new File(sDefaultPath+"/conf/EnvironmentMobile.json");

				FileReader fr= new FileReader(new File(sDefaultPath+"/conf/EnvironmentMobile.json"));
		    
		        JSONParser parser = new JSONParser();
		        try {
		        /*	f1 = new File(sDefaultPath+"\\conf\\EnvironmentMobile.json");
		            fr = new FileReader(new File(sDefaultPath+"\\conf\\EnvironmentMobile.json"));
		       
		            */
		        	Object obj = parser.parse(fr);
		        	JSONObject jsonObject = (JSONObject) obj;
		       
		   
		        	
		        	mobileCapabilities.setStrMobileUrl((String)jsonObject.get("mobileUrl"));
					mobileCapabilities.setStrPlatformName((String) jsonObject.get("PlatFormName"));
					mobileCapabilities.setStrDeviceName((String) jsonObject.get("DeviceName"));
					mobileCapabilities.setStrUDID((String) jsonObject.get("UDID"));
					mobileCapabilities.setStrNewCommandTimeout((String) jsonObject.get("NewCommandTimeout"));
					mobileCapabilities.setStrAppPackage((String) jsonObject.get("AppPackage"));
					mobileCapabilities.setStrPlatformVersion((String) jsonObject.get("PlatFormVersion"));
					mobileCapabilities.setStrAutomationName((String) jsonObject.get("automationName"));
					mobileCapabilities.setStrApp((String) jsonObject.get("appNameIOS"));
				
					mobileCapabilities.setStrAppPackage((String) jsonObject.get("AppPackage1"));

					try {
						
						
						mobileCapabilities.setStrAppActivity1((String) jsonObject.get("AppActivity1"));
						mobileCapabilities.setStrAppActivity((String) jsonObject.get("AppActivity"));
						mobileCapabilities.setStrAppActivity2((String) jsonObject.get("AppActivity2"));
						mobileCapabilities.setStrAppActivity3((String) jsonObject.get("AppActivity3"));
						mobileCapabilities.setStrAppActivity4((String) jsonObject.get("AppActivity4"));
						
						} catch (Exception e) {
						System.out.println("Out of Range");
					}

		        	
		        } finally {
		            try{
		               fr.close();       
		           
		            }catch(IOException ioe)

		            {
		                ioe.printStackTrace();
		            }
		        }

		    }
}
