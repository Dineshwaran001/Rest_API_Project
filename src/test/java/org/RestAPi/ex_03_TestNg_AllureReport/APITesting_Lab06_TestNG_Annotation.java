package org.RestAPi.ex_03_TestNg_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestNG_Annotation {
    String pincode = "614001";
    @Test
    public void PositiveCase_1() {

        RestAssured.given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public void NegativeeCase_1() {
        pincode = "@";
        RestAssured.given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
        public void NegativeeCase_2() {
            pincode = " ";
            RestAssured.given()
                    .baseUri("https://api.postalpincode.in")
                    .basePath("/pincode/" + pincode)
                    .when()
                    .get()
                    .then()
                    .log().all().statusCode(200);
        }
}
