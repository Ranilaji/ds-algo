Feature: Validating the Tree page and its features

  @Tree
  Scenario: Validating the Tree page features
    When User clicks on the Get Started button inside Tree frame
    Then User should be navigated to Tree home page
    When User clicks on the Overview of Trees link
    Then user should be navigated to Overview of Trees page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Overview of Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Overview of Trees page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Terminologies and its features
    When User clicks on the Terminologies link
    Then user should be navigated to Terminologies page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Terminologies page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Terminologies page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Types of Trees and its features
    When User clicks on the Types of Trees link
    Then user should be navigated to Types of Trees page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Types of Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Types of Trees page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Tree Traversals and its features
    When User clicks on the Tree Traversals link
    Then user should be navigated to Tree Traversals page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Tree Traversals page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Tree Traversals page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Traversals-Illustration and its features
    When User clicks on the Traversals-Illustration link
    Then user should be navigated to Traversals-Illustration page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Traversals-Illustration page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Traversals-Illustration page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Binary Trees and its features
    When User clicks on the Binary Trees link
    Then user should be navigated to Binary Trees page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Binary Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Binary Trees page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Types of Binary Trees and its features
    When User clicks on the Types of Binary Trees link
    Then user should be navigated to Types of Binary Trees page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Types of Binary Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Types of Binary Trees page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Implementation in Python and its features
    When User clicks on the Implementation in Python link
    Then user should be navigated to Implementation in Python page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Implementation in Python page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Implementation in Python page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Binary Tree Traversals and its features
    When User clicks on the Binary Tree Traversals link
    Then user should be navigated to Binary Tree Traversals page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Binary Tree Traversals page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Binary Tree Traversals page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Implementation of Binary Trees and its features
    When User clicks on the Implementation of Binary Trees link
    Then user should be navigated to Implementation of Binary Trees page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Implementation of Binary Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Implementation of Binary Trees page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Applications of Binary trees and its features
    When User clicks on the Applications of Binary trees link
    Then user should be navigated to Applications of Binary trees page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Applications of Binary trees page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Applications of Binary trees page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Binary Search Trees and its features
    When User clicks on the Binary Search Trees link
    Then user should be navigated to Binary Search Trees page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Binary Search Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Binary Search Trees page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |

  @Tree
  Scenario: Validating Implementation Of BST and its features
    When User clicks on the Implementation Of BST link
    Then user should be navigated to Implementation Of BST page
    When User clicks on the Try Here button
    Then User should be navigated to Try Editor page

  @Tree
  Scenario Outline: Verifying valid code in the text editor - Implementation Of BST page
    When User enters a valid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         1 |

  @Tree
  Scenario Outline: Verifying invalid code in the text editor - Implementation Of BST page
    When User enter an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | pythoncode |         2 |
