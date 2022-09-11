Feature: Enter Origin Destiny
  As AQ Automation
  I want to enter Origin Destiny
  To select the flight I want to take

  Scenario Outline: Enter Origin Destiny

    Given enter the volotea official page
    And accept cookies and selct the button Passagers
    When the user clicks the plus button to select more passengers '<adult>', '<baby>'
    Then we validate the number of passengers '<adult>', '<baby>' Reservas de grupos

    Examples:
      | adult | baby |
      | 1     | 1    |
      | 10    | 10   |