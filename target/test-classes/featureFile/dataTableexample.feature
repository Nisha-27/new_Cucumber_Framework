Feature: validating the steps with datatable

  Scenario: passing data in one step using DataTable
    Given I want pass the data
      | hello   |
      | Hi      |
      | Chennai |
      |    1234 |
    Then the data has been passed

  Scenario: passing multiple data in one step using DataTable
    Given I want pass multiple column of datas
      | hello   | world       | thanks |
      | Hi      | how are you | friend |
      | Chennai | Welcome     | Play   |
      |    1234 |       98645 | Bye    |
    Then the data has been passed

  
  Scenario: passing data with single heading in a step using DataTable
    Given I want pass data with heading
      | name | Abi |
      | id   | 001 |
      | mark |  76 |
    Then the data has been passed
@outline
  Scenario: passing data with single heading with multiple value in a step using DataTable
    Given I want pass heading with mulitple value
      | name   | id  | mark |
      | Abi    | 001 |   78 |
      | Nisha  | 005 |   54 |
      | Dinesh | 004 |   87 |
    Then the data has been passed
