Feature: Validating the Queue page and its features

  #@Queue
  #Scenario: The user is logged in to DS Algo portal
    #Given The user is on Signin page of DS Algo portal
    #When The user enter valid username "utest_sdet00" and password "temp12!@"
    #Then The user clicks on login button

  @Queue
  Scenario: Validating the Queue page features
    When User clicks on the Get Started button inside Queue frame
    Then User should be navigated to Queue home page
    When User clicks on the Implementation of Queue in Python link
    Then user should be navigated to Implementation of Queue in Python page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Queue
  Scenario Outline: Verifying valid code in the text editor - Implementation of Queue in Python
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Queue
  Scenario Outline: Verifying invalid code in the text editor - Implementation of Queue in Python
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Queue
  Scenario: Validating Implementation using collections.deque and its features
    When User clicks on the Implementation using collections.deque link
    Then user should be navigated to Implementation using collections.deque page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Queue
  Scenario Outline: Verifying valid code in the text editor - Implementation using collections.deque
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Queue
  Scenario Outline: Verifying invalid code in the text editor - Implementation using collections.deque
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Queue
  Scenario: Validating Implementation using array and its features
    When User clicks on the Implementation using array link
    Then user should be navigated to Implementation using array page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Queue
  Scenario Outline: Verifying valid code in the text editor - Implementation using array
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Queue
  Scenario Outline: Verifying invalid code in the text editor - Implementation using array
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Queue
  Scenario: Validating Queue Operations and its features
    When User clicks on the Queue Operations link
    Then user should be navigated to Queue Operations page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Queue
  Scenario Outline: Verifying valid code in the text editor - Implementation using array
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Queue
  Scenario Outline: Verifying invalid code in the text editor - Implementation using array
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |
