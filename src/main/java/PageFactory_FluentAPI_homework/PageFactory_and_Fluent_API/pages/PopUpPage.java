package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class PopUpPage {
    private WebDriver driver;
    private final String popUpMovieInfoContainer = "//div[@class = 'right-content']/div[@class = 'content-header']";

    @FindBy(xpath =  popUpMovieInfoContainer + "/p[@class = 'movie-title']")
    private WebElement movieTitle;

    @FindBy(xpath =  popUpMovieInfoContainer + "/p[@class = 'movie-cinema']")
    private WebElement cinemaTitle;

    @FindBy(xpath =  popUpMovieInfoContainer + "/p[@class = 'movie-cinema'][2]")
    private WebElement dateTime;

    @FindAll({@FindBy(xpath = "//div[@class = 'seat free']")})
    private List<WebElement> vacantPlaces;


    public PopUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public WebElement getMovieTitle() {
        return movieTitle;
    }

    public WebElement getCinemaTitle() {
        return cinemaTitle;
    }

    public WebElement getDateTime() {
        return dateTime;
    }

    public List<WebElement> getVacantPlaces() {
        return vacantPlaces;
    }

}
