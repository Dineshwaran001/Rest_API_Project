package org.RestAPi.ex_04_RestAssured_HTTPMethods.GET;

import io.restassured.RestAssured;

public class APITesting_Lab07_BddStyle {
    public static void main(String[] args) {
        String pincode = "614001";
        RestAssured.given()
                        .baseUri("https://api.postalpincode.in")
                        .basePath("/pincode/" + pincode)
                .when()
                     .log()
                     .all()
                     .get()
                .then()
                     .log()
                     .all()
                     .statusCode(200);
    }
}
