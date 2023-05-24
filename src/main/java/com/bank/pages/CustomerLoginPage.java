package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "username")
    WebElement userNameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customersLoginButton;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement searchCustomerName;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement logoutText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement welcomeUserNameText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawButton;

    public void enterUserName(String userName) {
        log.info("Enter userName " + userName + " to user name field " + userNameField.toString());
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on  button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public void clickOnCustomersLoginButton() {
        log.info("Clicking on customer login button " + customersLoginButton.toString());
        clickOnElement(customersLoginButton);

    }

    public void searchCreatedCustomer(String visibleText) {
        log.info("Select Customer From DropDown " + visibleText + yourNameDropDown.toString());
        selectByVisibleTextFromDropDown(yourNameDropDown, visibleText);
    }

    public String getTextLogOut() {
        log.info("Clicking on log button " + logoutText.toString());
        return getTextFromElement(logoutText);
    }

    public String getTextOfYourName() {
        log.info(" Get Text text from " + welcomeUserNameText.toString());
        return getTextFromElement(welcomeUserNameText);
    }

    public void clickOnLogOut() {
        log.info("Clicking on log out button " + logoutButton.toString());
        clickOnElement(logoutButton);
    }

    public void clickOnDepositButton() {
        log.info("Clicking on deposit button " + depositButton.toString());
        clickOnElement(depositButton);
    }

    public void clickOnWithdrawl() {
        log.info("Clicking on withdraw button " + withdrawButton.toString());
        clickOnElement(withdrawButton);
    }



}
