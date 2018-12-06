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
	
	
//----------------------------------------------------------------------------------------------------------


	@Given("User can see the APPS Image link to navigate to the APPS page")
	def UsercanseetheAPPSImagelinktonavigatetotheAPPSpage() {
		
			
	//WebUI.verifyImagePresent(findTestObject('Page_Store  U.S. Green Building Cou/img'));
		
	}

	@When("Click on the APPS Image link")
	def ClickontheAPPSImagelink() {
	
			WebUI.click(findTestObject('Page_Store  U.S. Green Building Cou/img'))
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

}