Feature: checking the booking functionality of the adactin hotel app
Scenario: user checking the login page using valid usename and password
Given user launch the application
When user enters the valid username in the field
And user enters the valid password in the field
Then user clicks the login button



Scenario: user checks the booking functionality
Given user navigates to booking psge
When user selects the location
And user selects the hotel
And user selects the room type
And user selects the number of rooms
And user selects  the checkin date
And user selects the checkout date
And user selects the number of adults
And user selects the number of childs
And user clicks the search  button
And user clicks the confirm button
And user clicks the continue button
And user types the first name
And user types the last name
And user types the address
And user types the credit card number
And user selects the card type
And user selects the expiry month
And user selects the expiry year
And user types the cvv
And user clicks the booknow button  