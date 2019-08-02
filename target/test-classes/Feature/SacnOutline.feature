Feature: User tarrif page
  I want to use this template for my feature file

  Scenario Outline: User  details
    Given User is in telecom page.
    When User is filling all the all details,"<rental1>","<local_minutes>","<inter_minutes>","<sms_pack>","<minutes_charges>","<inter_charges>","<sms_charges>"
    And User clik on submit button
    Then User should get a confirmation message..
    

    Examples: 
      | rental1 | local_minutes | inter_minutes | sms_pack | minutes_charges | inter_charges | sms_charges |
      |      12 |             3 |             5 |        6 |               8 |             0 |           1 |
      |      12 |            34 |            55 |        6 |               7 |             9 |          56 |
      |       3 |             4 |            76 |        8 |               8 |             6 |           3 |
      |      45 |            65 |            76 |       67 |               2 |            45 |          21 |
