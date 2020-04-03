Feature: Client sign up to portal

  Scenario: Client sign up with valid data
    Given open registration form
    When client fill all form with valid data


    Scenario: Client sign up by API
      Given create user by API