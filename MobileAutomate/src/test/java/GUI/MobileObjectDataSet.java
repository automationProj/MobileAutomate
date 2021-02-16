package generic.DataStructure;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import generic.ObjectPrep.MobilePOJO;
import gui.Functions.Common;

public class MobileObjectDataSet extends  Common {
	
	public  void  setMobileData(int iRow,String strFileName,String strSheet,MobilePOJO mobiledata)
	{
		try 
		{
			sheet = data.ReadExcelapi(sDefaultPath + "\\data\\Mobile\\"+strFileName,strSheet);
			
			
	
		}
		catch (Exception e)
		{
			System.out.println("setMobileData " + e.getMessage());
		}
			
	}
	
	
	  @SuppressWarnings("resource")
	public void setMobileCapabilities(String sDefaultPath,MobilePOJO mobileCapabilities) throws IOException, ParseException 
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
	       
	        	System.out.println(completeUserPath);
	        	
	        	mobileCapabilities.setStrMobileUrl((String)jsonObject.get("mobileUrl"));
				mobileCapabilities.setStrPlatformName((String) jsonObject.get("PlatFormName"));
				mobileCapabilities.setStrDeviceName((String) jsonObject.get("DeviceName"));
				mobileCapabilities.setStrUDID((String) jsonObject.get("UDID"));
				mobileCapabilities.setStrNewCommandTimeout((String) jsonObject.get("NewCommandTimeout"));
				mobileCapabilities.setStrAppPackage((String) jsonObject.get("AppPackage"));
				mobileCapabilities.setStrPlatformVersion((String) jsonObject.get("PlatFormVersion"));
				mobileCapabilities.setStrAutomationName((String) jsonObject.get("automationName"));
				mobileCapabilities.setStrApp((String) jsonObject.get("appNameIOS"));
				mobileCapabilities.setStrPlatformNameIOS((String) jsonObject.get("platformNameIOS"));
				mobileCapabilities.setStrPlatformVersionIOS((String) jsonObject.get("platformVersionIOS"));
				mobileCapabilities.setStrUDIDiOS((String) jsonObject.get("udidIOS"));
				mobileCapabilities.setStrDeviceNameIOS((String) jsonObject.get("deviceNameIOS"));
				mobileCapabilities.setStrAppPackage((String) jsonObject.get("AppPackage1"));

				try {
					
					
					mobileCapabilities.setStrAppActivity1((String) jsonObject.get("AppActivity1"));
					mobileCapabilities.setStrAppActivity((String) jsonObject.get("AppActivity"));
					mobileCapabilities.setStrAppActivity2((String) jsonObject.get("AppActivity2"));
					mobileCapabilities.setStrAppActivity3((String) jsonObject.get("AppActivity3"));
					mobileCapabilities.setStrAppActivity4((String) jsonObject.get("AppActivity4"));
					
					mobileCapabilities.setStrUsername((String) jsonObject.get("username"));
					
					mobileCapabilities.setStrPassword((String) jsonObject.get("password"));
					mobileCapabilities.setStrAccoutType((String) jsonObject.get("Type"));
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
