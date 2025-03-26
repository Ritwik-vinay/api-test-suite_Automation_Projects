package org.ritwikvinay.ex04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_POST_NonBDDStyle_token {
    public static String bookingId;

    @Test
    @Description("Verify the Post request in the Booking")

    public void Test_restfullbooker_Post_Tokencreation() {
        RequestSpecification r;
        Response response;
        ValidatableResponse vr;
        String uri = "https://restful-booker.herokuapp.com";
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        //Pre-condition- part-> 1
        r = RestAssured.given();
        r.baseUri(uri).basePath("/auth");
        r.contentType("application/json");
        r.body(payload).log().all();

        //Making Request =part2
        response = r.when().log().all().post();

        // Verification part -Part3
        vr = response.then().log().all();
        vr.statusCode(200);



    }
}
