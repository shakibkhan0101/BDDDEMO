package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("User is on login page")
    public void user_is_on_login_page() {
        // Implement the step
        System.out.println("user_is_on_login_page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Implement the step
        System.out.println("user_enters_username_and_password");
    }

    @And("click on login button")
    public void click_on_login_button() {
        // Implement the step
        System.out.println("----------");
        System.out.println("click_on_login_button");
        System.out.println("OR simply press enter");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("----------");
        System.out.println("user_is_navigated_to_the_home_page to home page");
        System.out.println("Now we are ready to post, read-feeds etc");
    }
}
