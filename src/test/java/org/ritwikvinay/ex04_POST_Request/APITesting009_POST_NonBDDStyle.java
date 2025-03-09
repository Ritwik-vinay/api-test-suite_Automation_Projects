package org.ritwikvinay.ex04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_POST_NonBDDStyle {
    public static int bookingId;
    @Test
    @Description("Verify the Post request in the Booking")

    public void Test_restfullbooker_creation(){
        RequestSpecification r;
        Response response;
        ValidatableResponse vr;
        int bid= bookingId;
        String uri="https://restful-booker.herokuapp.com";
        String payload = "{\n" +
                "    \"firstname\" : \"Ritwik\",\n" +
                "    \"lastname\" : \"vinay\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        r= RestAssured.given();
        r.baseUri(uri).basePath("/booking");
        r.contentType("application/json");
        r.body(payload).log().all();

        response=r.when().log().all().post();

        vr= response.then().log().all();
        vr.statusCode(200);
        bookingId= response.jsonPath().getInt("bookingid");
        System.out.println("Booking ID is: "+ bookingId);


    }
}
