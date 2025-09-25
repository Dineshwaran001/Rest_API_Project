package org.RestAPi.ex_06_Assertions;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab24_RestAssured_Assertions {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Owner("Dineshwaran")
    @Severity(SeverityLevel.NORMAL)
    @Description("TC#1 Verify the booking Created ")
    @Test
    public void post_Request_Update(){
        String payload ="{\n" +
                "    \"firstname\" : \"Dinesh\",\n" +
                "    \"lastname\" : \"Waran\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2020-01-01\",\n" +
                "        \"checkout\" : \"2021-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        response=r.when().log().all().post();

        vr = response.then().log().all();

        vr.statusCode(200);

        //these are all Default -RestAssured Assertions
        //import org.hamcrest.Matchers;
        vr.body("booking.firstname", Matchers.equalTo("Dinesh"));
        vr.body("booking.lastname", Matchers.equalTo("Waran"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));
        vr.body("bookingid", Matchers.notNullValue());
    }

}
