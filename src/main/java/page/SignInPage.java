package page;

import com.codeborne.selenide.SelenideElement;
import config.EnvConfig;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("#UserName"));
    private SelenideElement passwordInput = $(By.cssSelector("#Password"));
    private SelenideElement signInButton = $(By.xpath("//input[@type = 'submit']"));

    public HomePage login(String email, String password){
        loginInput.val(email);
        passwordInput.val(password);
        signInButton.click();
        return new HomePage();
    }

    public SignUpPage openRegistrationForm(){
        open(EnvConfig.URI_REGISTRATION);
        return new SignUpPage();
    }
}
