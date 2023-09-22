package PageFactory_FluentAPI_homework.ClassicPOM.pages;

import org.openqa.selenium.*;

public class HomePage {
    WebDriver driver;
    private By kinoLinkBy = By.linkText("კინო");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getKinoLink() {
        return driver.findElement(kinoLinkBy);
    }
}
