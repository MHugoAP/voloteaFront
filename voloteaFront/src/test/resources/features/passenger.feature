Feature: Enter Passengers
  As AQ Automation
  I want to enter passager
  To validate that all passengers have been entered

  Scenario Outline: Enter Passengers Successfully

    Given enter the volotea official page
    And accept cookies and selct the button Passagers
    When the user clicks the plus button to select more passengers '<adult>', '<child>', '<baby>'
    Then validate that the number of passengers is well selected '<adult>', '<child>', '<baby>' Reservas de grupos

    Examples:
      | adult | child | baby |
      | 1     | 1     | 1    |
      | 4     | 2     | 4    |
      | 6     | 4     | 6    |
      | 8     | 2     | 4    |