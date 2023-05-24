package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddCustomerSteps {
    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @When("^I click On Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginLink();
    }

    @And("^I click On Add Customer Tab$")
    public void iClickOnAddCustomerTab() {
        new AddCustomerPage().clickOnAddCustomer();
    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String firstName) {
        new AddCustomerPage().enterFirstName("Ann");
    }

    @And("^I click On Add Customer Button popup display$")
    public void iClickOnAddCustomerButtonPopupDisplay() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^I verify message Customer added successfully$")
    public void iVerifyMessageCustomerAddedSuccessfully() {
        Assert.assertEquals(new AddCustomerPage().getPopUpMessage(), "Customer added successfully with customer id :8", "message not found");
    }

    @And("^I click on ok button on popup\\.$")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnPopUpMessage();
    }
}
