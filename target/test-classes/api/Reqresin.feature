@Andre
Feature: Reqresin

  @GET
  Scenario: Success GET Users
    When user send GET Users request to reqresin
    Then response status code should be 200
    And response structure should match json schema "users.json"

  @POST
  Scenario: Success POST login
    When user send POST login request to reqresin with body json "succes-login"

    Then response status code should be 200
    And response structure should match json schema "login.json"

  Scenario: Failed POST login
    When user send POST login request to reqresin with body json "failed-login.json"

    Then response status code should be 400


  @PUT
  Scenario: Success PUT update
    When  user send PUT Update request to reqresin
    Then response status code should be 200
    And response structure should match json schema "update-user.json"

  @DELETE
  Scenario: Success DELETE user
    When  user send DELETE request to reqresin
    Then response status code should be 204

  @POST
  Scenario: Unsuccess POST Register
    When  user send POST unsuccess register request to reqresin
    Then response status code should be 400
    And response structure should match json schema "unsuccess-register.json"

  @POST
  Scenario: Success POST Register
    When  user send POST success register request to reqresin
    Then response status code should be 200
    And response structure should match json schema "success-register.json"

  @POST
  Scenario: Success POST Create
    When  user send POST create request to reqresin
    Then response status code should be 201
    And response structure should match json schema "create.json"