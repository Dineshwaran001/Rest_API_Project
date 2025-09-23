package org.RestAPi.ex_01_RA_Basics;

import io.restassured.RestAssured;

public class APITesting_Lab01_Rest_Ping_Check {
    public static void main(String[] args) {

        RestAssured.given()
                      .baseUri("https://restful-booker.herokuapp.com/ping")
                .when()
                      .get()
                .then()
                .log().all().statusCode(201); // for ping request 201 is response
    }
}
