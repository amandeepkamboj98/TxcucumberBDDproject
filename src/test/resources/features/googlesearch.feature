Feature: Test google search functionality

  Scenario: check google is working
    Given brower is open
    When user navigates to google home page
    And enters text in searchbox
    And clicks on search button or hits enter
    Then search result page is displayed
