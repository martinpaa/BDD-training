Feature: ServiceAccount

  Scenario: Manage the account and report movements
    Given a client makes a deposit of 1000 on 10-01-2012
    And a client makes a deposit of 2000 on 13-01-2012
    And a withdrawal of 500 on 14-01-2012
    When they print their bank statement
    Then they would see: 'Date       | Amount | Balance'
