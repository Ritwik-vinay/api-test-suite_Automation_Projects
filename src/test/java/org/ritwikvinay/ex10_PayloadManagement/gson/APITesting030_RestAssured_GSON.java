package org.ritwikvinay.ex10_PayloadManagement.gson;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.ritwikvinay.ex10_PayloadManagement.manual.Booking;
import org.ritwikvinay.ex10_PayloadManagement.manual.BookingDates;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class APITesting030_RestAssured_GSON {
    //GSON is a Google library which convert your class to json
    //json to Class
    //JSON-is a plain Text in key and value pair to transfer from client to server
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    @Test
    public void test_create_Booking_positive(){
        //Step 1-> Post
        //URL-> Base URL+ Base Path
        //Header
        //Body
        //Auth->no
        //Step 2->
        //Prepare the Payload(Object->Json String)
        //Send the Request
        //Step 3->
        //Validate Response(JSON String-> Object)
        //Status Code
        //First Name
        //Time Response
        Booking booking= new Booking();
        booking.setFirstname("Ritwik");
        booking.setLastname("Vinay");
        booking.setTotalprice(122);
        booking.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2024-02-01");
        bookingDates.setCheckout("2024-02-02");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Breakfast");

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);


        Response response;

        String uri = "https://restful-booker.herokuapp.com";
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri(uri).basePath("/booking");
        requestSpecification.contentType("application/json");
        requestSpecification.body(jsonStringBooking).log().all();

        response = requestSpecification.when().log().all().post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        String Firstname1 = response.then().extract().path("booking.firstname");
        //Assertj
        assertThat(Firstname1).isNotNull().isEqualTo("Ritwik");


    }
}
