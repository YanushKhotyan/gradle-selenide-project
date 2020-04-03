Feature: Client sign in to portal

  Scenario: Client login to portal 1
    Given open home page and click "Начать работу" button
    When Client login with data "testLecturer" and password "testLecturer"
    Then Client has been login on portal

