@books
Feature: Book parameter type

  @bookList
  Scenario: book example
    #Given Gulliver's travels is my favorite book
    Given I like the following books
      | Atlas shrugged  |   201222 |
      | Das Kapital     | 20121112 |
      | Winnie the Pooh |  2013445 |

  @bookList
  Scenario: airports
    Given the following airports
      |      | lat   | lon  |
      | KMSY |   123 |  456 |
      | KSFO | 43333 | 3838 |

  Scenario: blabla
