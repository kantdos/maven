Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking Page
When User login into application with User "Jin" and "1234"
Then Home page is populated
And Cards displayed "true"

Scenario: Home page default login
Given User is on Netbanking Page
When User login into application with User "John" and "1231"
Then Home page is populated
And Cards displayed "false"