@regression
Feature: Customer Login Page

  Scenario:Customer Should Login And Logout Suceessfully
    When  I click on Customer Login Tab
    And  I search customer that you created
    And  I click on Login Button
    Then I verify Logout Tab displayed
    And  I click on Logout
    Then I verify Your Name text displayed