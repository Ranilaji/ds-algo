Feature: Array

@array01 
Scenario: Validate Array page
Given User is logged in to HomePage
When User clicks on Get Started button on Array panel
Then User is navigated to the Array page

@array01
Scenario: Validate 'Arrays in Python' link
Given User is in Array page
When User clicks on Arrays in Python link
Then User is navigated to the Arrays in Python page

@array01 
Scenario: Validate 'Arrays Using List' link
Given User is in Array page
When User clicks on the Array Using List link
Then User is navigated to the Arrays using list page

#@array01 
#Scenario: Validate 'Basic Operations in List' link
#Given User is in Array page 
#When User clicks on the Basic Operations in List link
#Then User is navigated to the Basic operations in list page

@array01 
Scenario: Validate 'Applications of Array' link
Given User is in Array page 
When User clicks on the Applications of array link
Then User is navigated to the Applications of array page

@array01
Scenario Outline: Validate  python code for Arrays in Python TryEditor
Given User is in  Arrays in Python page
When User clicks on the Try Here button 
Then User is navigated to the page with title "Assessment"
When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
And Clicks on the Run button
Then Valid output for TryEditor is displayed
And User navigates back
 Examples: 
 | Sheetname  | Rownumber |
 | pythoncode |         1 |

@array01
Scenario Outline: Validation invalid python code for Arrays in Python TryEditor
	Given User is on Try Editor Page
	When User enters invalid Python code from sheet "<Sheetname>" and <Rownumber> 
	And Clicks on the Run button 
	Then User should be able to see error message 
	And User navigates back
	Examples: 
		|Sheetname	|	Rownumber	|
		|pythoncode	|	    		2	|

@array01
Scenario Outline: Validate  python code for Arrays using List TryEditor
Given User is in  Arrays using List page
When User clicks on the Try Here button 
Then User is navigated to the page with title "Assessment"
When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
And Clicks on the Run button
Then Valid output for TryEditor is displayed
And User navigates back
 Examples: 
 | Sheetname  | Rownumber |
 | pythoncode |    1      |
 
 @array01
 Scenario Outline: Validation invalid python code for Arrays using List TryEditor
	Given User is in  Arrays using List page
  When User clicks on the Try Here button 
  Then User is navigated to the page with title "Assessment"
	When User enters invalid Python code from sheet "<Sheetname>" and <Rownumber> 
	And Clicks on the Run button 
	Then User should be able to see error message 
	And User navigates back
	Examples: 
		|Sheetname	|	Rownumber	|
		|pythoncode	|	    2			|
 
 @array01
Scenario Outline: Validate  python code for Basic Operations in List TryEditor
Given User is in  Basic operations in List page
When User clicks on the Try Here button 
Then User is navigated to the page with title "Assessment"
When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
And Clicks on the Run button
Then Valid output for TryEditor is displayed
And User navigates back
 Examples: 
 | Sheetname  | Rownumber |
 | pythoncode |    1      |
 
 @array01
 Scenario Outline: Validation invalid python code for Basic operations in List TryEditor
	Given User is in  Basic operations in List page
  When User clicks on the Try Here button 
  Then User is navigated to the page with title "Assessment"
	When User enters invalid Python code from sheet "<Sheetname>" and <Rownumber> 
	And Clicks on the Run button 
	Then User should be able to see error message 
	And User navigates back
	Examples: 
		|Sheetname	|	Rownumber	|
		|pythoncode	|	    2			|
		
  @array01
Scenario Outline: Validate  python code for Applications of Array TryEditor
Given User is in  Applications of Array page
When User clicks on the Try Here button 
Then User is navigated to the page with title "Assessment"
When User enters valid Python code in Try Editor from "<Sheetname>" and <Rownumber>
And Clicks on the Run button
Then Valid output for TryEditor is displayed
And User navigates back
 Examples: 
 | Sheetname  | Rownumber |
 | pythoncode |    1      |
 
 @array01
 Scenario Outline: Validation invalid python code for Applications of Array TryEditor
	Given User is in  Applications of Array page
  When User clicks on the Try Here button 
  Then User is navigated to the page with title "Assessment"
	When User enters invalid Python code from sheet "<Sheetname>" and <Rownumber> 
	And Clicks on the Run button 
	Then User should be able to see error message 
	And User navigates back
	Examples: 
		|Sheetname	|	Rownumber	|
		|pythoncode	|	    2			|
		
	@array01	
	Scenario: Validate 'Practice Questions' link	
  Given User is in  Applications of Array page
  When User clicks on the Practice Questions link
  Then User is navigated to the Practice Questions page 
   
   @array01
   Scenario Outline: Validate TryEditor for 'Search for array' in Practice Questions
   Given User is in practice questions page 
   When User clicks on Search the Array link
   When User enters valid python practice  code from "<Sheetname>" and <Rownumber>
   And Clicks on the Run button
   Then Valid output for TryEditor is displayed
   Examples: 
		|Sheetname	|	Rownumber	|
		|pythoncode	|	    3			|
		
		@array01
	 Scenario Outline: Validate TryEditor for 'Max consecutive ones' in Practice Questions
   Given User is in practice questions page 
   When User clicks on Max consecutive ones link
   When User enters valid python practice  code from "<Sheetname>" and <RowNumber>
   And Clicks on the Run button
   Then Valid output for TryEditor is displayed
   And User navigates back
   
   Examples: 
		|Sheetname	|	RowNumber	|
		|PythonCode	|	    4			|
		
	@array01
	Scenario Outline: Validate TryEditor for 'Find Numbers with Even number of digits' in Practice Questions
   Given User is in practice questions page 
   When User clicks on Even no of digits  link
   When User enters valid python practice  code from "<Sheetname>" and <RowNumber>
   And Clicks on the Run button
   Then Valid output for TryEditor is displayed
   And User navigates back
   
   Examples: 
		|Sheetname	|	RowNumber	|
		|PythonCode	|	      5		|
		
		@array01
		Scenario Outline: Validate TryEditor for 'Squares of a sorted array' in Practice Questions
   Given User is in practice questions page 
   When User clicks on Squares of a sorted array  link
   When User enters valid python practice  code from "<Sheetname>" and <RowNumber>
   And Clicks on the Run button
   Then Valid output for TryEditor is displayed
   And User navigates back
   
   Examples: 
		|Sheetname	|	RowNumber	|
		|PythonCode	|	     6		|		