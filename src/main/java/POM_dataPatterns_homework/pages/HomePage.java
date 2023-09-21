package POM_dataPatterns_homework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    public SelenideElement formsLink = $x("//h5[text() = 'Forms']");
}
