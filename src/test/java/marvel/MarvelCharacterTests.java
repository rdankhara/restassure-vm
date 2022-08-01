package marvel;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class MarvelCharacterTests {
    @BeforeClass
    public static void Setup()
    {
        RestAssured.baseURI = "http://gateway.marvel.com/v1/public/comics";
    }

    @Test
    public void verify_character_properties(){

        Response response = getResponse();

        //JsonPath results = response.jsonPath().getJsonObject("data.results[0].id");
        Assert.assertThat(response.getStatusCode(), Is.is(200));
        String actualId = response.jsonPath().getString("data.results[0].id");
        String expectedId = "82967";
        Assert.assertEquals(expectedId, actualId);

        //part two $.phoneNumbers[?(@.type=='home')].number
        // this will load all url into an array
        System.out.println(response.jsonPath().getList("data.results[0].urls", Detail.class));
        List<Detail> details = response.jsonPath().getList("data.results[0].urls", Detail.class);

        for (Detail a : details){
            if (a.getUrl().contains(expectedId)) {
                System.out.println(a.getUrl());
            }
        }

        System.out.println("---- Pretty print response ---");
        response.getBody().prettyPrint();
    }

    @Test
    public void verify_character_count(){

        Response response = getResponse();

        //JsonPath results = response.jsonPath().getJsonObject("data.results[0].id");
        Assert.assertThat(response.getStatusCode(), Is.is(200));
        String actualId = response.jsonPath().getString("data.results[0].id");
        String expectedId = "82967";
        Assert.assertEquals(expectedId, actualId);

        int expectedCount = response.jsonPath().getInt("data.count");
        System.out.println("counts:" + expectedCount);
        System.out.println(response.jsonPath().getList("data.results[0].urls", Detail.class));
        List<Detail> details = response.jsonPath().getList("data.results[0].urls", Detail.class);

        List<String> urls = new ArrayList<>();

        for (Detail a : details){
            if (a.getUrl().contains(expectedId)) {
                urls.add(a.getUrl());
            }
        }

        for (String url : urls) {
            //Todo: write webdriver methods to visit open url and count characters, it should be equal to expectedCount
        }
    }

    private Response getResponse() {
        Response response = given()
                .queryParam("ts", "abcd") // any string
                .queryParam("apikey", "3750536889898a0565ac71a0eb6920ad") // public key
                .queryParam("hash", "9df35ef657b719ae8195f0b7adc5d995") // md5 hash
                .when()
                .get()
                .then()
                .extract()
                .response();
        return response;
    }
}
