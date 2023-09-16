package steps;

import io.qameta.allure.Step;
import pages.FormsPage;

public class FormsSteps {
    FormsPage formsPage = new FormsPage();
    @Step
    public void navigateToPractiseForm() {
        formsPage.practiseFormLink.click();
    }
}
