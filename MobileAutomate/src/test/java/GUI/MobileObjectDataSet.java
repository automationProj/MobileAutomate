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
			
			mobiledata.setStrAccount(data.getCellData("Account",iRow, sheet,null,null, "Excel"));
			
			mobiledata.setStrAddInterim(data.getCellData("AddInterim",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrAddress(data.getCellData("Address",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrChoiceOfNumber(data.getCellData("ChoiceOfNumber",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrChoiceOfPackage(data.getCellData("ChoiceOfPackage",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrCompanyName(data.getCellData("CompanyName",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrCompanyRegistrationNo(data.getCellData("CompanyRegistrationNo",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrCompanyType(data.getCellData("CompanyType",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrContact(data.getCellData("Contact",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrContractType(data.getCellData("ContractType",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrCustomerID(data.getCellData("CustomerID",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrCustomerState(data.getCellData("CustomerState",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrCustomerType(data.getCellData("CustomerType",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrDataType(data.getCellData("DataType",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrDealPackage(data.getCellData("DealPackage",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrDealType(data.getCellData("DealType",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrEmail(data.getCellData("Email",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrFirstName(data.getCellData("FirstName",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrIDType(data.getCellData("IDType",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrJobTitle(data.getCellData("JobTitle",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrMobile(data.getCellData("Mobile",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrPhone(data.getCellData("Phone",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrProductName(data.getCellData("ProductName",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrQuoteNumber(data.getCellData("QuoteNumber",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrRouter(data.getCellData("Router",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrSalesOrderNumber(data.getCellData("SalesOrderNumber",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrScenarios(data.getCellData("Scenarios",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrServicerProvider(data.getCellData("ServicerProvider",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrTitle(data.getCellData("Title",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrUploadSpeed(data.getCellData("UploadSpeed",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrVAS(data.getCellData("VAS",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrCountry(data.getCellData("Country",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrExpireDate(data.getCellData("ExpireDate",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrOneNetBusiness(data.getCellData("OneNetBusiness",iRow, sheet,null,null, "Excel"));
				mobiledata.setStrSubTotal(data.getCellData("Sub_Total_Once_Off_Monthly",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrVat(data.getCellData("VAT_Once_Off_Monthly",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrTotal(data.getCellData("Total_Once_Off_Monthly",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrStaticIP(data.getCellData("StaticIP",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrDevice(data.getCellData("Device",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrDeviceMake(data.getCellData("DeviceMake",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrDeviceModel(data.getCellData("DeviceModel",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrSelectOption(data.getCellData("SelectOption",iRow, sheet,null,null, "Excel"));
			mobiledata.setStrPortOption(data.getCellData("PortOption",iRow, sheet,null,null, "Excel"));
	        mobiledata.setStrDonorAcc(data.getCellData("DonorAcc", iRow, sheet, null, null, "Excel"));

	        mobiledata.setStrDeviceType(data.getCellData("DeviceType", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrMakeType(data.getCellData("Make", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrSpeedType(data.getCellData("Speed", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrStandardLicence(data.getCellData("StandardLicence", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrAdvanceLicence(data.getCellData("AdvanceLicence", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrTMSLicence(data.getCellData("TMSLicence", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrTMSTraining(data.getCellData("TMSTraining", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrOptionalProducts(data.getCellData("OptionalProducts", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrOneNetBusinessLicence(data.getCellData("OneNetBusinessLicence", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrServiceInstallation(data.getCellData("ServiceInstallation", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrMobileApp(data.getCellData("MobileApp", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrReceptionistEnterprise(data.getCellData("ReceptionistEnterprise", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrTableApp(data.getCellData("TableApp", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrCUGUnlimited(data.getCellData("CUGUnlimited", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrReceptionistOffice(data.getCellData("ReceptionistOffice", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrAutoAttendant(data.getCellData("AutoAttendant", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrHuntGoup(data.getCellData("HuntGoup", iRow, sheet, null, null, "Excel"));
	        mobiledata.setStrOneNetConnect(data.getCellData("OneNetConnect", iRow, sheet, null, null, "Excel"));
	       mobiledata.setStrBillingCyclet(data.getCellData("BillingCycle", iRow, sheet, null, null, "Excel"));
		

		
			
	
		}
		catch (Exception e)
		{
			System.out.println("setMobileData " + e.getMessage());
		}
			
	}
	
	/*****************************************************************************
	Function Name: 	GetEnvironmentVariables
	Description:	setting mobile configuration
	Date Created:	06/07/2020
	Author:Sibusiso Dlamini 
	 * @param sDefaultPath 
	******************************************************************************/
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
