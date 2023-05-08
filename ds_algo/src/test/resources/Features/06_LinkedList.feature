Feature: Vadilating the LinkedList page and its features

  #@LinkedList01
  #Scenario: 
    #Given The user is on Signin page of DS Algo portal
   # When The user enter valid username "utest_sdet00" and password "temp12!@"
    #Then The user clicks on login button

  @LinkedList01
  Scenario: Validating the Linked List page features
    When User clicks on the Get Started button inside LinkedList frame
    Then User should be navigated to Linked List home page
    When User clicks on the Introduction link
    Then user should be navigated to Linked lists introduction page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  ## Introduction
  @LinkedList01
  Scenario Outline: Verifying valid code in the text editor - Intro page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @LinkedList01
  Scenario Outline: Verifying invalid code in the text editor - Intro page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @LinkedList01
  Scenario: Validating Creating Linked List link and its features
    When User clicks on the Creating Linked List link
    Then user should be navigated to Creating Linked List page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  ## Creating Linked List - Try Editor
  @LinkedList01
  Scenario Outline: Verifying valid code in the text editor in Creating Linked List -  page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @LinkedList01
  Scenario Outline: Verifying invalid code in the text editor in Creating Linked List -  page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  ##Types of Linked List
  @LinkedList01
  Scenario: Validating Types of Linked List link and its features
    When User clicks on the Types of Linked List link
    Then User should be navigated to Types of Linked List
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  ## Types of Linked List page - Try Editor
  @LinkedList01
  Scenario Outline: Verifying valid code in the text editor in Types of Linked List -  page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @LinkedList01
  Scenario Outline: Verifying invalid code in the text editor in Types of Linked List -  page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |        2 |

  ## Implement Linked List in Python
  @LinkedList01
  Scenario: Validating Implement Linked List in Python link and its features
    When User clicks on Implement Linked List in Python link
    Then User should be navigated to Implement Linked List in Python page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  ## Implement Linked List in Python page - Try Editor
  @LinkedList01
  Scenario Outline: Verifying valid code in the text editor in Implement Linked List in Python page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @LinkedList01
  Scenario Outline: Verifying invalid code in the text editor in Implement Linked List in Python page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  ## Traversal
  @LinkedList01
  Scenario: Validating Traversal link and its features
    When User clicks on the Traversal link
    Then User should be navigated to Traversal page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  ## Traversal page - Try Editor
  @LinkedList01
  Scenario Outline: Verifying valid code in the text editor in Traversal page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @LinkedList01
  Scenario Outline: Verifying invalid code in the text editor in Traversal page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  ## Insertion
  @LinkedList01
  Scenario: Validating Insertion link and its features
    When User clicks on the Insertion link
    Then User should be navigated to Insertion page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  ## Insertion page - Try Editor
  @LinkedList01
  Scenario Outline: Verifying valid code in the text editor in Insertion page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @LinkedList01
  Scenario Outline: Verifying invalid code in the text editor in Insertion page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  ## Deletion
  @LinkedList01
  Scenario: Validating Deletion link and its features
    When User clicks on the Deletion link
    Then User should be navigated to Deletion page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  ## Deletion page - Try Editor
  @LinkedList01
  Scenario Outline: Verifying valid code in the text editor in Deletion page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @LinkedList01
  Scenario Outline: Verifying invalid code in the text editor in Deletion page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |
## Practice questions
#@LinkedList
#Scenario: Validating Practice Question link and its features
#When User clicks on the Practice Questions link
#Then User should be navigated to Practice Questions page
