package org.ritwikvinay.ex05_PUT_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.ritwikvinay.ex04_POST_Request.APITesting009_POST_NonBDDStyle.bookingId;

public class APITesting010_PUT_NonBDD {
    @Test
    @Description("Verify Put method ")
    public void test_put_non_bdd() {

        String token = "acf8a72b8fb0531";
        String Bookingid="1349";

        String payloadPUT = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+Bookingid);
        requestSpecification.contentType(ContentType.JSON);
//        requestSpecification.auth().basic("admin","password123");


        requestSpecification.cookie("token", token);
        requestSpecification.body(payloadPUT).log().all();

        Response response = requestSpecification.when().put();


        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
    }
    }
