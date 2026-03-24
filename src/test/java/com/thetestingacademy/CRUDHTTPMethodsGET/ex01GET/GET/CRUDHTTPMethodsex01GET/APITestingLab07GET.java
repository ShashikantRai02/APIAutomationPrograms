package com.thetestingacademy.CRUDHTTPMethodsGET.ex01GET.GET.CRUDHTTPMethodsex01GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITestingLab07GET {
    @Test
    void testCase01Positive(){
        RestAssured
                .given().baseUri("https://api.zippopotam.us").basePath("/IN/226005").log().all()
                .when().get()
                .then().statusCode(200).log().all();
    }
}
