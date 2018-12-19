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


class verifyGivingPageContents {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User can see the Giving Image link to navigate to the Giving page")
	def UsercanseetheGivingImagelinktonavigatetotheGivingpage() {
		try {
			boolean myResult = WebUI.verifyElementPresent(findTestObject('Object Repository/Giving_Page/Page_Store  U.S. Green Building Cou/div_Next_giving'),
					0)

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

	@When("Click on the Giving Image link")
	def ClickontheGivingImagelink() {
		try {
			WebUI.click(findTestObject('Object Repository/Giving_Page/Page_Store  U.S. Green Building Cou/img'))

			println("Button Click Response  : ");
		}
		catch (Exception ex) {
			println("Button not found in the URL , Test Failed");
		}
	}

	@Then("User can see the Giving page with all the product which is present in Giving")
	def UsercanseetheGivingpagewithalltheproductwhichispresentinGiving() {
		try {
			boolean myResult =  WebUI.verifyElementPresent(findTestObject('Object Repository/Giving_Page/Page_U.S. Green Building Council/div_.jumbo-search-field border'),
					0)
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
	
	@Then("User can see the Giving filter checked by Default in the Filters Category list")
	def UsercanseetheGivingfiltercheckedbyDefaultintheFiltersCategorylist() {
		try {
			boolean myResult = WebUI.verifyElementChecked(findTestObject('Object Repository/Giving_Page/Page_U.S. Green Building Council/input_Giving_category'),
					0)

			if(myResult) {
				println "Apps button Checked by Default"
			}
			else {
				println "Apps button not Checked by Default"
			}
		}
		catch (Exception ex) {
			println "Not Redirected to Apps Page"
		}
	}
	
	
	
	
	
}