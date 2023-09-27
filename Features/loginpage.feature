@loginpage
Feature: Customer Login & Register

  @register
  Scenario: To verify register functionality
    Given I navigate to nopCommerce web page
    When I click on register button of profile icon
    When I fill all the input with below values
      | FirstName | LastName  | Email             | ConfirmEmail      | Usename    |
      | Lipsta    | Mohapatra | lipsita@gmail.com | lipsita@gmail.com | Lipsita321 |
    When I click on check avaibility button
    When I select country "India" from dropdown
    When I select timezone "(UTC-10:00) Hawaii" from dropdown
    And I fill password fields with below values
      | password  | confirmPassword |
      | abcd@1234 | abcd@1234       |
    When I select your account details mycomany "Other" from dropdown
    When I select your account details mainactivity "Technical developer" from dropdown
    When I select your account details companysize "2–5" from dropdown
    And I enter my company website "yyy.com"
    Then I click on register button

  @login
  Scenario Outline: To verify login functionality
    Given I navigate to nopCommerce web page
    When I click on login button of profile icon
    When I enter username "<username>" and password "<password>"
    Then I click on login button

    Examples: 
      | username | password |
      | abcd@123 | pwd@123  |
