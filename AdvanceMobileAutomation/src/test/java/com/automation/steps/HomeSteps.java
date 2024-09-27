package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user open the application")
    public void user_open_the_application() {
        homePage.openWebsite();
    }

    @Then("verify user is on the homepage")
    public void verify_user_is_on_the_homepage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user search for product {string}")
    public void user_search_for_product(String product) {
        homePage.enterTheProductToSearch(ConfigReader.getConfigValue(product));
    }


}
