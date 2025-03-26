package org.ritwikvinay.ex06_Patch_request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_019_Patch_nonBDD {
    @Test
    @Description("TC# TC1 -> Patch Request to verify")
    public void test_patch_request(){
        RequestSpecification r;
        Response response;
        ValidatableResponse vr;
        String payloadPatch="{\n" +
                "    \"firstname\" : \"rv\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";
        String bookingId= "4660";
        String token="78e9e5113d32ffa";
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingId);
        r.contentType("application/json");
        r.cookie("token",token);
        r.auth().basic("admin","password123");
        r.body(payloadPatch).log().all();

        response = r.when().log().all().patch();

       vr= response.then().log().all().statusCode(200);

    }

}
