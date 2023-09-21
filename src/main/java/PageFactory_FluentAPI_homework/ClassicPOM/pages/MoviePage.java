package PageFactory_FluentAPI_homework.ClassicPOM.pages;

import org.openqa.selenium.*;

import java.util.List;

public class MoviePage {
    WebDriver driver;
    private By cinemaLinkBy = By.xpath("//li[@role='tab']/a[text()='კავეა ისთ ფოინთი']");
    private By cinemasContainer = (By.xpath("//div[contains(@class, 'all-cinemas')]"));
    private By cinemasOptionsBy = By.xpath("./div[@aria-hidden = 'false']/div/div[@aria-hidden = 'false']");
    private By seanseDatesBy = By.xpath("./div[@aria-hidden = 'false']/div/ul[@role = 'tablist']/li");
    private By lastDayCinemasOptionsBy = By.xpath("./div[@aria-hidden = 'false']/div/div[@aria-hidden = 'false']");
    private By movieNameBy = By.xpath("//div[@class='info']/p[@class='name']");


    public MoviePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCaveaLink() {
        return driver.findElement(cinemaLinkBy);
    }

    public List<WebElement> getCinemasOptions() {
        return driver.findElement(cinemasContainer).findElements(cinemasOptionsBy);
    }

    public List<WebElement> getSeanseDates() {
        return driver.findElement(cinemasContainer).findElements(seanseDatesBy);
    }

    public List<WebElement> getLastDayCinemasOptions() {
        return driver.findElement(cinemasContainer).findElements(lastDayCinemasOptionsBy);
    }

    public WebElement getMovieNameElement() {
        return driver.findElement(movieNameBy);
    }

}
