Feature: To ensure the browser open up with DS-Algo "Get Started" page
  		and clicking on Get Started button takes to home page.

  @Home
  Scenario: The user should be able to open the Ds-Algo portal home page
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage

  @Home
  Scenario Outline: User is on Home page and click getstarted button on home page without sign in
    Given The user is in Home page
    When The user clicks on Get Started button on homepage "<option>" without login
    Then The user get warning message "You are not logged in"

    Examples: 
      | option         |
      | Datastructures |
      | Arrays         |
      | Linkedlist     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |

  @Home
  Scenario: User is on Home page and click on dropdown without sign in
    Given The user is on Home page
    When The user clicks on dropdown options without login
    Then The user gets warning message "You are not logged in"

  @Home
  Scenario: User is on Home page and click on sign in
    Given The user opens Home Page
    When The user clicks Sign in link
    Then The user should be redirected to Sign in page

  @Home
  Scenario: User is on Home page and click on Register
    Given The user gets on Home Page
    When The user clicks on Register link
    Then The user should be redirected to Register form
