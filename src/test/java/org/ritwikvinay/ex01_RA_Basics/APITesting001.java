package org.ritwikvinay.ex01_RA_Basics;
import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting001 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the pincode");
        String pincode= scn.next();
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().get().then().log().all().statusCode(200);
    }
}
