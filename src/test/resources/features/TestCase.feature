@Execution
Feature: Automation for contact form in adkcw-wp page

  Scenario: Send information about contact form
    Given I enter on the form contact
    When I enter my First Name
    And I enter my Last Name
    And I enter My Work Email
    And I enter my Company Name
    And I enter Phone Number
    And I enter a message
    Then I click on button submit

