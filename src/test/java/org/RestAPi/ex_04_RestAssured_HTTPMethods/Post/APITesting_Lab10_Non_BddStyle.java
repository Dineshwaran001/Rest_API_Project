package org.RestAPi.ex_04_RestAssured_HTTPMethods.Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab10_Non_BddStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

@Test
    public void RsBooker_Auth(){
    //Request---> part 1;
    String payload ="{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
//Request---> part 1;
    r = RestAssured.given();
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/auth");
    r.contentType(ContentType.JSON);
    r.body(payload).log().all(); // passing the body in name of payload

    //HTTP Method --> part 2
    response = r.when().log().all().post();

    //Verification-->  part 3
    vr = response.then().log().all();
    vr.statusCode(200);


}
}
