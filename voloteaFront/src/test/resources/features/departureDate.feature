Feature: Departure Date
  Aa QA Automation
  I want Select departure date
  To indicate when I want to travel

  Background:
    Given enter the volotea official page
    And accept cookies and selct the button Passagers

  Scenario Outline:
    When the user clicks the plus button to select more passengers '<adult>', '<child>', '<baby>'
    When we select the origin and destination <origin>, <destiny>

    And i want to Select the departure date Indicate when I want to travel

    Examples:
      | adult | child | baby | origin     | destiny    |
      | 4     | 2     | 4    | "Asturias" | "Alicante" |
