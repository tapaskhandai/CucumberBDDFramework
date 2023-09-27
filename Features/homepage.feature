@homepage
Feature: HomePage feature

  @addnewcustomer
  Scenario Outline: To verify adding new adress functionality
    Given I navigate to nopCommerce web page
    When I click on login button of profile icon
    When I enter username "<username>" and password "<password>"
    Then I click on login button
    When I click on My Account button
    And I clcik on Adresses option
    And I enter the required details
    And I click on save button

    Examples: 
      | username | password |
      | Jitun123 | abcd@123 |
