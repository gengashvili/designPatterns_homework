package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.steps;

import PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.pages.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    private WebDriver driver;
    private HomePage homePage;

    public HomeSteps(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(driver);
    }

    @Step("navigate to events page")
    public HomeSteps navigateToEventsPage() {
        homePage.kinoLink.click();
        return this;
    }
}


