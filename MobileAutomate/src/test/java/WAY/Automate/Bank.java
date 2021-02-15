package WAY.Automate;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import GUI.DataFunctions2;
import GUI.UtilityFunctions2;

public class Bank {


	static UtilityFunctions2 utils = new UtilityFunctions2();
	static DataFunctions2 data = new DataFunctions2();

	WebDriver driver ;
	static String sDefaultPath;
	@BeforeClass  
	public void setUpBeforeClass1() throws Exception {  

		sDefaultPath = System.getProperty("user.dir");
		sDefaultPath = sDefaultPath.replace("batch", "");
		//  utils.WindowsProcess("IEDriverServer.exe");
		//   utils.WindowsProcess("Chrome.exe");
		//  utils.CloseRunningProcess();
		//  data.GetEnvironmentVariables(sDefaultPath);
		/*      extent = utils.initializeExtentReports(getClass().toString());
			            Runtime.getRuntime().exec("TASKKILL /F /IM Chromedriver.exe"); 
			            Runtime.getRuntime().exec("TASKKILL /F /IM IEDriverServer.exe"); 
			            Runtime.getRuntime().exec("TASKKILL /F /IM iexplore.exe");
		 */

	}


	@Test
	public void test() throws Exception {

		driver =	utils.initializeWedriver("Chrome", sDefaultPath);
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");

		//Wait for  property to be visible 20 seconds max 
		utils.waitforProperty(driver, "BankManagerLogin", 20,sDefaultPath+"//Repository//Bank.xml");
		utils.ClickObject(driver, "BankManagerLogin", sDefaultPath+"//Repository//Bank.xml");

		utils.waitforProperty(driver, "AddCustomer", 20,sDefaultPath+"//Repository//Bank.xml");
		utils.ClickObject(driver, "AddCustomer", sDefaultPath+"//Repository//Bank.xml");

		utils.waitforProperty(driver, "fName", 20,sDefaultPath+"//Repository//Bank.xml");
		utils.EnterText(driver, "fName", "Master",sDefaultPath+"//Repository//Bank.xml");
		utils.EnterText(driver, "lName", "Master",sDefaultPath+"//Repository//Bank.xml");
		utils.EnterText(driver, "postCd", "Master",sDefaultPath+"//Repository//Bank.xml");

		utils.ClickObject(driver, "submitCust", sDefaultPath+"//Repository//Bank.xml");

		//handling alert...
		Alert alert = driver.switchTo().alert();	

		String strAlertMessage = alert.getText();

		if(strAlertMessage.contains("Customer added successfully")) {
			//Customer added Successfully
			alert.accept();
		}else {
			//TODO: report message
		}



		//driver.close();
	}


}
