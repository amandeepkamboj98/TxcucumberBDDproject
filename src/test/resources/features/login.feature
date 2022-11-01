Feature: test login functionality

  Scenario: test login is successful with valid credentials
    #Gherkin
    Given my browser is open
    When user goes to the login page
    And enter valid username and password
    And click on login button 
    Then search result page is displayed