Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: Get - As admin I have be able to get detail user
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I recieve valid HTTP responese code 200
    And I recieve valid data for detail user

  Scenario: POST - As admin I have be able to create bew user
    Given I set POST api endpoints
    When  I send POST HTTP request
    Then Irecieve valid HTTP response code 201
    And I recieve valid data for new user