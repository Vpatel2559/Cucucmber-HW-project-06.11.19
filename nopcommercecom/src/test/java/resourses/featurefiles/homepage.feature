Feature: Nop commerce Demo Register feature
  As a user I should succesfully register on Nop commerce Demo website

  Scenario: User should successfully open homepage
    Given I should open browser
    When  I should enter https://demo.nopcommerce.com/ and press enter
    And   I should click on computer link
    And   I should click on electronics link
    Then  electronics page should be open

