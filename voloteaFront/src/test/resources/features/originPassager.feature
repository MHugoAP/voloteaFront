Feature: Enter Origin Destiny
  As AQ Automation
  I want to enter Origin Destiny
  To select the flight I want to take

  Scenario Outline: Enter Origin Destiny

    Given enter the volotea official page
    And accept cookies and selct the button Passagers
    When the user clicks the plus button to select more passengers '<adult>', '<child>', '<baby>'
    When we select the origin and destination <origin>, <destiny>
    Then we validate the selected routes

    Examples:
      | adult | child | baby | origin     | destiny     |
      | 4     | 2     | 4    | "Asturias" | "Alicante"  |
      | 6     | 4     | 6    | "OVD"      | "ALC"       |
      | 2     | 2     | 2    | "Tlemcen"  | "asdfgh"    |
      | 3     | 2     | 3    | "Zaragoza" | "merosdooe" |
      | 5     | 5     | 5    | "Limoges"  | "Ajaccio"   |
      | 12    | 12    | 11   | "KLX"      | "CDG"       |