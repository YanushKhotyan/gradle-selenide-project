package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import page.SignInPage;

public class SingInStep {
    SignInPage signInPage = new SignInPage();
    @When("Client login with data {string} and password {string}")
    public void clientLoginWithDataAndPassword(String login, String password) {
        signInPage.login(login, password);
    }

    @Given("open registration form")
    public void openRegistrationForm() {
        signInPage.openRegistrationForm();
    }


}
