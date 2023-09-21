package POM_dataPatterns_homework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public SelenideElement
            form = $("#userForm"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            mobileNumberInput = $("#userNumber");

    public SelenideElement genderInput(String gender) {
        return $x("//label[contains(@class, 'custom-control-label') and contains(text(), '"+gender+"')]");
    }

}
