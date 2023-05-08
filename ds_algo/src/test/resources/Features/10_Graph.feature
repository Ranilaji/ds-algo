Feature: Graph

  @graph
  Scenario: Validate Graph page
    Given User is logged in to HomePage
    When User clicks on Get Started button on Graph panel
    Then User is navigated to the Graph  page

  @graph
  Scenario: Validate 'Graph' link
    When User clicks on Graph link
    Then User is navigated to the Graph practice page
    And User navigates back
  
  @graph
  Scenario: Validate 'Graph Representations' link
    When User clicks Graph Representations link
    Then User is navigated to the Graph Representations page
   
   @graph
   Scenario Outline: Validate  python code for 'Graph' tryEditor
    Given User clicks on the Graph link
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then Valid output for TryEditor is displayed
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |     1     |

   @graph
  Scenario Outline: Validation invalid python code for 'Graph' TryEditor
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters invalid Python code from sheet "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then User should be able to see error message
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |     2     |
      
    @graph
   Scenario Outline: Validate  python code for 'Graph Representations' tryEditor
    Given User clicks on Graph Representations link
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then Valid output for TryEditor is displayed
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |     1     |
      

  @graph
  Scenario Outline: Validation invalid python code for 'Graph Representations' TryEditor
    When User clicks on the Try Here button
    Then User is navigated to the page with title "Assessment"
    When User enters invalid Python code from sheet "<Sheetname>" and <Rownumber>
    And Clicks on the Run button
    Then User should be able to see error message
    And User navigates back

    Examples: 
      | Sheetname  | Rownumber |
      | PythonCode |     2     |
     
     @graph 
    Scenario: Validate Practice Question link
    When User clicks on the Practice Question link
    Then User is navigated to the Practice Question page