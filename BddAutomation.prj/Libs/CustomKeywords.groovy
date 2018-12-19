
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement

import com.relevantcodes.extentreports.ExtentTest


def static "com.jira.components.JSelect.selectByText"(
    	TestObject o	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	o
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	String labelSelect	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	labelSelect
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	WebElement el	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	el
         , 	optionText)
}

def static "reports.Report.propertyFileForReport"(
    	String reportFolder	) {
    (new reports.Report()).propertyFileForReport(
        	reportFolder)
}

def static "reports.Report.getInstance"(
    	String reportFolder	) {
    (new reports.Report()).getInstance(
        	reportFolder)
}

def static "reports.Report.print"(
    	ExtentTest test	
     , 	boolean verifyStatus	
     , 	String printStatement	) {
    (new reports.Report()).print(
        	test
         , 	verifyStatus
         , 	printStatement)
}

def static "reports.Report.takeScreenshot"(
    	ExtentTest test	) {
    (new reports.Report()).takeScreenshot(
        	test)
}
