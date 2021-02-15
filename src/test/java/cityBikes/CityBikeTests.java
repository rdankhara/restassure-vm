package cityBikes;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.PriorityQueue;

import static io.restassured.RestAssured.given;

public class CityBikeTests {
    public static LoadProperty loadProperty = new LoadProperty();

    //public static String location = loadProperty.getProperty("location");
    //public static String invalidID = loadProperty.getProperty("InvalidID");
    //public static String requireField = loadProperty.getProperty("RequireField");
    @BeforeClass
    public static void Setup()
    {
       RestAssured.baseURI = "http://api.citybik.es/v2/networks";
    }
    //public static void Setup()
    //{
       // RestAssured.baseURI = loadProperty.getProperty("url");
    //}

    //@Test
    public void baseUriReturnsSuccess(){

        Response response = given()
                .when()
                .get()
                .then()
                .extract().response();

        Assert.assertThat(response.getStatusCode(), Is.is(200));
    }

    //@Test
    public void verify_that_frankfurt_is_in_germany(){

        Response response = given()
                .when()
                .get(loadProperty.getProperty("location"))
                .then()
                .extract().response();

        Assert.assertThat(response.getStatusCode(), Is.is(200));

        JsonPath jsonPath = response.getBody().jsonPath();

        //verify country of frankfurt is Germany
        Assert.assertThat(jsonPath.get("network.location.country"), Is.is("DE"));
        //verify longitude
        Assert.assertThat(jsonPath.get("network.location.longitude"), Is.is(8.66375F));
        //verify latitude
        Assert.assertThat(jsonPath.get("network.location.latitude"), Is.is(50.1072F));
    }

    //@Test
    public void verify_that_invalid_id_returns_not_found(){

        Response response = given()
                .when()
                .get(loadProperty.getProperty("invalidID"))
                .then()
                .extract().response();

        Assert.assertThat(response.getStatusCode(), Is.is(404));
    }

    //@Test
    public void verify_that_top_level_fields_can_be_filtered_by_queryparms() {
        Response response = given()
                .queryParam("fields", loadProperty.getProperty("requireField"))
                .when()
                .get()
                .then()
                .extract()
                .response();

        response.getBody().prettyPrint();
    }
}
