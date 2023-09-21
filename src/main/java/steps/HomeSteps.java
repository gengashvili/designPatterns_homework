package steps;

import io.qameta.allure.Step;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage();
    @Step
    public void navigateToForms() {
        homePage.formsLink.click();
    }
}
