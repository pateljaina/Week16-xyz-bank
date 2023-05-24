package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[.='Admin']")
    WebElement adminTab;

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    WebElement dashBoardText;


    public void clickOnAdminTab() {
        log.info("Clicking on Admin Button " + adminTab.toString());
        clickOnElement(adminTab);
    }

    public String getTextDashboard() {
        log.info("Get Dashboard text from " + dashBoardText.toString());
        return getTextFromElement(dashBoardText);
    }

}
