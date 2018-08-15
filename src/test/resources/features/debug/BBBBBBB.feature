Feature: Login Feature BBBBBBBBBBBBBBBBBBBBBBBBBBBB
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user 333333333333333
    Given user is on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed


#  Scenario: Login as a authenticated user 4444444444444444
#    Given user is on homepage
#    When user navigates to Login Page
#    And user enters username and Password
#    Then success message is displayed