package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.steps;

import PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.data.MovieData;
import PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.pages.MoviePage;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MovieSteps {
    private WebDriver driver;
    private MoviePage moviePage;

    public MovieSteps (WebDriver driver) {
        this.driver = driver;
        this.moviePage = new MoviePage(driver);
    }

    @Step("choose cavea east point cinema")
    public MovieSteps chooseCaveaEastPointCinema() {
        WebElement caveaLink = moviePage.getCaveaLink();

        Actions actions = new Actions(driver);
        actions.moveToElement(caveaLink).perform();

        caveaLink.click();
        return this;
    }

    @Step("validate ciname name")
    public MovieSteps validateCinemaName() {
        List<WebElement> cinemasOptions = moviePage.getCinemasOptions();

        SoftAssert softAssert = new SoftAssert();

        for (WebElement cinema : cinemasOptions) {
            String cinemaTitle = cinema.findElement(By.xpath("./a/p[contains(@class, 'cinema-title')]")).getText();
            softAssert.assertEquals(cinemaTitle, "კავეა ისთ ფოინთი");
        }
        return this;
    }

    @Step("click on last seanse date")
    public MovieSteps clickOnLastDate() {
        List<WebElement> seanseDates = moviePage.getSeanseDates();
        WebElement lastDate = seanseDates.get(seanseDates.size() - 1);
        lastDate.click();
        return this;
    }

    @Step("click on last cinema option")
    public MovieSteps clickOnLastCinemaOption() {
        List<WebElement> cinemasOptions = moviePage.getLastDayCinemasOptions();
        WebElement lastOption = cinemasOptions.get(cinemasOptions.size() - 1 );
        lastOption.click();
        return this;
    }

    @Step("save movie info for future validation")
    public MovieSteps saveMovieInfo() {
        String movieTitle = moviePage.getMovieNameElement().getText();
        String cinemaTitle = moviePage.
                getLastDayCinemasOptions()
                .get(0).findElement(By.xpath("./a/p[contains(@class, 'cinema-title')]"))
                .getText();
        List<WebElement> seanseDates = moviePage.getSeanseDates();
        String dateTime = seanseDates.get(seanseDates.size() - 1).getText();

        MovieData.setMovieTitle(movieTitle);
        MovieData.setCinemaTitle(cinemaTitle);
        MovieData.setDateTime(dateTime);

        return this;
    }

}
