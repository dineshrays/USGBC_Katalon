import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.Bdd.Stores.StepDef.verfiyEducationPageContents
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import junit.framework.TestListener as TestListener
import reports.Report

import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.relevantcodes.extentreports.ExtentReports as ExtentReports
import com.relevantcodes.extentreports.ExtentTest as ExtentTest
import com.relevantcodes.extentreports.LogStatus as LogStatus

ExtentReports rep = CustomKeywords.'reports.Report.getInstance'('functionaltesting')

ExtentTest test

println(test)

scriptStatus = false

int stepCount = 1

def TestCase = ENV + ' - SampleTestCase'

test = rep.startTest(TestCase)

println(test)

verifyStatus = false

def printStatement = ''

//Open Browser
try
{

WebUI.openBrowser('')
//
WebUI.navigateToUrl("www.google.com")
printStatement="Navigated URL" 

verifyStatus=  WebUI.verifyElementPresent(findTestObject('Object Repository/web api/api-2-issue/Gmailtext'), 3,FailureHandling.OPTIONAL) 
//test.log(LogStatus.INFO, "CareBook Universal Search icon is displayed")
WebUI.verifyMatch(CustomKeywords.'reports.Report.print'(test, verifyStatus, printStatement), "Pass", false, FailureHandling.STOP_ON_FAILURE)
scriptStatus = true



/*	//Login to the Dashboard
	printStatement="tep "+(stepCount++)+": Login into the Dashboard"
	verifyStatus= WebUI.navigateToUrl("www.google.com")CustomKeywords.'application.LoginLogout.Login'(url,userName,password)
	WebUI.verifyMatch(CustomKeywords.'reports.ReportFile.print'(test, verifyStatus, printStatement), "Pass", false, FailureHandling.STOP_ON_FAILURE)
	
	//CareBook Universal Search
	if(WebUI.verifyElementPresent(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_Icon"), 5, FailureHandling.OPTIONAL))
	{
		test.log(LogStatus.INFO, "CareBook Universal Search icon is displayed")
		//lastName 
		WebUI.sendKeys(findTestObject('Object Repository/Application/CareBook/CB_Search_LastName'), patientLastName)
		WebUI.click(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_Icon"))
		printStatement="Step "+(stepCount++)+": Error Message is displayed for LastName search"
		verifyStatus=WebUI.verifyElementPresent(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_LNFNErrorMessage"), 5, FailureHandling.OPTIONAL)
		WebUI.verifyMatch(CustomKeywords.'reports.ReportFile.print'(test, verifyStatus, printStatement), "Pass", false, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_Close"))
		//firstName
		WebUI.clearText(findTestObject("Object Repository/Application/CareBook/CB_Search_LastName"),FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(findTestObject("Object Repository/Application/CareBook/CB_Search_FirstName"), patientFirstName)
		WebUI.click(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_Icon"))
		printStatement="Step "+(stepCount++)+": Error Message is displayed for FirstName search"
		verifyStatus=WebUI.verifyElementPresent(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_LNFNErrorMessage"), 5, FailureHandling.OPTIONAL)
		WebUI.verifyMatch(CustomKeywords.'reports.ReportFile.print'(test, verifyStatus, printStatement), "Pass", false, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_Close"))
	
	// First Name and Last name as input 
		WebUI.delay(2)
		WebUI.clearText(findTestObject("Object Repository/Application/CareBook/CB_Search_FirstName"),FailureHandling.STOP_ON_FAILURE)
		WebUI.sendKeys(findTestObject('Object Repository/Application/CareBook/CB_Search_LastName'), patientLastName)
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject("Object Repository/Application/CareBook/CB_Search_FirstName"), patientFirstName)
		WebUI.click(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_Icon"))
	    printStatement="Step "+(stepCount++)+": Search is Disable without DOB Value "
		verifyStatus=WebUI.verifyElementPresent(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_SearchInDisableMode"), 5, FailureHandling.OPTIONAL)
		WebUI.verifyMatch(CustomKeywords.'reports.ReportFile.print'(test, verifyStatus, printStatement), "Pass", false, FailureHandling.STOP_ON_FAILURE)
		
		//DOB Value
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_DOB'),patientDOB)
		printStatement="Step "+(stepCount++)+": Search is Enabled with Date of Birth"
		verifyStatus=WebUI.verifyElementPresent(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_SearchButtonEnable"), 5, FailureHandling.OPTIONAL)
		WebUI.verifyMatch(CustomKeywords.'reports.ReportFile.print'(test, verifyStatus, printStatement), "Pass", false, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_SearchButtonEnable"))
		// Verify patient details are getting listed 
		printStatemnet="Step "+(stepCount++)+": Verify same community patient displayed in universal search section"
		TestObject patientInUniversalSearchVerification = findTestObject('Base/commanXpath')
		patientInUniversalSearchVerification.findProperty('xpath').setValue("//md-virtual-repeat-container[@id='tbPatientList']/div//following-sibling::div/div/div/div[contains(text(),"+patientLastName+") or contains(text(),"+patientFirstName+")]//following-sibling::div/span")
		verifyStatus=WebUI.verifyElementPresent(patientInUniversalSearchVerification,120,FailureHandling.OPTIONAL)
		WebUI.verifyMatch(CustomKeywords.'reports.ReportFile.print'(test, verifyStatus, printStatemnet), "Pass", false, FailureHandling.STOP_ON_FAILURE)
		
		if(!WebUI.verifyElementPresent(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_CMOrgConsnetErrorMessage"), 0, FailureHandling.OPTIONAL))
		{
			test.log(LogStatus.INFO, "PASS - CM Org Of the patient is getting displayed")
		}else{
		test.log(LogStatus.FAIL, "FAIL - CM Org Of the patient is getting displayed")
		}
		
		WebUI.click(findTestObject("Object Repository/Application/CareBook/CareBookUniversalSearch/CBUS_Close"))
		WebUI.delay(3)
		}else{
	test.log(LogStatus.FAIL, "CareBook Universal Search icon is displayed")
	}
	
	
	//Logout Action
	printStatement="Step "+(stepCount++)+": Logout from Dashboard"
	verifyStatus=CustomKeywords.'application.LoginLogout.Logout'()
	WebUI.verifyMatch(CustomKeywords.'reports.ReportFile.print'(test, verifyStatus, printStatement), "Pass", false, FailureHandling.STOP_ON_FAILURE)

	scriptStatus = true  */
}
catch (Exception e) {
	if (verifyStatus) {
		printStatement = ((printStatement + ' ->**** Exception occured***: ') + e)

		CustomKeywords.'reports.Report.takeScreenshot'(test)
	}
}
finally {
	if (scriptStatus) {
		println('Pass')
		test.log(LogStatus.PASS, TestCase)
		rep.endTest(test)
		rep.flush()
		WebUI.closeBrowser()
	} else {
	 println('Fail')
	
		test.log(LogStatus.FAIL, TestCase)
		rep.endTest(test)
		rep.flush()
		WebUI.closeBrowser()
		WebUI.verifyMatch("Config Verification", 'Config Verification Failed', false, FailureHandling.STOP_ON_FAILURE)
	}
}