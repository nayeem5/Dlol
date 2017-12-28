@userLongin    
Feature: User logingout from flight system    

In order to reserve a flight 
As a registered user
I want to enter user name and password and click signin 
@userloginPositivetest
Scenario Outline: user logsin through valid user name and password

Given user visiting home page
When user enter "<user name>" and "<password>"
And click on signin button
Then user successfully login to the system
And user click on signoff link to logout


Examples: //data driven . 
 
|user name     | |password     |
|guest         | |guest        |
|guest         | |guest        |