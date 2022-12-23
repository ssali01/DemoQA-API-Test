package com.demoqa.step_defs;

import com.demoqa.utils.ConfigurationReader;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class Hooks { // runs before and after every scenario

    @Before
    public void setUpApiRequest(){
        RestAssured.baseURI = ConfigurationReader.getProperty("apiUrl");
    }
}
