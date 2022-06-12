package cityBikes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs
{
    CityBikeTests cityBikeTests = new CityBikeTests();

    @Given("^user send ApI request")
    public void user_send_ap_i_request()
    {
        System.out.println("setup");
    }

    @When("user receive success response")
    public void user_receive_success_response()
    {
        //System.out.println("Success response");
        cityBikeTests.baseUriReturnsSuccess();
    }

    @Then("user should verify that frankfurt is in germany")
    public void user_should_verify_that_frankfurt_is_in_germany()
    {
        //System.out.println("verification request");
        cityBikeTests.verify_that_frankfurt_is_in_germany();
    }

    @When("user receive unsuccessful response")
    public void user_receive_unsuccessful_response()
    {
        //System.out.println("Unsuccessful response");
        cityBikeTests.verify_that_invalid_id_returns_not_found();
    }

    @Then("user should not verify the city location")
    public void user_should_not_verify_the_city_location()
    {
        //System.out.println("not verify the location");
        cityBikeTests.verify_that_top_level_fields_can_be_filtered_by_queryparms();
    }
}
