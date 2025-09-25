package org.RestAPi.ex_04_RestAssured_HTTPMethods.Put;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab11_NonBddStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void PutRequest_Update(){

        String payload ="{\n" +
                "    \"firstname\" : \"DADDYs\",\n" +
                "    \"lastname\" : \"Home\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        String BookingID ="1283";
        String token= "2a0377310999567";//first generate this token from Auth

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+BookingID); // passing BookingId
        r.contentType(ContentType.JSON);
        r.cookie("token", token); // we pass the Token here (use Comma between them)
        r.body(payload).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
                vr.statusCode(200);

    }
}
