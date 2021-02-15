package vendingMachine;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs
{
    DefaultVendingMachineTests defaultVendingMachineTests = new DefaultVendingMachineTests();
   // CoinFactoryTests coinFactoryTests = new CoinFactoryTests();
    //ProductFactoryTests productFactoryTests = new ProductFactoryTests();
    //CoinFactory coinFactory = new CoinFactory();
    //ProductFactory productFactory = new ProductFactory();

    @Given("^user has started Vending Machine$")
    public void user_has_started_Vending_Machine()
    {
        //System.out.println("start vending Machine");
        defaultVendingMachineTests.setup();
    }

    @When("^user insert valid coin$")
    public void user_insert_valid_coin()
    {
        //System.out.println("insert valid coin");
        defaultVendingMachineTests.it_does_accepts_valid_coins_but_does_not_accept_invalid_coin();
    }

    @When("^user select appropriate drink from menu list$")
    public void user_select_appropriate_drink_from_menu_list()
    {
        //System.out.println("select drink from menu list");
        defaultVendingMachineTests.allows_user_to_select_product();
    }

    @Then("^user able to take refund by cancelling the request$")
    public void user_able_to_take_refund_by_cancelling_the_request()
    {
       // System.out.println("Take refund by cancelling request");
        defaultVendingMachineTests.allows_user_to_cancel_request_and_get_refund();
    }

    @Then("^user able to reselect drink and remaining change if any$")
    public void user_able_to_reselect_drink_and_remaining_change_if_any()
    {
        //System.out.println("reselect drink and remaining change if any");
        defaultVendingMachineTests.returns_selected_product_and_remaining_change();
    }

    @Then("^Supplier can able to reset the operation$")
    public void supplier_can_able_to_reset_the_operation()
    {
        //System.out.println("Supplier able to reset the operation");
        defaultVendingMachineTests.it_allows_reset_operation();
    }

    @When("^user insert invalid coin$")
    public void user_insert_invalid_coin()
    {
        System.out.println("insert invalid coin");

    }

    @Then("^vending machine will return the coin$")
    public void vending_machine_will_return_the_coin()
    {
        //System.out.println("vending machine will return the coin");
        defaultVendingMachineTests.allows_user_to_cancel_request_and_get_refund();
    }

}
