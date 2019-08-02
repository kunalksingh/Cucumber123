Feature: Tarrif plan
  I want to use this template for my feature file

  Scenario: Tarrif plan details
    Given User is in telecom home page.
    And User click on add tarrif
    When User is filling the form
    And User click on submit
    Then User should get a confirmation message
    And User click on home button
