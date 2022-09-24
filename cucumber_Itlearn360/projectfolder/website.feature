
Feature: feature login feature and search  website for test

  Scenario: Login and search courses
    Given  I am on the website "https://www.itlearn360.com/" 
    Then I search for "Automation Testing for TestNG "
    And I click on Free courses
    Then I click on Loginbutton
   When I type username = " lamxim" and password = "Abcdefgh1234"
   Then I click on login
   And I will click on Allcourses
    Then I will click on f
    Then I will click on Free courses
    And I will click on Online Classes
    Then I will click on Blog
    And I will click on Jobs
    Then I will click on  ITlearn360
    And I will click on in
    And I will click on Youtube
    
    
    
    
    
    
    