package com.thetestingacademy.ex01_Restassured;

import io.restassured.RestAssured;

public class Lab03 {
    public static void main(String[] args) {
    RestAssured
            .given().baseUri("https://google.com").log().all()
            .when().get()
            .then().statusCode(200).log().all();
}
}
