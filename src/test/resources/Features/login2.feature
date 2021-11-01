Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: |
    | username | password |
    | standard_user | 12345 |
    | locked_out_user | 12345 |
    | problem_user | 12345 |
    | performance_glitch_user | 123456 |
    | Tufail | 12345 |
    
    
      @servicetest
  Scenario: TestingLoginService
    Given
    When
    And
    Then
    And