package com.thetestingacademy.CRUDHTTPMethodsPOST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab09 {
    @Test
public void test_POST_AUTH_TOKEN(){

    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    RestAssured.given()// pre-requisites for the API call
            .baseUri("https://restful-booker.herokuapp.com")// base URL
            .basePath("/auth")// base path
            .contentType(ContentType.JSON)// header
            .log().all()// log all the details of the request
            .body(payload)// request body or payload


            .when().post()// HTTP method



            .then().log().all().statusCode(200);// validation of response





}

}

