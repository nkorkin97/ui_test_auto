package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    public void clickHeader() {
        $("a[href ='https://demoqa.com']")
                .shouldBe(Condition.visible)
                .scrollTo()
                .click();

        Assertions
                .assertThat((WebDriverRunner.getWebDriver().getCurrentUrl()).contentEquals("https://demoqa.com/"));
    }
}
