package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;


    public void clickOnBankManagerLoginLink() {
        log.info("Clicking on manager login link " + bankManagerLoginLink.toString());
        clickOnElement(bankManagerLoginLink);
    }

    public void registerLink()
    {log.info("Clicking on register link " + registerLink.toString());
        clickOnElement(registerLink);
    }

    public String getBaseUrl() {
        return driver.getCurrentUrl();

    }

    public void clickOnOpenAccount() {
        log.info("Clicking on open account " + openAccount.toString());
        clickOnElement(openAccount);
    }
}
