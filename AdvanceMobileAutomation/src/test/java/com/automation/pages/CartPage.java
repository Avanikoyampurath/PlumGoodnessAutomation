package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "(//android.view.View[@content-desc])[5]")
    WebElement itemOnCart;

    @FindBy(xpath = "//android.view.View[@content-desc='cart']")
    WebElement cartTitle;

    @FindBy(xpath = "//android.view.View[@content-desc='cart']/following-sibling::android.view.View[1]")
    WebElement cartValueElement;

    @FindBy(xpath = "//android.view.View[@content-desc='1']/following-sibling::android.widget.ImageView")
    WebElement deleteIcon;

    @FindBy(xpath = "//android.view.View[@content-desc='remove']")
    WebElement removeBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='your cart is empty!']")
    WebElement cartEmptyMsg;

    public boolean isCartPageDisplayed() {
        return cartTitle.isDisplayed();

    }

    public void isProductAddedToCartSuccessFully(String expectedCartValue) {

        String actualCartValue = cartValueElement.getAttribute("content-desc");
        Assert.assertTrue(itemOnCart.isDisplayed());
        Assert.assertEquals(actualCartValue, expectedCartValue);

    }

    public void clickOnDeleteIcon() {
        deleteIcon.click();
    }

    public void clickOnRemoveBtn() {
        removeBtn.click();
    }

    public boolean isCartEmptyMsgDisplayed() {
        return cartEmptyMsg.isDisplayed();
    }
}
