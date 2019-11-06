Feature: Nop commerce Demo Register feature
  As a user I should succesfully register on Nop commerce Demo website

  Scenario: User should successfully register
    Given  I should be on homepage
    When   I should click on register link
    And  click on 'Gender' radio button
    And enter first name "Vijay" into first name field
    And enter last name "Patel" in to last name field
    And select day "26" from DOB field
    And selece month "5" from DOB field
    And selece year "1985" from DOB field
    And enter email address
    And enter company name "ABC infotech" into company name field
    And selece newsletter field
    And enter "abc123" into password field
    And enter "abc123" into confirm password
    And click on register button
    Then I should successfully register with nop commerce