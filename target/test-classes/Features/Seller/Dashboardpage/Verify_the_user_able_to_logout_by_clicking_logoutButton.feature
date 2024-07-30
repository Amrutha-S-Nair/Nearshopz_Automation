Feature: Verify the existing user can logout successfully

  Scenario: Verify the user able to logout successfuly by clicking Logout Button
    Given I am on the seller homepage
    When I enter the Email Id in the Sigin popup
    And I enter the Password in the Sigin popup
    And I click the Login Button
    Then I should view the welcome Store Name text
    When I click the Navbar profile image in the top right corner
    Then I see the dropdown displayed in the navbar
    When I click Logout Button from the dropdown
    Then I see the Logout confirmation popup
    And I click Logout in the confirmation popup
    And I am successfully logged out of the store