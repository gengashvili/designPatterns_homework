package PageFactory_FluentAPI_homework.ClassicPOM;

import PageFactory_FluentAPI_homework.ClassicPOM.steps.*;
import PageFactory_FluentAPI_homework.Common.TestConfig;
import org.testng.annotations.*;


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


    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }
}
