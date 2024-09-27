Feature: validate remove from cart functionality

  Background:
    Given user open the application
    Then verify user is on the homepage
    When user search for product "product.name"
    Then verify user is on "product.name" product page
    When user click on a product
    Then verify user redirected to the product details page
    When user click on the Add to Cart button
    And user click on the shopping cart icon
    Then verify user is on cart page
    And verify item is added into cart and cart value displays "(1 item)"

  Scenario: verify user can remove a product that has been added in the cart
    When user click on delete icon
    And user click on remove button
    Then verify cart is empty message is displayed
