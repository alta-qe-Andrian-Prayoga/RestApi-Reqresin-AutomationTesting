package starter.stepdefinitions.reqresin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.user.reqresin.Reqresin;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class ReqresinStepDef {
    Reqresin reqresin = new Reqresin();

    @And("user send PUT Update request to reqresin")
    public void putUpdate(){
        reqresin.putUpdate();
    }

    @And("user send POST login request to reqresin")
    public void postlogin(){
        reqresin.postlogin();
    }

    @And("user send POST create request to reqresin")
    public void postCreate(){
        reqresin.postCreate();
    }

    @And("user send GET Users request to reqresin")
    public void getUsers(){
        reqresin.getListUser();
    }

    @And("user send DELETE request to reqresin")
    public void deleteUser(){
        reqresin.deleteUser();
    }

    @And("user send POST unsuccess register request to reqresin")
    public void postUnsuccessRegister(){
        reqresin.postUnsuccessRegister();
    }

    @And("user send POST success register request to reqresin")
    public void postSuccessRegister(){
        reqresin.postSuccessRegister();
    }

    @Then("response status code should be {int}")
    public void statusCodeValidation(int statusCode){
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Then("^response path \"([^\"]*)\" should contain Int value \"(^\"]*)\"$")
    public void responseDataValidationInt(String path, String value){
        restAssuredThat(response -> response.body(path, equalTo(Integer.parseInt(value))));
    }

    @Then("^response path \"([^\"]*)\" should contain String value \"(^\"]*)\"$")
    public void responseDataValidationString(String path, String value){
        restAssuredThat(response -> response.body(path, equalTo(Integer.parseInt(value))));
    }


    @And("response structure should match json schema {string}")
    public void responseStructureShouldMatchJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }

    @When("user send POST login request to reqresin with body json {string}")
    public void userSendPOSTLoginRequestToReqresinWithBodyJson(String Jsonpath) {
        reqresin.postloginWithParam(Jsonpath);
    }
}
