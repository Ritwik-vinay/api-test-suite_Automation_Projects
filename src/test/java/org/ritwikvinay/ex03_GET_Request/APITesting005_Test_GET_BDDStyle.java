package org.ritwikvinay.ex03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting005_Test_GET_BDDStyle {
    @Test
    @Description("Positve TC#1:Verify whether the Test is executed BDDStyle Request= Get")
    public void testBdd_get_Positive2(){
        String pincode="700009";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+ pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
    @Test
    @Description("Negative TC#2:Verify whether the Test is executed BDDStyle Request= Get")
    public void testBdd_get_Negative2(){
        String pincode="-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
