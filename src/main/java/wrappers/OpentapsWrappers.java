package wrappers;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;
import utils.Reporter;

public class OpentapsWrappers extends GenericWrappers {
	
	protected String browserName;
	protected String dataSheetName;
	protected static String testCaseName;
	protected static String testDescription;
	
	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException{
		Reporter.startResult();
		loadObjects();
	}

	 
	@BeforeMethod
	public void beforeMethod(){
		Reporter.startTestCase();
		invokeApp(browserName);
	}
		
	@AfterSuite
	public void afterSuite(){
		Reporter.endResult();
	}

 	
	@AfterMethod
	public void afterMethod(){
		quitBrowser();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}

}
