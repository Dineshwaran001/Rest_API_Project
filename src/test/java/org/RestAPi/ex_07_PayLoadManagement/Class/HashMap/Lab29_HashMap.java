package org.RestAPi.ex_07_PayLoadManagement.Class.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Lab29_HashMap {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer bookingId;

    @Test
    public void post_Request_Update() {
//        String payload = "{\n" +
//                "    \"firstname\" : \"Ethan\",\n" +
//                "    \"lastname\" : \"Hunt\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2020-01-01\",\n" +
//                "        \"checkout\" : \"2021-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";

        HashMap<String, Object> ParentPayload = new LinkedHashMap<>();
        ParentPayload.put("firstname","Ethan");
        ParentPayload.put("lastname","Hunt");
        ParentPayload.put("totalprice",123);
        ParentPayload.put("depositpaid",true);

        HashMap<String, Object> bookingdatesPayload = new LinkedHashMap<>();
        bookingdatesPayload.put("checkin","2020-01-01");
        bookingdatesPayload.put("checkout","2020-01-01");

        // here we join parent payload and bookingdatespayload
        ParentPayload.put("bookingdates",bookingdatesPayload);
        ParentPayload.put("additionalneeds","Breakfast");
        System.out.println(ParentPayload);

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        //body() method anything you pass here it is taken as object(so it is possible to change as JSON)
        r.body(ParentPayload).log().all(); //parentpayload passing here for Body

        response=r.when().log().all().post();

        vr = response.then().log().all();

        vr.statusCode(200);

        //these are all Default -RestAssured Assertions
        //import org.hamcrest.Matchers;
        vr.body("booking.firstname", Matchers.equalTo("Ethan"));
        vr.body("booking.lastname", Matchers.equalTo("Hunt"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));
        vr.body("bookingid", Matchers.notNullValue());




    }



    }
