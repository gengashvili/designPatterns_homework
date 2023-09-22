package PageFactory_FluentAPI_homework.ClassicPOM.steps;

import PageFactory_FluentAPI_homework.ClassicPOM.pages.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    WebDriver driver;

    public HomeSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void navigateToEventsPage() {
        HomePage homePage = new HomePage(driver);
        homePage.getKinoLink().click();
    }
}
