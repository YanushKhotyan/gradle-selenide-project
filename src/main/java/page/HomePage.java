package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement header = $(By.xpath("//img[@title='Care about the students']"));

    public void homePageIsDisplayed(){
        header.shouldBe(Condition.visible);
    }
}
