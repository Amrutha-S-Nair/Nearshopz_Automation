Feature: Verify the user able to add Prodcuts to the store from Catlogue Builder successfully

  Scenario: Verify the user able to add products to the store from Catlogue Builder
    Given I am on the seller homepage
    When I enter the Email Id in the Sigin popup
    And I enter the Password in the Sigin popup
    And I click the Login Button
    Then I should view the welcome Store Name text
    When I click Add Products tab from the menu
    And I click the Add new Button in the product page
    Then I can view the Create New Product popup
    When I click the Create From Catalog Builder Button
    Then I see the all buisiness types displayed for the shop
    When I click the First Business type displayed
    Then I see all the Categories listed in the Business Type
    When I click the First Category type displayed
    Then I see all Sub Category listedof the category displayed
    When I click the First Sub Category type displayed
    Then I select the product to be added
    