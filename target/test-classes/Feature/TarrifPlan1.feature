Feature: Cust Tarrif Plan
  I want to use this template for my feature file

  Scenario outline: Tarrif details
    Given User is in telecom home page..
    And User click on add tarrif.
    When User is filling the form......
      | rental1 | local_minutes | inter_minutes | sms_pack | minutes_charges | inter_charges | sms_charges |
      |      12 |            11 |           145 |      123 |              56 |            12 |         123 |
      |     121 |            11 |           145 |       12 |               5 |            16 |          10 |
      |      12 |           119 |           145 |      123 |              59 |            12 |          19 |
      |      12 |            11 |           148 |      128 |              56 |            12 |          13 |
    And User click on submit.
    Then User should get a confirmation message.
    And User click on home button.
