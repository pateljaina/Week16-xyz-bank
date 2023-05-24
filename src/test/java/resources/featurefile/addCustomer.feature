@smoke
Feature: AddCustomer Test
  As user I want to login into website

  @smoke @sanity
  Scenario:Bank Manager should add customer successfully
    Given I am on login page
    When I click On Bank Manager Login Tab
    And  I click On Add Customer Tab
    And  I enter "FirstName"
    And  I enter "LastName"
    And  I enter "PostCode"
    And  I click On Add Customer Button popup display
    Then I verify message Customer added successfully
    And I click on ok button on popup.