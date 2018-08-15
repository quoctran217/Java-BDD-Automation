Feature: Login Feature AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user 11111111111111111
    Given user is on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed

#  Scenario: Login as a authenticated user 222222222222222222
#    Given user is on homepage
#    When user navigates to Login Page
#    And user enters username and Password
#    Then success message is displayed