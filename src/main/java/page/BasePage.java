package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public void clickLoginButton(String nameButton) {
        $(By.xpath("//a[text() = '" + nameButton + "']")).click();
    }

    public SignUpPage clickSignUpButton() {
        $(By.xpath("//strong[text()='Регистрация']")).click();
        return new SignUpPage();
    }
}
