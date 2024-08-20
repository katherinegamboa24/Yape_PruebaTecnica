package com.bdd.yape;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class ApiUtils {
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }
    }
