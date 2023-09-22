package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API;

import PageFactory_FluentAPI_homework.Common.TestConfig;
import PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.steps.*;
import org.testng.annotations.Test;

public class SwoopTest extends TestConfig {

    @Test
    public void swoopTest() {
        HomeSteps homeSteps = new HomeSteps(driver);
        EventsSteps eventsSteps = new EventsSteps(driver);
        MovieSteps movieSteps = new MovieSteps(driver);
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        driver.get("https://www.swoop.ge/");

        homeSteps.navigateToEventsPage();

        eventsSteps.selectAndClickOnFirstMovie();

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
