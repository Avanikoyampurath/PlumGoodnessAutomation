Feature: validate product search functionality

  Background:
    Given user open the application
    Then verify user is on the homepage

    Scenario: verify product list is not empty
      When user search for product "product.name"
      Then verify user is on "product.name" product page
      And verify product list is not empty