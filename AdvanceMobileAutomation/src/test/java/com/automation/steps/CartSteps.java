package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @Then("verify item is added into cart and cart value displays {string}")
    public void verify_item_is_added_into_cart_and_cart_value_displays(String cartValue) {
        cartPage.isProductAddedToCartSuccessFully(cartValue);
    }

    @When("user click on delete icon")
    public void user_click_on_delete_icon() {
        cartPage.clickOnDeleteIcon();
    }

    @When("user click on remove button")
    public void user_click_on_remove_button() {
        cartPage.clickOnRemoveBtn();
    }

    @Then("verify cart is empty message is displayed")
    public void verify_cart_is_empty_message_is_displayed() {
        Assert.assertTrue(cartPage.isCartEmptyMsgDisplayed());
    }
}
