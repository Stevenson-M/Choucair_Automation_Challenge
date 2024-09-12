Feature: Recruitment Process

  Scenario: Hire a new candidate
    Given I am on the OrangeHRM login page
    When I log in with the following credentials:
      | Username | Password |
      | Admin    | admin123 |
    And I navigate to the Recruitment menu
    And I add a new candidate with the following details:
      | Full Name | Middle Name | Last Name | Email             | Contact Number | Keywords | Notes          |
      | Tester    | Automated   | Testing   | test@gmail.com    | 0987654321     | QA       | Strong skills  |
    And I finish the complete the hiring process using the following details:
      | Interview Title | Interviewer         | Date       |
      | Test Interview  | a                   | 2024-09-09 |
    Then I should see the candidate details as follows:
      | Name                    | Vacancy | Status |
      | Tester Automated Testing | test    | Hired  |






