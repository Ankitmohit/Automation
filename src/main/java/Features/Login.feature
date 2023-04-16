
Feature: Verify login functionality 

  Scenario: Verify successful login when username  and password is correct 
    Given user launch site URL 
    When user enter correct username and correct password
    And click on login button 
    Then Validate user should navigate to home page.
    
  Scenario: Verify successful login when username  and password is incorrect 
    Given user launch site URL 
    When user enter incorrect username and correct password
    And click on login button 
    Then Validate user should get error message .
       
    
