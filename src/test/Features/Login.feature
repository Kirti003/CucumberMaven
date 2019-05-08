Feature: LoginTest

  @QA
  Scenario: Verify login is successful
    Given User launched the application
    When User enter credentials
    And click on Signin button
    Then User should be able to login
