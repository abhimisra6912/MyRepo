Feature: Search Functionality

	@Smoke
  Scenario Outline: Search functionality of Google.com
    Given : User is on the search page
    When : User enters IBM on Search page
    And : Click on Search button
    Then : Search result is displayed
    
   Examples:
   
   |China|
   |India|
    
