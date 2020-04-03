package stepDefinition;


import impl.AuthServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import model.api.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import page.SignUpPage;
import service.AuthService;

public class SignUpStep {
    AuthService authService = new AuthServiceImpl();
    SignUpPage signUpPage = new SignUpPage();
    @When("client fill all form with valid data")
    public void clientFillAllFormWithValidData() {
        signUpPage.fillRegistrationForm();
    }

    @Given("create user by API")
    public void createUserByAPI() {
        User user = User.builder()
                .email("ter" + RandomStringUtils.randomAlphabetic(6) +"@gmail.com")
                .password(""+ RandomStringUtils.randomAlphabetic(6)+""+ RandomStringUtils.randomNumeric(4,4))
                .locale("EN")
                .build();

        User createdUser = authService.createUser(user);
        Assert.assertNotNull(createdUser);
    }
}
