#-------------------------------------------------------------------------------------------------------------
# Author : Dinesh A                                                                Reviewer    : Kamal
# Date   : 06-12-2018                                                              Reviewed On : 06-12-2018
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Dexcription
# CR #1 :
#-------------------------------------------------------------------------------------------------------------
Feature: To Verify the content of Apps category in USGBC Online Portal.

  Background: 
    Given User is to navigate to USGBC website
    And User can see the Store link to navigate to the Store page
    When Click on the Store link
    Then User can see the Store page with all the contents
   
  

  Scenario: To verify the contents in the Apps page
    Given User can see the APPS Image link to navigate to the APPS page
    When Click on the APPS Image link
    Then User can see the APPS page with all the product which is present in APPS
   # And User can see the  APPS filter checked by Default in the Filters Category list
   # And User can see the Search bar to search products
   # And User can see the Filters

