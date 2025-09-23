package org.RestAPi.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_Pincode {
    public static void main(String[] args) {
        //Given()-> Pre-Req - Url, Headers , Auth, Body
        //When()--> HTTP method? - GET , POST, PUT, Patch, Delete
        //Then()-> Validation - 200 ok , Firstname =="Dinesh"
        // Full URL- https://api.postalpincode.in/pincode/614001
        // Base Uri- https://api.postalpincode.in
        //Base path- /pincode/614001
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pincode only numbers");
        String pincode = sc.next(); // we are scanning pincode
        RestAssured.given()
                                    //we give the url with pin code
                        .baseUri("https://api.postalpincode.in")
                        .basePath("/pincode/"+ pincode) // passing the pincode
                   .when()
                        .get()
                   .then()
                        .log().all()
                        .statusCode(200);

    }
}
