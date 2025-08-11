package net.frey.smartbar.backoffice.api;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingResourceTest {
    @Test
    void testHelloEndpoint() {
        var json = given().when()
                .get("/categories")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .jsonPath();

        assertEquals("drinks", json.getString("[0].name"));
    }
}
