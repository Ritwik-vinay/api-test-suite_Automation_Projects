package addBooktoLib;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class APITesting_019_GetByID extends APITesting_018_AddtheBook_post {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;




    public void test_getResponseByID(){

        r= RestAssured.given();
        r.baseUri("http://216.10.245.166");
        r.basePath("/Library/GetBook.php?ID=rv333");
    }

}
