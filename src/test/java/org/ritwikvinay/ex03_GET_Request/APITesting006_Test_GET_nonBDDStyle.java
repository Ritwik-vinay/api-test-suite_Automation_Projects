package org.ritwikvinay.ex03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting006_Test_GET_nonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Description("Verify the GET Req Positive")
    @Test
    public void test_non_BDD_Get(){
        String pin_code="700009";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pin_code);
        response= r.when().log().all().get();
        vr = response.then().log().all().statusCode(200);

    }
    @Description("Verify the GET Req Negative : -1 Input")
    @Test
    public void test_NonBDDStyleGET_negative() {
        String pin_code=" ";
        r= RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pin_code);
        response= r.when().log().all().get();
        vr=response.then().log().all().statusCode(404);

    }

}