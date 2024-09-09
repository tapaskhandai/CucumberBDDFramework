@homepage
Feature: HomePage feature

  @TC_02
  Scenario Outline: To verify user logs out successfully
    Given I navigate to orangeHRM url
    When I enter user "<username>" and password "<password>"
    When I click on login-submit button
    Then I verify user logs out from homepage
    When I click on login-submit button

    Examples: 
      | username | password |
      | Admin    | admin123 |
