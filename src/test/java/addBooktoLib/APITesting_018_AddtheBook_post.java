package addBooktoLib;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_018_AddtheBook_post {
    RequestSpecification r;
    ValidatableResponse vr;
    Response response;

    @Test
    public void Test_addBookDetails() {
        String payload = "{\n" +
                "    \"name\": \"Learn API Testing automation\",\n" +
                "    \"isbn\": \"rit\",\n" +
                "    \"aisle\": \"3\",\n" +
                "    \"author\": \"RV\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("http://216.10.245.166");
        r.basePath("/Library/Addbook.php");

        r.contentType("application/json");
        r.body(payload).log().all();
        response = r.when().log().all().post();
        vr = response.then().log().all();
        vr.statusCode(200);
        String Id = response.then().extract().path("ID");
        System.out.println(Id);


    }
}
