package org.RestAPi.ex_04_RestAssured_HTTPMethods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestingLab08_Non_BddStyle {
    // Non Bdd style - Use reference of the Interfaces
    RequestSpecification r ;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_Non_Bdd_Style(){
        //given() --> part
        String pin_Code ="614001";
        r = RestAssured.given();
        r.baseUri("https://api.postalpincode.in");
        r.basePath("/pincode/"+pin_Code);

        //when() --> part
        response = r.when().log().all().get(); //given r --> reference pass here
        System.out.println(response.toString());

        // then() --> part
        vr = response.then().log().all(); // when response--> reference pass here
        vr.statusCode(200);

    }

}
