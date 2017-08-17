Feature: As an end user I want a contact us page to find out more about QAWorks.

  Scenario Outline: Valid Submission
    Given I open QAWorks website
    When I click on contact tab
    Then I am presented with a form to submit the enquiry
    And I enter name as "<name>"
    And I enter email as "j.Bloggs@qaworks.com"
    And I enter message as "please contact me I want to find out more"
    And I click on send button
    Examples:
      | name             |
      | j.Bloggs         |
#      | 1234dfgdf        |
#      | masbdmsad#$42434 |

  Scenario: InValid Submission
    Given I open QAWorks website
    When I click on contact tab
    Then I am presented with a form to submit the enquiry
    And I enter name as " "
    And I enter email as " "
    And I enter message as " "
    And I click on send button
    And I am presented with validation errors

#    Other possible test cases
#  Scenario: Check character limit for message textBox
#  Scenario: Check invalid name format for name textBox
#  Scenario: Check invalid email address for email textBox
#  Scenario: Verify sucess on submission of enquiry

