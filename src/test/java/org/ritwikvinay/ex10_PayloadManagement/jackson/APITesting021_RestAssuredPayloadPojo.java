package org.ritwikvinay.ex10_PayloadManagement.jackson;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting021_RestAssuredPayloadPojo {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer bookingId;

    @Test
    public void test_post() {
        //String payload_POST = "{\n" +
        //                "    \"firstname\" : \"Ritwik\",\n" +
        //                "    \"lastname\" : \"vinay\",\n" +
        //                "    \"totalprice\" : 111,\n" +
        //                "    \"depositpaid\" : true,\n" +
        //                "    \"bookingdates\" : {\n" +
        //                "        \"checkin\" : \"2018-01-01\",\n" +
        //                "        \"checkout\" : \"2019-01-01\"\n" +
        //                "    },\n" +
        //                "    \"additionalneeds\" : \"Breakfast\"\n" +
        //                "}";

//        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();
//        jsonBodyUsingMap.put("firstname","Ritwik");
//        jsonBodyUsingMap.put("lastname","vinay");
//        jsonBodyUsingMap.put("totalprice","111");
//        jsonBodyUsingMap.put("depositpaid","false");
//
//        Map<String, Object> bookingDatesMap= new LinkedHashMap<>();
//        bookingDatesMap.put("checkin","2018-01-01");
//        bookingDatesMap.put("checkout","2019-01-01");
//
//        jsonBodyUsingMap.put("bookingdates",bookingDatesMap);
//        jsonBodyUsingMap.put("additionalneeds","Breakfast");
//        System.out.println(jsonBodyUsingMap);
        //POJO (Plain Old Java Object)"Encapsulated Class with private Getters and setters"


    }
}
