Feature: SignUp and Create Account

  Scenario:Sign up at salesforce test
    Given salesforce test Website
    When user click on signup link
    And user enter "fName" as firstname and "lName" as Lastname
    And user enter "title" as Job title
    And user click on next
    And user enter "100" as no of employees in company
    And user enter "company" as company name
    And user enter "India" as country
    And user click on next
    And user enter "9898656532" as phone no
    And user enter "akshayglasswala@yahoo.com" as email
    And user select service agrement
    Then user click on submit button

  Scenario: Sign up email verification test
    When user enter email url
    And user enter "akshayglasswala" as email id
    And user enter "Test@1234" as password
    And user open verify account email
    And user click on verify account link
    And user set "Test1234" new password for an account
    And user set security "2" as que and "Temp" as answer
    And user click on submit on set password page
    Then user validate signup successfully

  Scenario: As logged in user Create account at salesforce
    When user login at salesforce
    And user click on account link
    And user click on create new company
    And user enter "Company" as account company name
    And user enter "9852524152" as account phone no
    And user enter "Partner" as company role
    And user enter "Count" as no of employees
    And user enter "Electronics" as industry type
    And user enter "desc" as company description
    And user enter "street" as billing street
    And user enter "state" as billing state
    And user enter "postcode" as billing post code
    And user enter "Country" as billing country
    And user enter "street" as shipping street
    And user enter "state" as shipping state
    And user enter "postcode" as shipping post code
    And user enter "Country" as shipping country
    And user click on save button
    Then user validate account is created

  Scenario: As logged in user edit account at salesforce
    When user click on edit account link
    And user enter "Edit Company" as account company name
    And user enter "9858525254" as account phone no
    And user enter "Investor" as company role
    And user enter "Count" as no of employees
    And user enter "Energy" as industry type
    And user enter "desc" as company description
    And user enter "street" as billing street
    And user enter "state" as billing state
    And user enter "postcode" as billing post code
    And user enter "Country" as billing country
    And user enter "street" as shipping street
    And user enter "state" as shipping state
    And user enter "postcode" as shipping post code
    And user enter "Country" as shipping country
    And user click on save button
    And user validate account is edited


