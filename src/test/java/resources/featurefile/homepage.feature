Feature: Home Page

  As a user I want to verify Job Search using different data set

  Scenario Outline: User should be to verify jobsearch using different data set

    Given user on HomePage
    When User accept cookies
    And User enter job title "<jobTitle>"
    And User enter Location "<location>"
    And user to select distance "<distance>"
    And user to click on moreSearchOptionsLink
    And user to enter salaryMin "<salaryMin>"
    And user to enter salaryMax "<salaryMax>"
    And user to select salaryType "<salaryType>"
    And user to select jobType "<jobType>"
    And user click on Find Jobs button
    Then User verify the result "<result>"




    Examples:
      | jobTitle        | location                | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                        |
      | Tester          | Harrow Green, Suffolk   | up to 5 miles  | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Harrow Green         |
      | Dentist         | London                  | up to 10 miles | 100000    | 200000    | Per annum  | Permanent | Permanent Dentist jobs in London              |
      | Maths Teacher   | Birmingham              | up to 15 miles | 30000     | 40000     | Per annum  | Temporary | Temporary Maths Teacher jobs in Birmingham    |
      | Physiotherapist | Leeds                   | up to 35 miles | 30000     | 60000     | Per annum  | Permanent | Permanent Physiotherapist jobs in Leeds       |
      | Civil Engineer  | London                  | up to 5 miles  | 2000      | 3000      | Per month  |Contract   | Contract Civil Engineer jobs in London        |
      | Bus Driver      | Brixton, Greater London | up to 7 miles  | 20000     | 30000     | Per annum  | Any       | Bus Driver jobs in Brixton                    |
