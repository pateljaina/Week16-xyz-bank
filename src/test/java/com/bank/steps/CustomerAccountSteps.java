package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.CustomerAccountPage;
import com.bank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CustomerAccountSteps {
    @And("^I click On Open Account Tab$")
    public void iClickOnOpenAccountTab() {
        new HomePage().clickOnOpenAccount();
    }

    @And("^I Search customer that created in first test$")
    public void iSearchCustomerThatCreatedInFirstTest() {
        new CustomerAccountPage().searchCustomerFromDropDown("Prina");
    }

    @And("^I Select currency Pound$")
    public void iSelectCurrencyPound() {
        new CustomerAccountPage().selectCurrencyFromDropDown("Pound");
    }

    @And("^I click on process button  popup displayed$")
    public void iClickOnProcessButtonPopupDisplayed() {
        new CustomerAccountPage().clickOnProcess();
    }

    @Then("^I verify message Account created successfully$")
    public void iVerifyMessageAccountCreatedSuccessfully() {
        new AddCustomerPage().clickOnPopUpMessage();
    }

}
