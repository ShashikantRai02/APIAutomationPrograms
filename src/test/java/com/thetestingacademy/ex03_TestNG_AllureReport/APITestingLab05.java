package com.thetestingacademy.ex03_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITestingLab05 {
    String pincode="226005";
    @Test
    void testCase01(){
        pincode = "226005";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
//            System.out.println("Test Case 01");
        }
@Test
        void testCase02(){
    pincode = " ";
    RestAssured
            .given()
            .baseUri("https://api.zippopotam.us")
            .basePath("/USA/"+pincode)
            .when()
            .get()
            .then()
            .log().all().statusCode(200);
//            System.out.println("Test Case 02");
        }
@Test(enabled = false)
        void testCase03(){
    pincode = "@";
    RestAssured
            .given()
            .baseUri("https://api.zippopotam.us")
            .basePath("/IN/"+pincode)
            .when()
            .get()
            .then()
            .log().all().statusCode(200);
//            System.out.println("Test Case 03");
        }
}
