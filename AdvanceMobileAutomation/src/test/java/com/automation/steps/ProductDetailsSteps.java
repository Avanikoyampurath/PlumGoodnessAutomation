package com.automation.steps;

import com.automation.pages.ProductDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductDetailsSteps {

    ProductDetailsPage detailsPage = new ProductDetailsPage();

    @Then("verify user redirected to the product details page")
    public void verify_user_redirected_to_the_product_details_page() {
        Assert.assertTrue(detailsPage.isProductDetailsPageDisplayed());
    }

    @When("user click on the Add to Cart button")
    public void user_click_on_the_add_to_cart_button() {
        detailsPage.clickOnAddToCartButton();
    }

    @When("user click on the shopping cart icon")
    public void user_click_on_the_shopping_cart_icon() {
        detailsPage.clickOnCartIcon();
    }
}
