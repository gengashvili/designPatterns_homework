package POM_dataPatterns_homework.steps;

import io.qameta.allure.Step;
import POM_dataPatterns_homework.pages.FormsPage;

public class FormsSteps {
    FormsPage formsPage = new FormsPage();
    @Step
    public void navigateToPractiseForm() {
        formsPage.practiseFormLink.click();
    }
}
