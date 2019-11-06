Feature: leicester.gov.uk click on myaccount link

  As a user I want to click on myaccount link on leicester.gov.uk

  Scenario: User should open myaccount link successfully
    Given I should open homepage
    When  I should click on myaccount link
    Then  I should navigate to myaccount page successfully