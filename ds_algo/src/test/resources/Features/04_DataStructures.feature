Feature: Data Structruce feature

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid username "utest_sdet00" and password "temp12!@"
    Then The user clicks on login button

  @DataIntro
  Scenario: Validating the Data Structure Introduction page feature
    When User clicks on Get Started button inside Data Structure frame
    Then User should be navigated to Data Structures Introduction page
    When User clicks on the Time Complexity link in DS home page
    Then User should be navigated to Time Complexity page
    When User clicks on Try here button
    Then User should be successfully navigated to Try Editor page
    When User enters valid python code
      | print("Data Structures Introduction") |
    Then User should see the valid "output"
    When User enters invalid python code
      | print Data Structures Introduction |
    Then User should get the error pop up alert
