Feature: Login to appwith data
Scenario: Login with correct credentials
Given I am at landing page
When I enter the username as "testusername"
And I enter the password as "Test@1234"
And I click on submit button
Then I should get logged into app
