package org.ritwikvinay.ex04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_POST_BDDStyle {
    @Test
    @Description("Verify the Post request in the Booking_With_BDD Style")
    public void Test_restfullbooker_creation() {
        String pay_load = "{\n" +
                "    \"firstname\" : \"JIM\",\n" +
                "    \"lastname\" : \"BROWN\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .contentType("application/json")
                .body(pay_load)
                .when().log().all().post()
                .then().log().all().statusCode(200);

    }
}
