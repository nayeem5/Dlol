Feature: Facebook login page

In order to login facebook
   as          a user
   I want to   open a browser,go to facebook login  page,type user name,password,then press login button.
   
Scenario: Facebook login page (Positive scenario)
Given user open facebook loginn page
When user enter valid user id and password and click login button
Then Facebook homepage should appear for that user.
 
 