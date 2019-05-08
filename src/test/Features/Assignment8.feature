Feature: Assignment8

  @tag1
  Scenario: Verify logins is successful
    Given User launched the applications
    When User enters credentials
    And click on Signin buttonss
    Then User should be able to logins
    
   @tag2
   Scenario: Verify Top from women section is selected
   Given User should be able to logins
   When User selects 'Women' from navigation bar
   And Select 'Tops' option in drop down list
   Then User is taken to the tops section in the women category
   
  