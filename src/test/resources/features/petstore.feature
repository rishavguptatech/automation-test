Feature: PetStore


  Scenario: This is a Test
    Given I run tests

  @Run
  Scenario Outline: Get All Pet Details By Status
    Given All the pets with "<status>" will be returned
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |
