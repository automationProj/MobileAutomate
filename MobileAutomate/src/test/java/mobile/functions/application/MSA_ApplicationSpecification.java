package mobile.functions.application;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import io.appium.java_client.android.AndroidDriver;

public class MSA_ApplicationSpecification {
	
	 GUI.UtilityFunctionsMobile utilsMob = new GUI.UtilityFunctionsMobile();
	 String strMSAgenericxmlpath = "\\Repository\\mobileRep.xml";
	

	public void loginToMSA(WebDriver driver, String sDefaultPath) {
		try
		{
			
			try {
				utilsMob.waitforProperty(driver, "hometab", 120, sDefaultPath + strMSAgenericxmlpath);
	            
				utilsMob.ClickObject(driver, "hometab", sDefaultPath + strMSAgenericxmlpath);

	        } catch (Exception e) {
	            
	        	System.out.print(e.getMessage());
	 
	           
	        }
		    		
		}
		catch(Exception e)
		{
			Assert.fail();
			System.out.print(e.getMessage()); 	
			driver.quit();

		}
	}



}
