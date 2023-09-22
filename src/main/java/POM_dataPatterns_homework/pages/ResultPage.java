package POM_dataPatterns_homework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ResultPage {
    public SelenideElement
            thanksMessage = $("#example-modal-sizes-title-lg"),
            studentName = $x("//tr[td[contains(text(), 'Student Name')]]/td[2]"),
            gender = $x("//tr[td[contains(text(), 'Gender')]]/td[2]"),
            mobileNumber = $x("//tr[td[contains(text(), 'Mobile')]]/td[2]");

}
