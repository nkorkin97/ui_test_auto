package config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.webdriver.DriverFactory;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static constants.Group.ELEMENTS;

public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10_000;
        Configuration.headless = false;
        Configuration.pageLoadStrategy = "eager";
//        Configuration.remote = "http://localhost:4444/wd/hub";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true));
    }

    @BeforeEach
    public void beforeEach() {
        if (!WebDriverRunner.hasWebDriverStarted()) {
            open("https://demoqa.com/");
            App.homePage.selectElementsGroup(ELEMENTS);
        }
    }

    @AfterAll
    public static void afterAll() {
        Selenide.closeWebDriver();
    }
}
