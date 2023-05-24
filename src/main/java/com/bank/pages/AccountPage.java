package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUserText;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement addButton;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addUserText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employNameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement statusDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveButton;

    @CacheLookup
    @FindBy(xpath = "//body")
    WebElement sucessfulSave;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Deposit Successful']")
    WebElement depositMsg;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement withdrawTab;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Withdraw']")
    WebElement withdrawButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Transaction Successful']")
    WebElement withdrawMsg;

    @CacheLookup
    @FindBy(xpath = "//input[@ng-model='amount']")
    WebElement amountField;


    public String getTextSystemUser() {
        log.info(" Get Text system user " + systemUserText.toString());
        String message = getTextFromElement(systemUserText);
        return message;
    }

    public void clickOnAdminTab() {
        log.info("Clicking on Admin Button " + addButton.toString());
        clickOnElement(addButton);
    }

    public String getTextAddUser() {
        log.info(" Get Text add user " + addUserText.toString());
        return getTextFromElement(addUserText);
    }

    public void selectUserRole(String visibleText) {
        //selectByVisibleTextFromDropDown(userRoleDropDown, visibleText);
        clickOnElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
        clickOnElement(By.xpath("//div[contains(text(),'Admin')]"));
    }

    public void enterEmployeeName(String employeeName) {
        log.info("Enter emplyoeeName " + employeeName + " to employee name field " + employNameField.toString());
        sendTextToElement(employNameField, employeeName);
    }

    public void enterUserName(String userName) {
        log.info("Enter userName " + userName + " to userName field " + userNameField.toString());
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        log.info("Enter userName " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String password) {
        log.info("Enter Confirm Password " + password + " to confirm password field " + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, password);
    }

    public void selectStatus(String visibleText) {
        log.info("select status " + statusDropDown.toString());
        selectByVisibleTextFromDropDown(statusDropDown, visibleText);
    }

    public void clickOnSaveButton() {
        log.info("Clicking on save button " + saveButton.toString());
        clickOnElement(saveButton);
    }

    public String getTextSuccessfullySaved() {
        log.info("Get Text Successfully Saved( " + sucessfulSave.toString());
        String message = getTextFromElement(sucessfulSave);
        return message;
    }

    public void clickOnSearchButton() {
        log.info("Clicking on search button " + searchButton.toString());
        clickOnElement(searchButton);
    }

    public void clickOnWithdrawTab() {
        log.info("Clicking on Withdraw Tab " + withdrawTab.toString());
        clickOnElement(withdrawTab);
    }

    public void enterAmountToWithdraw(String text) {
        log.info("Enter amount " + amountField.toString());
        sendTextToElement(amountField, text);
    }

    public void clickOnWithdrawButton() {
        log.info("Clicking on  Withdraw Button" + withdrawButton.toString());
        clickOnElement(withdrawButton);
    }

    public String getWithdrawMsg() {
        log.info("Get withdraw text from " + withdrawMsg.toString());
        return getTextFromElement(withdrawMsg);
    }

    public String getDepositMsg() {
        log.info("Get deposit  text from " + depositMsg.toString());
        return getTextFromElement(depositMsg);
    }

    public void enterAmountToDeposit(String text) {
        log.info("Enter amount deposit " + text + depositMsg.toString());
        sendTextToElement(amountField, text);
    }


}
