package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;

    public void clickOnAddCustomer() {
        log.info("Clicking on add customer " + addCustomer.toString());
        clickOnElement(addCustomer);
    }

    public void enterFirstName(String firstName) {
        log.info("Enter First Name " + firstName + " to first name field " + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Enter Last Name " + lastName + " to last name field " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void enterPostCode(String postCode) {
        log.info("Enter post code " + postCode + " to post code field " + postCode.toString());
        sendTextToElement(postCodeField, postCode);
    }

    public void clickOnAddCustomerButton() {
        log.info("Clicking add customer button " + addCustomer.toString());
        clickOnElement(addCustomerButton);

    }

    public String getPopUpMessage() {
        return getTextFromAlert();
    }

    public void clickOnPopUpMessage() {
        acceptAlert();
    }

}
