package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class OnlinerAPI {
    @Test
    public void onlinerLogin () {
       given()
               .body("{login:\"111\", password:\"\"}")
        .when ()
                .post("https://www.onliner.by/sdapi/user.api/login")
               .then()
               .statusCode(201);
    }
}
