Feature: Cucumber expressions exercise

  Scenario Outline: 
    Given A <type> eats <amount> <food>

    Examples: 
      | type    | amount | food    |
      | user    |      5 | bananas |
      | gorilla |     10 | apples  |
      | lion    |      5 | steaks  |
