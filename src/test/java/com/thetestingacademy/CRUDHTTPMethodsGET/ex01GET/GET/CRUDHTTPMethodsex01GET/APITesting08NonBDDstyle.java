package com.thetestingacademy.CRUDHTTPMethodsGET.ex01GET.GET.CRUDHTTPMethodsex01GET;

public class APITesting08NonBDDstyle {
    public static void main(String[] args) {
        String baseURI = "https://api.zippopotam.us";
        String basePath = "/IN/226005";

        io.restassured.response.Response response = io.restassured.RestAssured
                .given().baseUri(baseURI).basePath(basePath).log().all()
                .when().get();

        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);
    }
}
