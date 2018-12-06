#-------------------------------------------------------------------------------------------------------------
# Author : Dinesh A                                                                Reviewer    : Kamal
# Date   : 06-12-2018                                                              Reviewed On : 06-12-2018
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Dexcription
# CR #1 :
#-------------------------------------------------------------------------------------------------------------
Feature: To Verify the content of Education category in USGBC Online Portal.

  Background: 
    Given User is to navigate to USGBC website
    And User can see the Store link to navigate to the Store page
    When Click on the Store link
    Then User can see the Store page with all the contents
    
    Scenario: To Verify the contents in the Education Page
    Given User can see the Store link to navigate to the Store page
    And Click on the Store link
    And User can see the Education Image link to navigate to the Education page
    When Click on the Education Image link
    Then User can see the Education page with all the product which is present in Education
    And User can see the  Education filter checked by Default in the Filters Category list
    