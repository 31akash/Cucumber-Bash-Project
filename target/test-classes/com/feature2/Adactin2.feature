Feature: Checking the booking functionality of Adactin hotel app
Scenario Outline: user checking the login functionality using combinations of username and password
Given user launch the application
When user enter the  valid "<username>" in the field
And user enter   valid "<password>" in the field
Then user clicks the login button

Examples:
|username| | password |
|aak| |87865|
|akash| |1234|
|akas| |777|
|Akashadc7| |FC36LU|