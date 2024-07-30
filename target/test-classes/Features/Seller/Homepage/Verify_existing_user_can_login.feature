
Feature: Verify the existing user can login successfully

  Scenario: Verify the user able to login successfuly for old user
    Given I am on the seller homepage
    When I enter the Email Id in the Sigin popup
    And I enter the Password in the Sigin popup
    And I click the Login Button
    Then I should view the welcome Store Name text