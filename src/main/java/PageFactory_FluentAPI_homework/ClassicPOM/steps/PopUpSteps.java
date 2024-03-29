package PageFactory_FluentAPI_homework.ClassicPOM.steps;

import PageFactory_FluentAPI_homework.ClassicPOM.data.MovieData;
import PageFactory_FluentAPI_homework.ClassicPOM.pages.PopUpPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PopUpSteps {
    WebDriver driver;
    PopUpPage popUpPage;

    public PopUpSteps(WebDriver driver) {
        this.driver = driver;
        this.popUpPage = new PopUpPage(driver);
    }

    @Step
    public PopUpSteps validatePopUpMovieInfo() {

        String popUpMovieTitle = popUpPage.getPopUpMovieTitleElement().getText();
        String popUpCinemaTitle = popUpPage.getPopUpCinemaTitleElement().getText();
        String popUpDateTime = popUpPage.getPopUpDateTimeElement().getText();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(MovieData.getMovieTitle(), popUpMovieTitle);
        softAssert.assertEquals(MovieData.getCinemaTitle(), popUpCinemaTitle);
        softAssert.assertEquals(extractDay(MovieData.getDateTime()), extractDay(popUpDateTime));

        return this;
    }

    @Step
    public PopUpSteps chooseVacantPlace() {
        popUpPage.getVacantPlaces().get(0).click();
        return this;
    }

    public static String extractDay(String dateText) {
        Pattern pattern = Pattern.compile("(\\d+)\\s");
        Matcher matcher = pattern.matcher(dateText);

        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return null;
        }
    }
}
