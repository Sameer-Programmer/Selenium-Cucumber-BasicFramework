Feature: OrangeHRM - login
  Scenario: verify the presence on Orange HRM page

    Given launch the browser
    When login the orangehrm
    Then verify the presence of Logo on home page
    Then close the browser
