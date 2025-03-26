package org.ritwikvinay.ex07_Delete_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_020_Delete_nonBDD {
    @Test
    @Description("TC# INT1 Verify the record can be deleted or not")
    public void Delete_request() {


        RequestSpecification r;
        Response response;
        ValidatableResponse vr;

        String token = "617a94669494f19";
        String bookingId = "3871";
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
      //  r.auth().basic("admin","password123");


        response = r.when().log().all().delete();

        vr = response.then().log().all().statusCode(201);

    }

}
