Feature: Amazon.co.uk login feature

  Scenario: As a user, I should successfully click on login link
    Given I am amazon homepage
    When I shold click on login link
    Then  I should successfully navigate to login page