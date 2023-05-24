@smoke
Feature: Account Test
  Scenario:Customer Should Deposit Money Successfully
    When I click on Customer Login Tab
    And I search customer that you created.
    And I click on Login Button
    And I click on Deposit Tab
    And I Enter amount "100"
    And I click on Deposit Button
    Then I verify message Deposit Successful

  Scenario: Customer Should Withdraw Money Successfully
    When I click on Customer Login Tab
    And I search customer that you created.
    And I click on Login Button
    And I click on Withdrawl Tab
    And I Enter amount "50"
    And I click on Deposit Button
    Then  I verify message Transaction Successful