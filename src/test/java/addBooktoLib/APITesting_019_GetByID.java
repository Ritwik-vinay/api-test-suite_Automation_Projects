package addBooktoLib;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_019_GetByID {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String id= APITesting_018_AddtheBook_post.Id;
    @Test
    public void test_getResponseByID(){

        r= RestAssured.given();
        r.baseUri("http://216.10.245.166");
        r.basePath("/Library/GetBook.php?ID=rv333");
        response=r.when().log().all().get();
        vr= response.then().log().all();
        vr.statusCode(200);

    }

}
