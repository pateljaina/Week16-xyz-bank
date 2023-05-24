@sanity
Feature: CustomerAccount Test

  Scenario: Bank Manager Should Open Account Successfully
    When I click On Bank Manager Login Tab
    And I click On Open Account Tab
    And I Search customer that created in first test
    And I Select currency Pound
    And I click on process button  popup displayed
    Then I verify message Account created successfully
    And I click on ok button on popup.