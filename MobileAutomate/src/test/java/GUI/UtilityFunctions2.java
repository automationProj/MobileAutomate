package GUI;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

//import junit.framework.Assert;

public class UtilityFunctions2 {
	
	public WebDriver initializeWedriver(String sdriverName, String sDefaultPath)
	{
		WebDriver driver = null;
		try
			
		{

			 switch (sdriverName.toUpperCase())
			  {
				  case "CHROME":
					  System.setProperty("webdriver.chrome.driver", sDefaultPath+"\\drivers\\ChromeDriver.exe");
					  driver = new ChromeDriver();
					  break;
				  
				  case "FIREFOX":
					  System.setProperty("webdriver.gecko.driver", sDefaultPath+"\\drivers\\geckodriver.exe");
					  driver = new FirefoxDriver();
				      break;
				      
				  case "IE":
					  System.setProperty("webdriver.ie.driver", sDefaultPath+"\\drivers\\IEDriverServer.exe");
					  driver = new InternetExplorerDriver();
					  driver.manage().window().maximize();
					 
				      break;
			  }
			 
		}catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		return driver;
		
	}
	
	
	/*****************************************************************************
	Function Name: 	ClickObject
	Description:	click an object in an application using either xpath, ID, Name, linktext and CssSelector and maximum wait time
	Date Created:	13/09/2017
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	******************************************************************************/	
    public void ClickObject(WebDriver driver, String property, String path) throws SAXException, IOException, ParserConfigurationException
	{
    	//get object properties from the xml file repository
		String[] element = xmlParser(path, property);
		switch (element[0].toUpperCase())
		  {
			  case "XPATH":
				  driver.findElement(By.xpath(element[1])).click();	
				  break;
			  
			  case "ID":
				  driver.findElement(By.id(element[1])).click();
				  break;
				  
			  case "NAME":
				  driver.findElement(By.name(element[1])).click();	
				  break;
					
			  case "LINKTEXT":
				  driver.findElement(By.linkText(element[1])).click();
				  break;
				  
			  case "CSSSELECTOR":
				  driver.findElement(By.cssSelector(element[1])).click();
				  break;
			
		  }
		
		
	}
    
    
    
	public void EnterText(WebDriver driver, String property, String sText,String path) throws SAXException, IOException, ParserConfigurationException
	{
		//get object properties from the xml file repository
		String[] element = xmlParser(path, property);
		switch (element[0].toUpperCase())
		  {
			  case "XPATH":
				  driver.findElement(By.xpath(element[1])).sendKeys(sText);
				  break;
			  
			  case "ID":
				  driver.findElement(By.id(element[1])).sendKeys(sText);	
				  break;
				  
			  case "NAME":
				  driver.findElement(By.name(element[1])).sendKeys(sText);
				  break;
					
			  case "LINKTEXT":
				  driver.findElement(By.linkText(element[1])).sendKeys(sText);	
				  break;
				  
			  case "CSSSELECTOR":
				  driver.findElement(By.cssSelector(element[1])).sendKeys(sText);	
				  break;
		  }
					
						
	}
	
	
	/*****************************************************************************
	Function Name: 	waitforProperty
	Description:	wait for the property to appear using either xpath, ID, Name, linktext and CssSelector and maximum wait time
	Date Created:	13/09/2017
	******************************************************************************/		
	public void waitforProperty(WebDriver driver, String property, int sWait, String path) throws SAXException, IOException, ParserConfigurationException
	{
		WebDriverWait wait = new WebDriverWait(driver,sWait);
		//get object properties from the xml file repository
		String[] element = xmlParser(path, property);
		switch (element[0].toUpperCase())
		  {
			  case "XPATH":
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element[1])));
				  break;
			  
			  case "ID":
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element[1])));
				  break;
				  
			  case "NAME":
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(element[1])));
				  break;
					
			  case "LINKTEXT":
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(element[1])));
				  break;
				  
			  case "CSSSELECTOR":
				  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element[1])));
				  break;
			
		  }	
						
	}

	
	
	  public String[] xmlParser(String xmlPath, String tagName) throws SAXException, IOException, ParserConfigurationException {
			// File fXmlFile = new File();
			//InputStream requestContent = new InputStr();
			//String sLine = outputData;
	        //requestContent.append(sLine);
			//String element = null;
			String[] element2 = new String[2];
			File fXmlFile = new File(xmlPath);
			DocumentBuilderFactory dbFactory =
			DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder =
			dbFactory.newDocumentBuilder();
			
		try{
			Document doc = dBuilder.parse(fXmlFile);
			
			/*InputSource is = new InputSource(new
			StringReader(outputData));
			org.w3c.dom.Document doc = dBuilder.parse(is);*/

			
			doc.getDocumentElement().normalize();

		//	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName(tagName);
			

				for (int temp = 0; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);

					//System.out.println("\nCurrent Element :" + nNode.getNodeName());

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;
						
						
						   
							String element = eElement.getElementsByTagName("identifier").item(0).getTextContent();
							String element1 = eElement.getElementsByTagName("Element").item(0).getTextContent();
							element2[0] = element;
							element2[1] = element1;
						
		
					

			
				} // end if
			} // end for loop
			
		} catch (Exception e) {
			Assert.fail("Something went wrong: " +e.getMessage());
			System.out.print(e.getMessage());
		}	
			
			
			return element2;
		} // end function
	    
}
