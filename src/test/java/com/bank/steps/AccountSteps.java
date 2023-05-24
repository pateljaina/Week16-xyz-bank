package com.bank.steps;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomerLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AccountSteps {
    @When("^I click on Customer Login Tab$")
    public void iClickOnCustomerLoginTab() {
        new CustomerLoginPage().clickOnCustomersLoginButton();
    }

    @And("^I search customer that you created\\.$")
    public void iSearchCustomerThatYouCreated() {
        new CustomerLoginPage().searchCreatedCustomer("Ann");
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @And("^I click on Deposit Tab$")
    public void iClickOnDepositTab() {
        new CustomerLoginPage().clickOnDepositButton();
    }

    @And("^I Enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String arg0) {
        new AccountPage().enterAmountToDeposit("100");
    }

    @And("^I click on Deposit Button$")
    public void iClickOnDepositButton() {
        new CustomerLoginPage().clickOnDepositButton();
    }

    @Then("^I verify message Deposit Successful$")
    public void iVerifyMessageDepositSuccessful() {
        Assert.assertEquals(new AccountPage().getDepositMsg(), "Deposit Successful", "Message not found");
    }

    @When("^I click on \"([^\"]*)\" Tab$")
    public void iClickOnTab() {
        new CustomerLoginPage().clickOnCustomersLoginButton();
    }

    @And("^I click on Withdrawl Tab$")
    public void iClickOnWithdrawlTab() {
        new CustomerLoginPage().clickOnWithdrawl();
    }

    @Then("^I verify message Transaction Successful$")
    public void iVerifyMessageTransactionSuccessful() {
        Assert.assertEquals(new AccountPage().getWithdrawMsg(), "Transaction Successful", "Message not found");
    }
}
