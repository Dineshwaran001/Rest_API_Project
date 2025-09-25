package org.RestAPi.ex_04_RestAssured_HTTPMethods.Delete;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab13_NonBddStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void Delete_Update(){

        String BookingId ="1988"; // first check the ids that want to delete in postman
        String token ="58fdbacfe19588f"; // give the latest token for Auth

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +BookingId); // pass the booking ID
        r.contentType(ContentType.JSON);
        r.cookie("token", token); // pass the token
        r.log().all(); // this will print in console

        response = r.when().delete();

        vr = response.then().log().all();
        vr.statusCode(201);

    }
}
