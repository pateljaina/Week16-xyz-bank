package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class CustomerLoginSteps {
    @And("^I search customer that you created$")
    public void iSearchCustomerThatYouCreated() {

        new CustomerLoginPage().searchCreatedCustomer("Ann");
    }

    @Then("^I verify Logout Tab displayed$")
    public void iVerifyLogoutTabDisplayed() {
        new CustomerLoginPage().getTextLogOut();
    }

    @And("^I click on Logout$")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogOut();
    }

    @Then("^I verify Your Name text displayed$")
    public void iVerifyYourNameTextDisplayed() {
        Assert.assertEquals(new CustomerLoginPage().getTextOfYourName(), "Your Name");
    }
}
