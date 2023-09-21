package POM_dataPatterns_homework.steps;

import io.qameta.allure.Step;
import POM_dataPatterns_homework.pages.ResultPage;

import static com.codeborne.selenide.Condition.*;

public class ResultSteps {
    ResultPage resultPage = new ResultPage();

    @Step
    public void checkThanksMessageVisibility() {
         resultPage.thanksMessage.should(visible);
    }
    @Step
    public String getStudentName() {
        return resultPage.studentName.getText();
    }

    @Step
    public String getGender() {
        return resultPage.gender.getText();
    }

    @Step
    public String getMobileNumber() {
        return resultPage.mobileNumber.getText();
    }

}
