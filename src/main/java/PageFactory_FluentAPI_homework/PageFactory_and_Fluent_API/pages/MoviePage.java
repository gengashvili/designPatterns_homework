package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;


public class MoviePage {
    private WebDriver driver;
    private final String containerPath = "//div[contains(@class, 'all-cinemas')]";

    @FindBy(xpath = "//li[@role='tab']/a[text()='კავეა ისთ ფოინთი']")
    private WebElement cinemaLink;

    @FindAll({@FindBy(xpath =  containerPath + "/div[@aria-hidden = 'false']/div/div[@aria-hidden = 'false']")})
    private List<WebElement> cinemasOptions;

    @FindAll({@FindBy(xpath = containerPath + "/div[@aria-hidden = 'false']/div/ul[@role = 'tablist']/li"),})
    private List<WebElement> seanseDates;

    @FindAll({@FindBy(xpath = containerPath + "/div[@aria-hidden = 'false']/div/div[@aria-hidden = 'false']")})
    private List<WebElement> lastDayCinemasOptions;

    @FindBy(xpath = "//div[@class='info']/p[@class='name']")
    private WebElement movieNameElement;


    public MoviePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public WebElement getCaveaLink() {
        return cinemaLink;
    }

    public List<WebElement> getCinemasOptions() {
        return cinemasOptions;
    }

    public List<WebElement> getSeanseDates() {
        return seanseDates;
    }

    public List<WebElement> getLastDayCinemasOptions() {
        return lastDayCinemasOptions;
    }

    public WebElement getMovieNameElement() {
        return movieNameElement;
    }
}
