#-------------------------------------------------------------------------------------------------------------
# Author : Dinesh A                                                                Reviewer    : Kamal
# Date   : 06-12-2018                                                              Reviewed On : 06-12-2018
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Dexcription
# CR #1 :Add Leeds 
#-------------------------------------------------------------------------------------------------------------
Feature: To Verify the content of Apps category in USGBC Online Portal.

  Background: 
    Given User is to navigate to USGBC website
    And User can see the Store link to navigate to the Store page
    When Click on the Store link
    Then User can see the Store page with all the contents


	#Scenario-1:
Scenario: To verify the contents in the Apps page
  Given User can see the APPS Image link to navigate to the APPS page
  When Click on the APPS Image link
  Then User can see the APPS page with all the product which is present in APPS
   
#Scenario-2:
Scenario Outline: To verify the contents in the App page when searched for a product
    Given Click on the APPS Image link
    And user can see the search bar to search for products
    When user give <input> in search bar to search 
    And user click on the search image
    Then user can see related products as the <input> 
    Examples:
   |input|
   |tap|
   |trane|
   |Autodesk|
   |tracker|
   
      #Scenario-3:
Scenario: To verify the contents in the Apps page when APPS, EDUCATION and EXAMS Checked
  Given Click on the APPS Image link
	And User can see the Categories List with checkbox option 
	When Select on EDUCATION and EXAMS
	Then User can see the selected categories page with all the product which is present in APPS, EDUCATION and EXAMS   
   
   #Scenario-4
	Scenario: To verify the contents in the Apps page when APPS, EDUCATION and GIVING Checked
  Given Click on the APPS Image link
	And User can see the Categories List with checkbox option 
	When Select on EDUCATION and GIVING
	Then User can see the selected categories page with all the product which is present in APPS, EDUCATION and GIVING	

#Scenario-5
	 Scenario: To verify the contents in the Apps page when APPS, EDUCATION and HARDWARE Checked
  Given Click on the APPS Image link
	And User can see the Categories List with checkbox option 
	When Select on EDUCATION and HARDWARE
	Then User can see the selected categories page with all the product which is present in APPS, EDUCATION and HARDWARE
	
	#Scenario-6
	Scenario: To verify the contents in the Apps page when APPS,EDUCATION and MAGAZINES Checked
 	Given Click on the APPS Image link
	And User can see the Categories List with checkbox option  
	When Select on EDUCATION and MAGAZINES
	Then User can see the selected categories page with all the product which is present in APPS, EDUCATION and MAGAZINES
	
	#Scenario-7
	Scenario: To verify the contents in the Apps page when APPS, EDUCATION and MEMBERSHIP Checked
  Given Click on the APPS Image link
	And User can see the Categories List with checkbox option 
	When Select on EDUCATION and MEMBERSHIP
	Then User can see the selected categories page with all the product which is present in APPS, EDUCATION and MEMBERSHIP

	#Scenario-8
		Scenario: To verify the contents in the Apps pagewhen APPS, EDUCATION and  PUBLICATIONS Checked
	Given Click on the APPS Image link
	And User can see the Categories List with checkbox option 
	When Select on EDUCATION and PUBLICATIONS
	Then User can see the selected categories page with all the product which is present in APPS, EDUCATION and PUBLICATIONS	

#Scenario-9
	Scenario: To verify the contents in the Apps pagewhen APPS, EDUCATION and MERCHANDISE Checked
	Given Click on the APPS Image link
	And User can see the Categories List with checkbox option 
	When Select on EDUCATION and MERCHANDISE
	Then User can see the selected categories page with all the product which is present in APPS, EDUCATION and MERCHANDISES



	
   
	
	
	
