package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API;

import PageFactory_FluentAPI_homework.Common.ScreenshotListener;
import PageFactory_FluentAPI_homework.Common.TestConfig;
import PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.steps.*;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Epic("swoop test")
@Feature("swoop web site test feature")
@Listeners({ScreenshotListener.class})
public class SwoopTest extends TestConfig{

    @Test(description = "swoop test main method")
    @Description(
            "open swoop, navigate to movies page, \n" +
            "select first movie that has cavea east point cinema option,\n" +
            "choose last date, last cinema and choose vacant place.\n" +
            "in last validate popup and real movie data")
    @Story("test to validate swoop story")
    @Severity(SeverityLevel.BLOCKER)
    public void swoopTest() {
        HomeSteps homeSteps = new HomeSteps(driver);
        EventsSteps eventsSteps = new EventsSteps(driver);
        MovieSteps movieSteps = new MovieSteps(driver);
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        driver.get("https://www.swoop.ge/");

        homeSteps.navigateToEventsPage();

        eventsSteps.selectAndClickOnFirstMovie("cavea-istFointi");

        movieSteps
                .chooseCaveaEastPointCinema()
                .validateCinemaName()
                .clickOnLastDate()
                .clickOnLastCinemaOption()
                .saveMovieInfo();

        popUpSteps
                .validatePopUpMovieInfo()
                .chooseVacantPlace();

    }

}
