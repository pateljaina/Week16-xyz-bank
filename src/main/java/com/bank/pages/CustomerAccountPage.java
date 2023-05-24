package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerAccountPage.class.getName());

    public CustomerAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Nina.Patel')]")
    WebElement userFoundInList;

    @CacheLookup
    @FindBy(xpath = "div[role='columnheader'] i[class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteButton;

    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement drpcustomerName;
    @CacheLookup
    @FindBy(id = "currency")
    WebElement currencyDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;


    public String getTextUser() {
        log.info("Get user text from " + userFoundInList.toString());
        return getTextFromElement(userFoundInList);

    }
    public void clickOnCheckBox() {
        log.info("Clicking on check box " + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void clickOnDeleteButton() {
        log.info("Clicking on delete button " + deleteButton.toString());
        clickOnElement(deleteButton);
    }

    public void searchCustomerFromDropDown(String text) {
        log.info("Search Customer From DropDown " + text + drpcustomerName.toString());
        selectByVisibleTextFromDropDown(drpcustomerName, text);
    }

    public void selectCurrencyFromDropDown(String text) {
        log.info("Select currency From DropDown " + text + currencyDropDown.toString());
        selectByVisibleTextFromDropDown(currencyDropDown, text);
    }

    public void clickOnProcess() {
        log.info("Clicking on process " + processButton.toString());
        clickOnElement(processButton);
    }

    public String getPopTextFromOpenAccount() {
        return getTextFromAlert();
    }


}
