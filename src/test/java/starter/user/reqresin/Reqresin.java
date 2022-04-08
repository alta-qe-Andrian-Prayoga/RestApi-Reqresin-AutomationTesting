package starter.user.reqresin;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

import java.io.File;

public class Reqresin {
    private static final  String REQRESIN_BASEURL = "https://reqres.in";

    public void getListUser(){
        SerenityRest.get(REQRESIN_BASEURL + "/api/users?page=2");
    }

    public  void  postlogin(){

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "cityslicka");

        SerenityRest.given().header("Content-type", "application/json").body(bodyJson.toString()).post(REQRESIN_BASEURL + "/api/login");
    }

    public  void  postloginWithParam(String Jsonpath){

        File bodyJson = new File(String.format("src/test/resources/payload/%s", Jsonpath));

        SerenityRest.given().header("Content-type", "application/json").body(bodyJson.toString()).post(REQRESIN_BASEURL + "/api/login");
    }

    public  void  putUpdate(){

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "zion resident");
        bodyJson.put("updatedAt", "2022-04");

        SerenityRest.given().header("Content-type", "application/json").body(bodyJson.toString()).put(REQRESIN_BASEURL + "/api/users/2");
    }

    public  void  deleteUser(){
        SerenityRest.delete(REQRESIN_BASEURL + "/api/users/2");
    }

    public  void  postUnsuccessRegister(){

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "sydney@fife");

        SerenityRest.given().header("Content-type", "application/json").body(bodyJson.toString()).post(REQRESIN_BASEURL + "/api/register");
    }

    public  void  postSuccessRegister(){

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "pistol");

        SerenityRest.given().header("Content-type", "application/json").body(bodyJson.toString()).post(REQRESIN_BASEURL + "/api/register");
    }

    public void postCreate(){

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "leader");
        bodyJson.put("updatedAt", "2022-04");

        SerenityRest.given().header("Content-type", "application/json").body(bodyJson.toString()).post(REQRESIN_BASEURL + "/api/users");
    }
}
