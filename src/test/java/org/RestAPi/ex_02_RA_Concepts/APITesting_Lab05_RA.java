package org.RestAPi.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab05_RA {
    public static void main(String[] args) {
        String pincode = "614001";
        RestAssured.given()
                         .baseUri("https://api.postalpincode.in")
                         .basePath("/pincode/"+ pincode)
                .when()
                       .get()
                .then()
                       .log().all().statusCode(200);

         pincode = "@";
        RestAssured.given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/"+ pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        pincode = " ";
        RestAssured.given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/"+ pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
