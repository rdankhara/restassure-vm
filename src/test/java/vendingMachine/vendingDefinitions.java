package vendingMachine;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.Is;
import org.junit.Assert;

import java.util.List;

public class vendingDefinitions {

    private VendingMachine vendingMachine;

    @Given("machine is ready")
    public void machine_is_ready() {
        vendingMachine = DefaultVendingMachine.createDefault();
    }

    @When("user insert following coins")
    public void user_insert_following_coins(io.cucumber.datatable.DataTable dataTable) {
        dataTable.asList().stream().map(x -> Integer.parseInt(x)).forEach(x -> {
            vendingMachine.payCoin(x);
        });
    }

    @Then("user should see total {int} paid")
    public void user_should_see_total_paid(Integer total) {
        Assert.assertThat(vendingMachine.getPaidTotal(), Is.is(total));
    }
}
