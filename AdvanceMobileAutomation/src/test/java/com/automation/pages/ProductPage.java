package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='FILTERS']/../android.view.View/android.view.View/android.view.View[1]")
    WebElement itemContainer;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View")
    List<WebElement> itemElements;

    public void isProductPageIsDisplayed(String product) {
        String productXpath = "//android.view.View[@content-desc='%s']";
        Assert.assertTrue(driver.findElement(By.xpath(String.format(productXpath, product))).isDisplayed());
    }

    public void clickOnTheProduct() {
        waitForElementToBeVisible(itemContainer);
        itemContainer.click();
    }

    public boolean isProductListNotEmpty() {
        List<String> itemList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            int x = itemContainer.getLocation().getX();
            int y = itemContainer.getLocation().getY();
            int width = itemContainer.getSize().getWidth();
            int height = itemContainer.getSize().getHeight();

            for (WebElement item : itemElements) {
                String itemName = item.getAttribute("content-desc");
                if (!itemList.contains(itemName)) {
                    itemList.add(itemName);
                }
            }

            scrollOrSwipe(x + (width / 2), y + height, x + (width / 2), y);
            itemContainer = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='FILTERS']/../android.view.View/android.view.View/android.view.View[1]"));
            itemElements = driver.findElements(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View"));

        }

        return !itemList.isEmpty();
    }
}
