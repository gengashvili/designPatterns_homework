package PageFactory_FluentAPI_homework.ClassicPOM.pages;

import org.openqa.selenium.*;

import java.util.List;

public class EventsPage {
    WebDriver driver;
    public EventsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getMoviesList() {
        return driver.findElements(By.xpath("//div[contains(@class, 'movies-deal')]"));
    }
}
