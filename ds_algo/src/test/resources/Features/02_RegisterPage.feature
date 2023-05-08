Feature: Register

  @Register
  Scenario: Navigating  to register page from ds-algo portal
    Given User launches ds-algo portal link
    When User clicks on get started button
    And Clicks on Register link
    Then User should be successfully navigated to Register page

  @Register
  Scenario: Navigating to Login page from Register page
    Given User launches Register page
    When User clicks on Login link
    Then User should be successfully navigated to Login page

  @Register01
  Scenario: Successful registration with valid username and password
    Given User launches Register page
    When User enter  valid username, password and password confirmation
      | utest_sdet00 | temp12!@ | temp12!@ |
    And Clicks on the Register button
    Then User should be able successfully registered with the success message "New Account Created."

  @Register
  Scenario: Validating registration with empty fields
    Given User launches Register page
    When User clicks on Register button without entering Username, password and confirm password fields
    Then User should see a pop-up text below Username field "Please fill out this field."

  @Register
  Scenario Outline: Validating registration with valid username and empty password field
    Given User launches Register page
    When User clicks on Register button entering valid "<username>" and empty password field
    Then User should see a pop-up text under password field "Please fill out this field."

    Examples: 
      | username   |
      | utest_sdet |

  @Register
  Scenario Outline: Validating registration with valid username, Password and empty password confirmation field
    Given User launches Register page
    When User clicks  on Register button entering valid "<username>", "<password>" and empty  password confirmation field
    Then User should  see a pop-up text under password confirmation field "Please fill out this field."

    Examples: 
      | username   | password |
      | utest_sdet | temp12!@ |

  @Register
  Scenario Outline: Validate password mismatch
    Given User launches Register page
    When User clicks on Register button entering valid "<username>","<password>" and mismatch password in "<password confirmation>" fields
    Then User should see the error message "password_mismatch:The two password fields didn’t match."

    Examples: 
      | username   | password | password confirmation |
      | utest_sdet | temp12!@ | test1212              |

  @Register03
  Scenario: Validating registration with valid Password, Password  confirmation field and empty Username field
    Given User launches Register page
    When User clicks on Register button entering valid password, password confirmation field and empty Username field
      | password | password confirmation |
      | temp1212 | temp1212              |
    Then User should see a pop-up text under username field "Please fill out this field."
