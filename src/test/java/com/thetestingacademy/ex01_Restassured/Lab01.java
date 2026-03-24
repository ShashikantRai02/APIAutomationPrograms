package com.thetestingacademy.ex01_Restassured;

import io.restassured.RestAssured;

public class Lab01 {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://reqres.in/api/users")
                .when()
                .get()
                .then()
                .log().all();
    }
}
