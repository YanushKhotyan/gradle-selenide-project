package page;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class SignUpPage {

    private SelenideElement loginInput = $(By.cssSelector("#UserName"));
    private SelenideElement passwordInput = $(By.cssSelector("#Password"));
    private SelenideElement confirmPasswordInput = $(By.cssSelector("#ConfirmPassword"));
    private SelenideElement surnameInput = $(By.cssSelector("#Surname"));
    private SelenideElement nameInput = $(By.cssSelector("#Name"));
    private SelenideElement middleNameInput = $(By.cssSelector("#Patronymic"));
    private SelenideElement answerInput = $(By.cssSelector("#Answer"));

    private SelenideElement groupSelect =  $("#Group");
    private SelenideElement questionSelect =  $("#QuestionId");

    private SelenideElement submitButton = $(By.xpath("//input[@type='submit']"));

    public void fillRegistrationForm() {
        loginInput.val("Tester");
        passwordInput.val("Passw0rd");
        confirmPasswordInput.val("Passw0rd");
        surnameInput.val("Dimon");
        nameInput.val("Dimon");
        middleNameInput.val("Dimon");
        groupSelect.selectOptionByValue("6063");
        questionSelect.selectOptionByValue("1");
        answerInput.val("Dimon");

        submitButton.click();
    }
}
