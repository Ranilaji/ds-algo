
Feature: Stack

  @stack
  Scenario: Validate Stack page
    Given User is logged in to HomePage
    When User clicks on Get Started button on Stack panel
    Then User is navigated to the Stack page

  @stack
  Scenario: Validate 'Operations in Stack' link
    Given User is in Stack page
    When User clicks on Operations in Stack link
    Then User is navigated to the Operations in Stack page

  @stack
  Scenario Outline: Validate  python code for 'Operations in Stack' tryEditor
    Given User is in Operations in Stack Page
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then Valid output for TryEditor is displayed
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @stack
  Scenario Outline: Validation invalid python code for 'Operations in Stack' TryEditor
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters invalid Python code from sheet "<Sheetname>" and <RowNumber>
    And Clicks on the Run button
    Then User should be able to see error message
    And User navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythoncode |         2 |

  @stack
  Scenario: Validate 'Implementation' link
    Given User is in Stack page
    When User clicks on Implementation link
    Then User is navigated to the Implementation page

  @stack
  Scenario Outline: Validate  python code for 'Implementation' tryEditor
    Given User is in Implementation Page
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then Valid output for TryEditor is displayed
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @stack
  Scenario Outline: Validation invalid python code for 'Implementation' TryEditor
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters invalid Python code from sheet "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then User should be able to see error message
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @stack
  Scenario: Validate 'Applications' link
    Given User is in Stack page
    When User clicks on Applications link
    Then User is navigated to the Applications page

  @stack
  Scenario Outline: Validate  python code for 'Applications' tryEditor
    Given User is in Applications Page
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then Valid output for TryEditor is displayed
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @stack
  Scenario Outline: Validation invalid python code for 'Applications' TryEditor
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters invalid Python code from sheet "<Sheetname>" and <RowNumber>
    And Clicks on the Run button
    Then User should be able to see error message
    And User navigates back

    Examples: 
      | Sheetname  | RowNumber |
      | pythoncode |         2 |
