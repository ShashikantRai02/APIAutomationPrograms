package com.thetestingacademy.DELETESMethods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestingLab13 {
    //  PUT
    // Pre - Req.
    // token, booking id - A

//    public void get_token(){ }
//    public void get_booking_id(){}


    RequestSpecification r;
    Response response;
    ValidatableResponse vr;



    @Test
    public void test_put_non_bdd() {



        String token = "d096b44afab61e5";
        String bookingid = "1";

        // Faker lib


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);

        r.contentType(ContentType.JSON);
        r.cookie("token", token);
//        r.auth().digest()
         r.auth().basic("admin","password123");


        response = r.when().log().all().delete();


        vr = response.then().log().all();
        vr.statusCode(200);












    }


}
