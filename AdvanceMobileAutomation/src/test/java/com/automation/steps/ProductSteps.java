package com.automation.steps;

import com.automation.pages.ProductPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @Then("verify user is on {string} product page")
    public void verifyUserIsOnProductPage(String product) {
        productPage.isProductPageIsDisplayed(ConfigReader.getConfigValue(product));
    }

    @When("user click on a product")
    public void user_click_on_a_product() {
        productPage.clickOnTheProduct();
    }


    @And("verify product list is not empty")
    public void verifyProductListIsNotEmpty() {
        Assert.assertTrue(productPage.isProductListNotEmpty());
    }
}
