package stepDefinition;



import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hook {

    @Before
    public void openURL(){
        open("https://educats.bntu.by/Main");
    }
}
