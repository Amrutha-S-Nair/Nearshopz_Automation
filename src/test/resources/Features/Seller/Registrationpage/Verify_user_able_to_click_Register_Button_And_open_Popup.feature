Feature: Verify the user able to click the Register Button and open the Register popup

  Scenario: To Test the Register Button and Verify the UI
    Given I am on the seller homepage
    And I see the Register Now Button
    When I click the Register Now Button
    Then I should be view the Registration popup