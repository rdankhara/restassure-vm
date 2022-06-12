import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CommentsApiTest {
    @BeforeClass
    public static void Setup()
    {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
    }

    @Test
    public void get_using_querystring() {
        Response response = given()
                .when()
                .queryParam("postId", 2)
                .get("comments")
                .then()
                .extract()
                .response();

        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
//        String title = jsonPath.getString("title");
//        Assert.assertEquals(title, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
    }

    // Scenario Post to create
    @Test
    public void it_should_create_new_post() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .body("{\n" +
                        "\"postId\": 1,\n" +
                        "\"name\": \"Jon Doe\",\n" +
                        "\"email\": \"jon.doe@amazon.com\",\n" +
                        "\"body\": \"this is jon doe\"\n" +
                        "}")
                .post("comments/")
                .then()
                .extract()
                .response();

        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 201);

//        JsonPath jsonPath = response.jsonPath();
//        String title = jsonPath.getString("title");
//        String body = jsonPath.getString("body");
//        Assert.assertEquals(title, "abcd");
//        Assert.assertEquals(body, "abce efg");
    }
}
