package com.Bdd.Stores.StepDef
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class verifyAppPageContents {

	@Given("User is to navigate to USGBC website")
	def GivenUserIsToNavigateToUSGBCWebsite() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://new.usgbc.org/')
	}


	@Given("User can see the Store link to navigate to the Store page")
	def GivenUserCanSeeTheStoreLinkToNavigateToTheStorePage() {
		try {

			boolean myResult =  WebUI.verifyElementPresent(findTestObject('Page_USGBC homepage  USGBC/a_Store'),20)

			
			if(myResult) {
				println "Store is found"
			}
			else {
				println "Store Link not found"
			}
		}
		catch (Exception ex) {
			println("Store Link not Found");
		}
	}

	@When("Click on the Store link")
	def WhenClickOnTheStoreLink() {
		try {
			WebUI.click(findTestObject('Page_USGBC homepage  USGBC/a_Store'))
			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the Store page with all the contents")
	def ThenUserCanSeeTheStorePageWithAllTheContents() {

		//WebUI.verifyImagePresent(findTestObject('Page_Store  U.S. Green Building Cou/img'));
	}


	//-----------------------------------Scenario- 1-------------------------------------------------------------


	@Given("User can see the APPS Image link to navigate to the APPS page")
	def UsercanseetheAPPSImagelinktonavigatetotheAPPSpage() {


		//WebUI.verifyImagePresent(findTestObject('Page_Store  U.S. Green Building Cou/img'));

	}

	@When("Click on the APPS Image link")
	def ClickontheAPPSImagelink() {
		try {
			WebUI.click(findTestObject('Object Repository/Apps/Apps_Folder/Page_Store  U.S. Green Building Cou/img'))
			//WebUI.click(findTestObject('Page_Store  U.S. Green Building Cou/img'))
			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
		
		//WebUI.click(findTestObject('Page_Store  U.S. Green Building Cou/img'))
	}

	@Then("User can see the APPS page with all the product which is present in APPS")
	def UsercanseetheAPPSpagewithalltheproductwhichispresentinAPPS() {

		//WebUI.verifyElementPresent(findTestObject('Object Repository/Apps_Folder/Page_U.S. Green Building Council/div_.jumbo-search-field border'))

	}


	@Then("User can see the  APPS filter checked by Default in the Filters Category list")
	def UsercanseetheAPPSfiltercheckedbyDefaultintheFiltersCategorylist() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Apps_Folder/Page_U.S. Green Building Council/span_Apps_checked'))


	}

	@Then("User can see the Search bar to search products")
	def UsercanseetheSearchbartosearchproducts() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Apps_Folder/Page_U.S. Green Building Council/div_Store products_jumbo-searc'))
	}


	@Then("User can see the Filters")
	def UsercanseetheFilters() {

		boolean myResult = WebUI.verifyElementPresent(findTestObject('Object Repository/Apps_Folder/Page_U.S. Green Building Council/div_Categories AppsEducationEx'))

	}
	
//-----------------------------------Scenario- 2-------------------------------------------------------------

	@Given("user can see the search bar to search for products")
	def usercanseethesearchbartosearchforproducts() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/AppsContentVerify/Page_U.S. Green Building Council/input_Store products_title'), 0)

	}


	@When("user give (.*) in search bar to search")
	def  usergiveinputinsearchbartosearch(String input) {

		WebUI.setText(findTestObject('Object Repository/Apps/AppsContentVerify/Page_U.S. Green Building Council/input_Store products_title'), input)
	}

	@When("user click on the search image")
	def  userclickonthesearchimage() {

		WebUI.click(findTestObject('Object Repository/Apps/AppsContentVerify/Page_U.S. Green Building Council/input_Store products_jumbo-sea'))

	}


	@Then("user can see related products as the (.*)")
	def usercanseerelatedproductsastheinput(String input) {
		if(input=='tap')
		{
			WebUI.verifyElementClickable(findTestObject('Object Repository/Apps/AppsContentVerify/Page_U.S. Green Building Council/a_IES TaP for LEED'))
		}
		else if(input == 'trane')
		{
			WebUI.verifyElementClickable(findTestObject('Object Repository/Apps/AppsContentVerify/Page_U.S. Green Building Council/a_Trane TRACE 700 apps for LEE'))
		}
		else if(input == 'Autodesk')
		{
			WebUI.verifyElementClickable(findTestObject('Object Repository/Apps/AppsContentVerify/Page_U.S. Green Building Council/a_Autodesk Apps for LEED Autom'))
		}
		else if(input == 'tracker')
		{
			WebUI.verifyElementClickable(findTestObject('Object Repository/Apps/AppsContentVerify/Page_U.S. Green Building Council/a_Tracker Plus for LEED'))
		}
		else
		{
			//WebUI.verifyElementClickable(null)
			println('error')
		}

	}

	//-------------------------Scenario-A3---------------

	@Given("User can see the Categories List with checkbox option")
	def UsercanseetheCategoriesListwithcheckboxoption() {
		try {
			boolean myResult = WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Exam/Page_U.S. Green Building Council/ul_AppsEducationExamsGivingHar'))

			if(myResult) {
				println "User can see Education Image"
			}
			else {
				println "User cannot see Education Image"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to Education Page"
		}
	}

	@When("Select on EDUCATION and EXAMS")
	def SelectonEDUCATIONandEXAMS() {
		try {
			
			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Exam/Page_U.S. Green Building Council/input_Education_category'))

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Exam/Page_U.S. Green Building Council/input_Exams_category'))
			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the selected categories page with all the product which is present in APPS, EDUCATION and EXAMS")
	def Usercanseetheselectedcategoriespagewithalltheproductwhichispresentinselectedcategories() {
		try {
			boolean myResult =  WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Exam/Page_U.S. Green Building Council/div_.bg-grid .bg-entry .course'),20)
			if(myResult) {
				println "Contents loaded for Education button"
			}
			else {
				println "Contents not found for Education  Button"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to Education Page"
		}
	}

	//------------------------------Scenario A4-------------------------

	
	@When("Select on EDUCATION and GIVING")
	def SelectonEDUCATIONandGIVING() {
		try {

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Giving/Page_U.S. Green Building Council/input_Education_category'))

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Giving/Page_U.S. Green Building Council/input_Giving_category'))
			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the selected categories page with all the product which is present in APPS, EDUCATION and GIVING")
	def UsercanseetheselectedcategoriespagewithalltheproductwhichispresentinAPPSEDUCATIONandGIVING() {
		try {
			boolean myResult =  WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Giving/Page_U.S. Green Building Council/div_.bg-grid .bg-entry .course'))
			if(myResult) {
				println "Contents loaded for Education button"
			}
			else {
				println "Contents not found for Education  Button"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to Education Page"
		}
	}

	//------------Scenario A5-------------------------
	@When("Select on EDUCATION and HARDWARE")
	def SelectonEDUCATIONandHARDWARE() {
		try {

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Hardware/Page_U.S. Green Building Council/input_Education_category'))

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Hardware/Page_U.S. Green Building Council/input_Hardware_category'))

			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the selected categories page with all the product which is present in APPS, EDUCATION and HARDWARE")
	def UsercanseetheselectedcategoriespagewithalltheproductwhichispresentinAPPSEDUCATIONandHARDWARE() {
		try {
			boolean myResult =  WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Hardware/Page_U.S. Green Building Council/div_.bg-grid .bg-entry .course'))
			if(myResult) {
				println "Contents loaded for Education button"
			}
			else {
				println "Contents not found for Education  Button"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to Education Page"
		}
	}

	//-----------------Scenario A6-------------------

	@When("Select on EDUCATION and MAGAZINES")
	def SelectonEDUCATIONandMAGAZINES() {
		try {

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Magazine/Page_U.S. Green Building Council/input_Education_category'))

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Magazine/Page_U.S. Green Building Council/input_Magazines_category'))
			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the selected categories page with all the product which is present in APPS, EDUCATION and MAGAZINES")
	def UsercanseetheselectedcategoriespagewithalltheproductwhichispresentinAPPSEDUCATIONandMAGAZINES() {
		try {
			boolean myResult =  WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Magazine/Page_U.S. Green Building Council/div_.bg-grid .bg-entry .course'))
			if(myResult) {
				println "Contents loaded for Education button"
			}
			else {
				println "Contents not found for Education  Button"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to Education Page"
		}
	}

	//---------------------Scenario A7-------------

	@When("Select on EDUCATION and MEMBERSHIP")
	def SelectonEDUCATIONandMEMBERSHIP() {
		try {

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Membership/Page_U.S. Green Building Council/input_Education_category'))

			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Membership/Page_U.S. Green Building Council/input_Membership_category'))
			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the selected categories page with all the product which is present in APPS, EDUCATION and MEMBERSHIP")
	def UsercanseetheselectedcategoriespagewithalltheproductwhichispresentinAPPSEDUCATIONandMEMBERSHIP() {
		try {
			boolean myResult =  WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Membership/Page_U.S. Green Building Council/div_.bg-grid .bg-entry .course'))
			if(myResult) {
				println "Contents loaded for APPS, EDUCATION and MEMBERSHIP"
			}
			else {
				println "Contents not found for APPS, EDUCATION and MEMBERSHIP"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to APPS, EDUCATION and MEMBERSHIP"
		}
	}
	//--------------------------------Scenario A8--------------------------------------
	
	
		@When("Select on EDUCATION and PUBLICATIONS")
		def SelectonEDUCATIONandPUBLICATIONS() {
			try {
				WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Publications/Page_U.S. Green Building Council/input_Education_category'))
				WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Publications/Page_U.S. Green Building Council/input_Publications_category'))
				
				println("Button Click Response  : ");
			}
			catch (Exception ex) {
				println("Button not found in the URL , Test Failed");
			}
		}
	
		@Then("User can see the selected categories page with all the product which is present in APPS, EDUCATION and PUBLICATIONS")
		def UsercanseetheselectedcategoriespagewithalltheproductwhichispresentinAPPSEDUCATIONandPUBLICATIONS() {
			try {
				boolean myResult = WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Publications/Page_U.S. Green Building Council/div_results_course-image'))
					
					//findTestObject('Object Repository/Apps/Apps_Edu_Membership/Page_U.S. Green Building Council/div_.bg-grid .bg-entry .course'))
				if(myResult) {
					println "Contents loaded for APPS, EDUCATION and PUBLICATIONS"
				}
				else {
					println "Contents not found for APPS, EDUCATION and PUBLICATIONS"
				}
			}
			catch (Exception ex) {
				println "Not Redirected to APPS, EDUCATION and PUBLICATIONS"
			}
		}
	
	
	//--------------------------------Scenario A9--------------------------------------

	@When("Select on EDUCATION and MERCHANDISE")
	def SelectonEDUCATIONandMERCHANDISE() {
		try {
			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Merchandise/Page_U.S. Green Building Council/input_Education_category'))
			//WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Merchandise/Page_U.S. Green Building Council/input_Education_category'))
			WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Merchandise/Page_U.S. Green Building Council/input_Merchandise_category'))
			//WebUI.check(findTestObject('Object Repository/Apps/Apps_Edu_Merchandise/Page_U.S. Green Building Council/input_Merchandise_category'))

			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the selected categories page with all the product which is present in APPS, EDUCATION and MERCHANDISE")
	def UsercanseetheselectedcategoriespagewithalltheproductwhichispresentinAPPSEDUCATIONandMERCHANDISE() {
		try {
			boolean myResult = WebUI.verifyElementPresent(findTestObject('Object Repository/Apps/Apps_Edu_Merchandise/Page_U.S. Green Building Council/div_.jumbo-search-field border'))
			if(myResult) {
				println "Contents loaded for APPS, EDUCATION and MERCHANDISE"     
			}
			else {
				println "Contents not found for APPS, EDUCATION and MERCHANDISE"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to APPS, EDUCATION and MERCHANDISE"
		}
	}

		//--------------------------------Scenario A10--------------------------------------

	
	
	
	
	
	
	
	
	
	
	
	


}