package org.ritwikvinay.ex03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting004_GET_BDDStyle {
    @Test
    @Description("Verify whether the Test is executed BDDStyle Request= Get")
    public void testBdd_get(){
        String pincode="700009";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}
