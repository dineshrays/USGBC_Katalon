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
   
   Scenario: To verify the contents in the Giving page  
   Given User can see the Giving Image link to navigate to the Giving page
   When Click on the Giving Image link
 	 Then User can see the Giving page with all the product which is present in Giving
 	 And User can see the Giving filter checked by Default in the Filters Category list
 	 