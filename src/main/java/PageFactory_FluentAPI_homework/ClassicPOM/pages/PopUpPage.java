package PageFactory_FluentAPI_homework.ClassicPOM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PopUpPage {
    WebDriver driver;
    private By popUpMovieInfoContainer = By.xpath("//div[@class = 'right-content']/div[@class = 'content-header']");
    private By popUpMovieTitleBy = By.xpath("./p[@class = 'movie-title']");
    private By popUpCinemaTitleBy = By.xpath("./p[@class = 'movie-cinema']");
    private By popUpDateTimeBy = By.xpath("./p[@class = 'movie-cinema'][2]");
    private By vacantPlacesBy = By.xpath("//div[@class = 'seat free']");

    public PopUpPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getPopUpMovieTitleElement() {
        return driver.findElement(popUpMovieInfoContainer).findElement(popUpMovieTitleBy);
    }

    public WebElement getPopUpCinemaTitleElement() {
        return driver.findElement(popUpMovieInfoContainer).findElement(popUpCinemaTitleBy);
    }

    public WebElement getPopUpDateTimeElement() {
        return driver.findElement(popUpMovieInfoContainer).findElement(popUpDateTimeBy);
    }

    public List<WebElement> getVacantPlaces() {
        return driver.findElements(vacantPlacesBy);
    }
}
