Feature: SignIn Functionality

  @Login
  Scenario: Navigating to Login Page from ds algo portal
    Given User launches ds algo portal
    When User clicks on Get Started button and clicks on SignIn link
    Then User should be navigated to the login page

  @Login01
  Scenario Outline: Validating Login with valid and invalid credentials
    Given User launches login page
    When User enters valid and invalid "<SheetName>" and <RowNumber>
    Then User clicks on Login button

    Examples: 
      | SheetName | RowNumber |
      | login     |         1 |
      | login     |         2 |
      | login     |         3 |

  @Login
  Scenario Outline: Validating Login with either of the password and username fields empty
    Given User launches login page
    When User wihout entering either "<username>" and "<password>" field
    Then Clicks on Login button

    Examples: 
      | username    | password |
      | user_sdet00 |          |
      |             | temp12!@ |

  @Login
  Scenario: Validating signout
    Given User launches login page
    When User enters valid username and password and clicks on Signout link
    Then user should be logged out successfully with message "Logged out successfully"
