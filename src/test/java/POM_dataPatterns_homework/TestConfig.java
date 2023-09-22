package POM_dataPatterns_homework;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Configuration.*;

public class TestConfig {

    @BeforeSuite
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        browserCapabilities = options;
        browserSize = null;
        timeout = 10000;
    }

}
