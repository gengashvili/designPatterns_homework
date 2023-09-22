package POM_dataPatterns_homework.steps;

import io.qameta.allure.Step;
import POM_dataPatterns_homework.pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage();
    @Step
    public void navigateToForms() {
        homePage.formsLink.click();
    }
}
