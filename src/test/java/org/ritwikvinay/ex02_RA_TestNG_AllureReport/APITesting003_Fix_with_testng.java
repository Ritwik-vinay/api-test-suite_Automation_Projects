package org.ritwikvinay.ex02_RA_TestNG_AllureReport;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting003_Fix_with_testng {
    @Test
    @Description("TC#1 - Verify that the Valid Pincode gives 200 Ok")
    public void test_GET_Positive_TC1(){

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/110048")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    @Description("TC#2 - Verify that the Invalid Pincode gives error")
    public void test_Get_negative_tc2(){
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/0")
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    @Description("TC#2 - Verify that the Invalid Pincode gives error")
    public void test_Get_negative_tc3(){
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/ ")
                .when().get()
                .then().log().all().statusCode(200);
    }
}
