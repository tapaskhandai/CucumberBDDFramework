@loginpage
Feature: Login Functionality

  @TC_01
  Scenario: Verify user login scenarios
    Given I navigate to orangeHRM url
    When I enter user "Admin" and password "admin123"
    When I click on login-submit button
    Then I verify title of the home page
    #When I fill all the input with below values
      #| FirstName | LastName  | Email             | ConfirmEmail      | Usename    |
      #| Lipsta    | Mohapatra | lipsita@gmail.com | lipsita@gmail.com | Lipsita321 |
    #When I select country "India" from dropdown
    #And I fill password fields with below values
      #| password  | confirmPassword |
      #| abcd@1234 | abcd@1234       |
    #When I select your account details mycomany "Other" from dropdown
