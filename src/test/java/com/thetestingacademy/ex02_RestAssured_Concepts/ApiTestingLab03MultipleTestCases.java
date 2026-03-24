package com.thetestingacademy.ex02_RestAssured_Concepts;

import io.restassured.RestAssured;

public class ApiTestingLab03MultipleTestCases {
    public static void main(String[] args) {
        String pincode = "226005";
        RestAssured
                .given().baseUri("https://api.postalpincode.in/pincode/" + pincode).log().all()
                .when().get()
                .then().statusCode(200).log().all();

         pincode = "110001";
    }
}
