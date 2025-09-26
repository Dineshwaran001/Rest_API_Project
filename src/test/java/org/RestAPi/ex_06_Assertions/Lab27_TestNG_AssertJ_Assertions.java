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
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Lab27_TestNG_AssertJ_Assertions {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer bookingId;

    @Test
    public void post_Request_Update(){
        String payload ="{\n" +
                "    \"firstname\" : \"Ethan\",\n" +
                "    \"lastname\" : \"Hunt\",\n" +
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
        vr.body("booking.firstname", Matchers.equalTo("Ethan"));
        vr.body("booking.lastname", Matchers.equalTo("Hunt"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));
        vr.body("bookingid", Matchers.notNullValue());

// Extract the Response--> from Response --> use json path finder to find the path
        bookingId = response.then().extract().path("bookingid");
        String firstname =response.then().extract().path("booking.firstname");
        String lastname =response.then().extract().path("booking.lastname");

        //Use TestNg Hard assertions to validate
        //actual stored in above line code
        Assert.assertEquals(firstname,"Ethan");
        Assert.assertEquals(lastname,"Hunt");
        Assert.assertNotNull(bookingId);

        //AssertJ -3rd Party Library Assertions
        assertThat(bookingId).isNotZero().isNotNegative().isNotNull();
        assertThat(firstname).isAlphabetic().isNotEmpty().isNotNull().isNotBlank();
        assertThat(lastname).isAlphabetic().isNotEmpty().isNotNull().isNotBlank();

    }
}
