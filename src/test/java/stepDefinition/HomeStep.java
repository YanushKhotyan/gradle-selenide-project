package stepDefinition;

import io.cucumber.java.en.Then;
import page.HomePage;

public class HomeStep {
    HomePage homePage = new HomePage();

    @Then("Client has been login on portal")
    public void clientHasBeenLoginOnPortal() {
        homePage.homePageIsDisplayed();
    }
}
