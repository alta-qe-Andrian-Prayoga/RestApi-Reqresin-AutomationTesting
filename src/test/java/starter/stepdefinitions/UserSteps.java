package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;
import starter.user.Post;

public class UserSteps {
    @Steps
    Get get;
    @Steps
    Post post;

    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void sendGETHTTPRequest() {
        get.sendGetHtppRequest();
    }

    @Then("I recieve valid HTTP responese code {int}")
    public void recieveValidHttpResponese(int arg0) {
        get.validateHttpResponseCode200();
    }

    @And("I recieve valid data for detail user")
    public void recieveValidDataForDetailUser() {
        get.validateDataDetailUser();
    }


    @Given("I set POST api endpoints")
    public void iSetPOSTApiEndpoints() {
        post.setApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        post.sendPostHttpRequest();
    }

    @Then("Irecieve valid HTTP response code {int}")
    public void irecieveValidHTTPResponseCode(int arg0) {
        post.validateHttpResponseCode201();
    }

    @And("I recieve valid data for new user")
    public void iRecieveValidDataForNewUser() {
        post.validateDataNewUser();
    }
}
