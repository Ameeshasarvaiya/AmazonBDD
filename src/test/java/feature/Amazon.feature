#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Amazon Account Creation
  

  @tag1
  Scenario: User craetes a new account on Amazon.
    Given The user is on the Amazon registration page.
    
    When The users enters their yourname as "AmishaSarvaiya".
    And The users enters their emailid as "ameeshagohel@gmail.com".
    And The users enters their password as "Nikunj1995".
    And The users enters their passwordagain as "Nikunj1995".
    And the users clicks the verify emailid button.
    Then The user should see the tilte "Authentication required".

  
