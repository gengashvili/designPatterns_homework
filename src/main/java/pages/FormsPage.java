package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class FormsPage {
    public SelenideElement practiseFormLink = $x("//span[contains(@class, 'text') and contains(text(), 'Practice Form')]");
}
