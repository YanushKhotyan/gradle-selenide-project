package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.BasePage;

public class LoginStep {
BasePage basePage = new BasePage();
    @Given("open home page and click {string} button")
    public void openHomePageAndClickButton(String nameButton) {
    basePage.clickLoginButton(nameButton);
    }

    @When("Client open registration form")
    public void clientOpenRegistrationForm() {
        basePage.clickSignUpButton();
    }
}
