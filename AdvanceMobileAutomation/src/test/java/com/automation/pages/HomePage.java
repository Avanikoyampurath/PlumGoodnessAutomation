package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='skip']")
    WebElement skipButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='search ']")
    WebElement searchBoxField;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement searchBoxInput;

    public void openWebsite() {
        clickOnElementIfPresent(skipButton);
    }

    public boolean isHomePageDisplayed() {
        waitForElementToBeVisible(searchBoxField);
        return searchBoxField.isDisplayed();
    }

    public void enterTheProductToSearch(String item) {
        searchBoxField.click();
        searchBoxInput.click();
        searchBoxInput.sendKeys(item);
        setImplicitWait(60);
    }
}
