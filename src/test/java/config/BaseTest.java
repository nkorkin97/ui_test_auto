package config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
//        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.pageLoadStrategy = "eager";

    }

    @BeforeEach
    public void beforeEach() {
        open("https://demoqa.com/");
//        open("https://google.com");
    }
}
