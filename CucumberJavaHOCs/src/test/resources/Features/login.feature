Feature: Login page 
Scenario: Check login is successful 

Given User is on Hocs login page
When User Enter Employee Email address
And User Enter Employee Password 
And User click on Login button
Then Use should be navigate to Dashboard Page 
And Click on Sign out button 
