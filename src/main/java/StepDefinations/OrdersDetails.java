package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrdersDetails {
    @Given("^user is registered on Amazon$")
    public void user_is_registered_on_Amazon() {
        System.out.println("user is registered on Amazon");
    }

    @Given("^user is on Amazon login screen$")
    public void user_is_on_Amazon_login_screen()  {
        System.out.println("user is on Amazon login screen");
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password()  {
        System.out.println("user enters username and password");
    }

    @When("^user navigates to Order details screen$")
    public void user_navigates_to_Order_details_screen()  {
        System.out.println("user navigates to Order details screen");
    }

    @When("^user clicks Orders tab$")
    public void user_clicks_Orders_tab()  {
        System.out.println("user clicks Orders tab");
    }

    @Then("^user checks previous orders$")
    public void user_chcecks_previous_orders()  {
        System.out.println("user chcecks previous orders");
    }

    @When("^user clicks Open Orders tab$")
    public void user_clicks_Open_Orders_tab()  {
        System.out.println("user clicks Open Orders tab");
    }

    @Then("^user checks open orders$")
    public void user_chcecks_open_orders()  {
        System.out.println("user chcecks open orders");
    }

    @When("^user clicks Cancelled Orders tab$")
    public void user_clicks_Cancelled_Orders_tab()  {
        System.out.println("user clicks Cancelled Orders tab");
    }

    @Then("^user checks cancelled orders$")
    public void user_chcecks_cancelled_orders()  {
        System.out.println("user chcecks cancelled orders");
    }
}
