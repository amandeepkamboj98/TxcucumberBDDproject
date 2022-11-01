Feature: test login functionality

  Scenario Outline: check login is successfully with valid credantial
    Given user has started the brower
    When user  goes to to the logion page
    And enters  valid <username> and <password>
    And clicks on button to login
    Then user is taken to the home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
