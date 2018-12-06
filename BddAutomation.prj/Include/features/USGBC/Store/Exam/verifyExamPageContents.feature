#-------------------------------------------------------------------------------------------------------------
# Author : Dinesh A                                                                Reviewer    : Kamal
# Date   : 06-12-2018                                                              Reviewed On : 06-12-2018
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Dexcription
# CR #1 :
#-------------------------------------------------------------------------------------------------------------
Feature: To Verify the content of Exam category in USGBC Online Portal.

  Background: 
    Given User is to navigate to USGBC website
    And User can see the Store link to navigate to the Store page
    When Click on the Store link
    Then User can see the Store page with all the contents
    
    Scenario: To Verify the contents in the Exams Page
    Given User can see the Store link to navigate to the Store page
    And Click on the Store link
    And User can see the Exams Image link to navigate to the Exams page
    When Click on the Exams Image link
    Then User can see the Exams page with all the product which is present in Exams
    And User can see the Exams filter checked by Default in the Filters Category list