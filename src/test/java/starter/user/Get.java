package starter.user;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matcher;


import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {

    public static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints")
    public String  setApiEndpoints(){
        return url + "users/2";
    }

    @Step("I send GET HTTP request")
    public  void sendGetHtppRequest(){
        SerenityRest.given().get(setApiEndpoints());
    }
    @Step("I recieve valid HTTP responese code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I recieve valid data for detail user")
    public void validateDataDetailUser(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'first_name'", equalTo("Janet")));
    }

}
