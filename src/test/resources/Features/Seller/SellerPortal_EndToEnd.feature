Feature: Happy Path for New Seller end to end

  Scenario: To Test the Full HappyPath Of the Seller Portal
    Given I am on the seller homepage
    And I see the Register Now Button
    When I click the Register Now Button
    Then I should be view the Registration popup
    When I enter the Store Name in the Register popup
    And I enter the Email Id in the Register popup
    And I enter the Mobile Number in the Register popup
    And I enter the Password in the Register popup
    Then I click the Register My Shop Button
		And I enter the 4 digit OTP
		And I click the Verify button