package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.steps;

import PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.pages.EventsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


import java.util.List;

public class EventsSteps {
    WebDriver driver;
    EventsPage eventsPage;

    public EventsSteps(WebDriver driver) {
        this.driver = driver;
        this.eventsPage = new EventsPage(driver);
    }


    @Step("select first movie that has : {cinemaName} cinema and click it")
    public EventsSteps selectAndClickOnFirstMovie(String cinemaName) {
        List<WebElement> moviesList = eventsPage.moviesList;

        Actions actions = new Actions(driver);

        boolean foundMovie = false;
        for (WebElement movie : moviesList) {

            List<WebElement> movieLogos = movie.findElements(By.xpath(".//div[@class='movie-logos']//img"));

            for (WebElement logo : movieLogos) {
                if (logo.getAttribute("src").contains(cinemaName)) {

                    actions.moveToElement(movie).perform();
                    WebElement buyButton = movie.findElement(By.xpath(".//div[@class='cinema-hover']/a[div[@class='info-cinema-ticket']]"));
                    buyButton.click();

                    foundMovie = true;
                    break;
                }
            }

            if (foundMovie) {
                break;
            }
        }
        return this;
    }
}

