package org.RestAPi.ex_04_RestAssured_HTTPMethods.Patch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab12_NonBdd_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
            public void patch_Update(){
    String payload ="{\n" +
            "    \"firstname\" : \"Cody\",\n" +
            "    \"lastname\" : \"Rhodes\"\n" +
            "}";
    String BookingId ="1283";
    String token ="f97d4a721fc79d5";

    r = RestAssured.given();
            r.baseUri("https://restful-booker.herokuapp.com");
            r.basePath("/booking/" +BookingId);
            r.contentType(ContentType.JSON);
            r.cookie("token", token);
            r.body(payload).log().all();

            response = r.when().log().all().patch();

            vr = response.then().log().all();
            vr.statusCode(200);

    }
}
