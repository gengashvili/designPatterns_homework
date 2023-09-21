package PageFactory_FluentAPI_homework.PageFactory_and_Fluent_API.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class EventsPage {
    private WebDriver driver;

    @FindAll({@FindBy(xpath = "//div[contains(@class, 'movies-deal')]")})
    public List<WebElement> moviesList;

    public EventsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }
}
