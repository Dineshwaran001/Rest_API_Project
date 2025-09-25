package org.RestAPi.ex_04_RestAssured_HTTPMethods.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_Lab09_Bdd_Style {
    @Test
    public void test_Token_Generation(){
        String payload ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .baseUri("/auth")
                .contentType(ContentType.JSON)
                .log().all() // this means log everything you are doing(print in console)
                .body(payload)// body passes here
                .when()
                .log().all()
                .post()
                .then()
                .log().all()
                .statusCode(200);
    }
}
