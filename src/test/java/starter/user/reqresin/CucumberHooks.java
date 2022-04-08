package starter.user.reqresin;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    public void Before(){
        System.out.println("Ini selalu di eksekusi sebelum test");
    }

    public void After(){
        System.out.println("Delete data testing di database");
    }
}
