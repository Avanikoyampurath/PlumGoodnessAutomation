package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='add to cart']/..//android.view.View[@content-desc]")
    WebElement itemDescriptionBox;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='add to cart']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")
    WebElement cartIcon;

    public boolean isProductDetailsPageDisplayed() {
        waitForElementToBeVisible(itemDescriptionBox);
        waitForElementToBeVisible(addToCartBtn);
        return itemDescriptionBox.isDisplayed() && addToCartBtn.isDisplayed();
    }

    public void clickOnAddToCartButton() {
        addToCartBtn.click();
        setImplicitWait(60);
    }

    public void clickOnCartIcon() {
        cartIcon.click();
        setImplicitWait(40);

    }
}
